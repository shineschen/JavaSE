package com.learn.test;


import java.util.ArrayList;
import java.util.List;

public class ReservationSystem {
    private List<ServiceProject> projects;
    private List<Technician> technicians;

    public ReservationSystem() {
        this.projects = new ArrayList<>();
        this.technicians = new ArrayList<>();
    }

    public List<ServiceProject> getServiceProjects() {
        return projects;
    }

    public List<Technician> getTechnicians() {
        return technicians;
    }

    public boolean makeReservation(ServiceProject project, Technician technician, DateTime dateTime) {
        if (project.getTechnician() != null || !technician.isAvailable(dateTime)) {
            return false;
        }
        // 判断后续的时间段是否可用
        for (int i = 0; i < project.getDuration(); i++) {
            if (!technician.isAvailable(dateTime.plusSlots(i))) {
                return false;
            }
        }
        // 更新技师的工作时间
        for (int i = 0; i < project.getDuration(); i++) {
            technician.setAvailable(dateTime.plusSlots(i), false);
        }
        project.setTechnician(technician);
        return true;
    }

    public boolean addServiceProject(ServiceProject project) {
        if (projects.contains(project)) return false;
        projects.add(project);
        return true;
    }

    public boolean removeServiceProject(ServiceProject project) {
        if (!projects.contains(project)) return false;
        projects.remove(project);
        if (project.getTechnician() != null) {
            project.getTechnician().removeProject(project);
            project.setTechnician(null);
        }
        return true;
    }

    public boolean addTechnician(Technician technician) {
        if (technicians.contains(technician)) return false;
        technicians.add(technician);
        return true;
    }

    public boolean removeTechnician(Technician technician) {
        if (!technicians.contains(technician)) return false;
        for (ServiceProject project : technician.getProjects()) {
            project.setTechnician(null);
        }
        technicians.remove(technician);
        return true;
    }
}
