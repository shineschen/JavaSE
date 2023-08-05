package ThreadPoolExecutor_callable;

import java.util.concurrent.*;

public class ThreadPoolDemo {
    public static void main(String[] args) throws Exception {
//        ExecutorService pool = new ThreadPoolExecutor(3, 5, 8, TimeUnit.SECONDS,
//                new ArrayBlockingQueue<>(4), Executors.defaultThreadFactory(), new ThreadPoolExecutor.CallerRunsPolicy());

        //通过Executors创建一个线程池对象
        ExecutorService pool = Executors.newFixedThreadPool(3);
        ExecutorService pool1 = Executors.newSingleThreadExecutor();

        Future<String> f1 = pool1.submit(new MyCallable(100));
        Future<String> f2 = pool1.submit(new MyCallable(200));
        Future<String> f3 = pool1.submit(new MyCallable(300));
        Future<String> f4 = pool1.submit(new MyCallable(400));

        System.out.println(f1.get());
        System.out.println(f2.get());
        System.out.println(f3.get());
        System.out.println(f4.get());

    }
}
