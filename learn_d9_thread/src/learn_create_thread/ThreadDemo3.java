package learn_create_thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 多线程的第三种创建方式 ： 利用Callable接口 。FutureTask类实现
 *
 */
public class ThreadDemo3 {
    public static void main(String[] args) {
        // 创建一个Callable对象
        MyCallable myCallable = new MyCallable(100);

        MyCallable myCallable1 = new MyCallable(200);

        // 把callable对象封装成futureTask(未来任务)对象
        FutureTask<String> task = new FutureTask<>(myCallable);
        FutureTask<String> task1 = new FutureTask<>(myCallable1);
        //创建线程对象，把未来任务对象交给线程对象处理
        new Thread(task).start();
        new Thread(task1).start();

        //获取线程执行完毕后返回的结果]
        try {
            String rs = task.get();
            String rs1 = task1.get();
            System.out.println(rs);
            System.out.println(rs1);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }


}
