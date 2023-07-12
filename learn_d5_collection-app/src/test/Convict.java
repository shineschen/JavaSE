package test;

/**
 * convict类
 */
public class Convict {
    private String id;
    private String name;
    private String gender;
    private String penalty;   // 刑罚
    private String imprisonment;  //刑期

    private int position;  // 位置

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public Convict() {
    }

    public Convict(String id, String name, String gender, String penalty, String imprisonment, int position) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.penalty = penalty;
        this.imprisonment = imprisonment;
        this.position = position;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPenalty() {
        return penalty;
    }

    public void setPenalty(String penalty) {
        this.penalty = penalty;
    }

    public String getImprisonment() {
        return imprisonment;
    }

    public void setImprisonment(String imprisonment) {
        this.imprisonment = imprisonment;
    }

    @Override
    public String toString() {
        return "姓名："+getName()+"性别："+getGender();
    }
}
