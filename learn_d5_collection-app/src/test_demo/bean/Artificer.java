package test_demo.bean;

import java.util.ArrayList;

public class Artificer {
    private String name;   // 技师姓名
    private String id;
    private String avatar;   // 头像
    private ArrayList<Server> servers ;   // 已绑定的项目

    public Artificer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public ArrayList<Server> getServers() {
        return servers;
    }

    public void setServers(ArrayList<Server> servers) {
        this.servers = servers;
    }
}
