package com.learn.test;


public class ServiceProject {
    private String name;
    private int duration; // 服务时长，单位：半小时
    private Technician technician;

    public ServiceProject(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    public Technician getTechnician() {
        return technician;
    }

    public void setTechnician(Technician technician) {
        this.technician = technician;
    }
}
