package com.learn.test;

import java.util.*;

public class Service {
    private String name;
    private int duration; // 单位：半小时
    private Map<String, boolean[]> scheduleMap; // 技师的可预约时间表，key为技师姓名，value为技师的可预约时间表

    public Service(String name, int duration) {
        this.name = name;
        this.duration = duration;
        this.scheduleMap = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    public void addTechnician(String name) {
        // 初始化技师的可预约时间表，全部设置为可预约
        boolean[] schedule = new boolean[48];
        for (int i = 0; i < 48; i++) {
            schedule[i] = true;
        }
        scheduleMap.put(name, schedule);
    }

    public List<String> getAvailableTechnicians(int startTime) {
        List<String> technicians = new ArrayList<>();
        for (String technician : scheduleMap.keySet()) {
            boolean[] schedule = scheduleMap.get(technician);
            boolean isAvailable = true;
            for (int i = startTime; i < startTime + duration; i++) {
                if (!schedule[i]) {
                    isAvailable = false;
                    break;
                }
            }
            if (isAvailable) {
                technicians.add(technician);
            }
        }
        return technicians;
    }

    public void reserve(String technician, int startTime) {
        boolean[] schedule = scheduleMap.get(technician);
        for (int i = startTime; i < startTime + duration; i++) {
            schedule[i] = false; // 标记为不可预约
        }
    }

    public static void main(String[] args) {

            Service hairCut = new Service("Hair Cut", 2);

            hairCut.addTechnician("张三");
            hairCut.addTechnician("李四");
            hairCut.addTechnician("王五");

            List<String> availableTechnicians = hairCut.getAvailableTechnicians(24);
            System.out.println("Available technicians at 12:00: " + availableTechnicians);

            Appointment appointment1 = new Appointment("John", hairCut, "Bob", 24);
            Appointment appointment2 = new Appointment("Mary", hairCut, "Cathy", 26);

            List<String> availableTechnicians2 = hairCut.getAvailableTechnicians(24);
            System.out.println("Available technicians at 12:00: " + availableTechnicians2);
        }
    }

class Appointment {
    private String name;
    private Service service;
    private String technician;
    private int startTime; // 单位：半小时

    public Appointment(String name, Service service, String technician, int startTime) {
        this.name = name;
        this.service = service;
        this.technician = technician;
        this.startTime = startTime;
        service.reserve(technician, startTime);
    }

    public String getName() {
        return name;
    }

    public String getServiceName() {
        return service.getName();
    }

    public int getDuration() {
        return service.getDuration();
    }

    public String getTechnician() {
        return technician;
    }

    public int getStartTime() {
        return startTime;
    }

    public int getEndTime() {
        return startTime + service.getDuration();
    }
}



