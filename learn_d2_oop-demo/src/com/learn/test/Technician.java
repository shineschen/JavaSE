package com.learn.test;


import java.util.ArrayList;
import java.util.List;

public class Technician {
    private String name;
    private List<ServiceProject> projects;
    private boolean[] workTime; // 工作时间表

    public Technician(String name) {
        this.name = name;
        this.projects = new ArrayList<>();
        this.workTime = new boolean[48];
    }

    public String getName() {
        return name;
    }

    public List<ServiceProject> getProjects () {
        return projects;
    }

    public boolean isAvailable(DateTime dateTime) {
        return workTime[dateTime.slot];
    }

    public void setAvailable(DateTime dateTime, boolean available) {
        workTime[dateTime.slot] = available;
    }

    public boolean addProject(ServiceProject project) {
        if (projects.contains(project)) return false;
        projects.add(project);
        project.setTechnician(this);
        return true;
    }

    public boolean removeProject(ServiceProject project) {
        if (!projects.contains(project)) return false;
        projects.remove(project);
        project.setTechnician(null);
        return true;
    }

    @Override
    public String toString() {
        return name;
    }
}
