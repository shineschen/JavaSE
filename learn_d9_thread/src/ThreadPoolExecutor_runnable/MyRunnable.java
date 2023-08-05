package ThreadPoolExecutor_runnable;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name +"输出-----》666");
        try {
            Thread.sleep(Integer.MAX_VALUE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
