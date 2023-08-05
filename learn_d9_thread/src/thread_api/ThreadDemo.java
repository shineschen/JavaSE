package thread_api;

/**
 * thread常用方法
 */
public class ThreadDemo {
    public static void main(String[] args) {
        Thread t = new Mythread("1号线程");
        t.start();
        System.out.println(t.getName());

        Thread t1 = new Mythread("2号线程");
        t1.start();
        System.out.println(t1.getName());
        // 主线程对象的名字
        //哪个线程执行它 ，它就会得到哪个线程对象
        Thread m = Thread.currentThread();
        m.setName("主线程");
        System.out.println(m.getName());   //main

        for (int i = 0; i <= 5; i++) {
            System.out.println("主线程输出：" + i);
        }


    }
}
