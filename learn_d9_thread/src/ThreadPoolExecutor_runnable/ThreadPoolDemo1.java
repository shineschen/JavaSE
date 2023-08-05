package ThreadPoolExecutor_runnable;

import java.util.concurrent.*;

/**
 * 线程池的创建方法
 */
public class ThreadPoolDemo1 {
    public static void main(String[] args) {
        // 通过ThreadPoolExecutor 创建一个线程池对象
//        public ThreadPoolExecutor(int corePoolSize,  //核心线程数量
//        int maximumPoolSize,  //最大线程数量
//        long keepAliveTime,  //临时线程的存活时间
//        TimeUnit unit,     // 存活时间单位
//        BlockingQueue<Runnable> workQueue,  //任务队列
      //  LinkedBlockingQueue //基于链表实现，不限制大小
        // ArrayBlockingQueue   基于数组实现，可限制大小
//        ThreadFactory threadFactory, //线程工厂  负责为线程池创建线程
      //  Executors.defaultThreadFactory() // 获取一个默认的线程工厂
//        RejectedExecutionHandler handler)   //任务拒绝策略
        ExecutorService pool = new ThreadPoolExecutor(3, 5, 8, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(4), Executors.defaultThreadFactory(), new ThreadPoolExecutor.CallerRunsPolicy());

        MyRunnable myRunnable = new MyRunnable();
        pool.execute(myRunnable);  //线程池会自动创建一个新线程，自动处理这个任务，自动执行
        pool.execute(myRunnable);  //线程池会自动创建一个新线程，自动处理这个任务，自动执行
        pool.execute(myRunnable);  //线程池会自动创建一个新线程，自动处理这个任务，自动执行
        pool.execute(myRunnable);
        pool.execute(myRunnable);
        pool.execute(myRunnable);
        pool.execute(myRunnable);

        //会创建临时线程
        pool.execute(myRunnable);
        pool.execute(myRunnable);
        //拒绝策略
        pool.execute(myRunnable);


       // pool.shutdown();  //等待线程池的任务全部执行完毕后再关闭线程池
       // pool.shutdownNow(); //立即关闭线程池，不论任务是否执行完毕


    }
}
