package thread_api;

/**
 * sleep方法 ，join方法
 */
public class ThreadDemo2 {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
            if (i==3){
                //当前执行的线程，暂停 5秒，再继续执行
                Thread.sleep(5000);
            }
        }


        //join方法：让当前调用这个方法的线程先执行完
        Thread t1 = new Mythread("1号线程");
        t1.start();
        t1.join();
        Thread t2 = new Mythread("2号线程");
        t2.start();
        t2.join();
        Thread t3 = new Mythread("3号线程");
        t3.start();
        t3.join();



    }
}
