package learn_create_thread;

/**
 *
 *
 */
public class ThreadDemo  {
    // main方法是由一条默认的主线程负责执行
    public static void main(String[] args) {
        //创建线程类的对象
        Thread t = new Mythread();
        //启动子线程
        t.start();

        for (int i = 0; i <= 5; i++) {
            System.out.println("main主线程输出：" + i);
        }

    }
}
