package thread_safe;

/**
 * 账户类
 */
public class Account {
    private String id;
    private double money;  //余额


    public Account(){

    }
    public Account( String id,double money) {
        this.money = money;
        this.id = id;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void drawMoney(double money) {
        //搞清楚是哪个线程来取钱
        String name = Thread.currentThread().getName();
        if (this.money >= money){
            System.out.println("账户余额：" + this.money);
            System.out.println(name+"来取钱，成功！");
            this.money -= money;
            System.out.println(name + "取钱后，账户余额："+ this.money);
        }else {
            System.out.println("账户余额：" + this.money);
            System.out.println(name+"来取钱，余额不足！");
        }
    }
}
