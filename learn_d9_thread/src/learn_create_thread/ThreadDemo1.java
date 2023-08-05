package learn_create_thread;

/**
 * 创建线程方式二：实现Runnable接口
 */
public class ThreadDemo1 {
    public static void main(String[] args) {
        //创建任务对象
        //把任务对象交给线程对象处理
        Thread t = new Thread(new MyRunnable());
        t.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("主线程main输出：" + i);
        }
    }
}
