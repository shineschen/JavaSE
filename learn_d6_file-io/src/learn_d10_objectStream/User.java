package learn_d10_objectStream;

import java.io.Serializable;

/**
 * 对象如果需要序列化，必须实现序列化接口
 */
public class User implements Serializable {
    private String name;
    private int age;

    // 加入transient，该成员变量将不参与序列化
    private transient String password;

    public User(){

    }

    public User(String name, int age, String password) {
        this.name = name;
        this.age = age;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", password='" + password + '\'' +
                '}';
    }
}
