package test_demo.bean;

import java.util.ArrayList;

/**
 * 服务类
 */

public class Server {
    private String name;
    private int time;
    private String id;
    private ArrayList<Artificer> artificers;  // 已绑定的技师

    public Server() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Artificer> getArtificers() {
        return artificers;
    }

    public void setArtificers(ArrayList<Artificer> artificers) {
        this.artificers = artificers;
    }
}
