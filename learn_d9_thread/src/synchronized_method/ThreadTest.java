package synchronized_method;

/**
 * 线程安全问题：synchronized关键字 同步方法解决线程安全问题
 */
public class ThreadTest {

    public static void main(String[] args) {

        //创建一个账户对象，代表俩人的共享账户
        Account acc = new Account("ICBC-001",100000);

        //创建俩个线程分别代表俩个人再去同一个账户对象中取钱
        new DrawThread("小明",acc).start();
        new DrawThread("小红",acc).start();
    }

}
