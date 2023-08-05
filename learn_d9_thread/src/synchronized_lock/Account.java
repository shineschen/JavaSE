package synchronized_lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 账户类
 */
public class Account {
    private String id;
    private double money;  //余额

    //创建一个锁对象
    private final Lock lk = new ReentrantLock();   //使用final修饰，不允许替换


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
        lk.lock(); // 加锁
        try {
            if (this.money >= money){
                System.out.println("账户余额：" + this.money);
                System.out.println(name+"来取钱，成功！");
                this.money -= money;
                System.out.println(name + "取钱后，账户余额："+ this.money);
            }else {
                System.out.println("账户余额：" + this.money);
                System.out.println(name+"来取钱，余额不足！");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {           //确保解锁操作
            lk.unlock(); // 解锁
        }

    }
}
