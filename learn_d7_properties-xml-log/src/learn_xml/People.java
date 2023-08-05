package learn_xml;

public class People {
    private String name;
    private double score;
    private String password;


    public People() {

    }

    public People(String name, double score, String password) {
        this.name = name;
        this.score = score;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
