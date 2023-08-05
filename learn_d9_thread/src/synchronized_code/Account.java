package synchronized_code;

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

    public static void test(){
        synchronized (Account.class){  //静态方法应该用类名.class作为锁

        }

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
        synchronized (this) {    //官方建议 实例方法使用this作为锁 ，this正好代表实例资源
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
}
