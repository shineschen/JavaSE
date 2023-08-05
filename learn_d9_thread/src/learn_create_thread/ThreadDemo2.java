package learn_create_thread;

/**
 * 匿名内部类创建线程方式二：实现Runnable接口
 */
public class ThreadDemo2 {
    public static void main(String[] args) {

        // 直接创建runnable接口的匿名内部类
        Runnable r = () -> {
            for (int i = 0; i <= 5; i++) {
                System.out.println("线程1输出：" + i);
            }
        };
        new Thread(r).start();


        new Thread(() -> {
            for (int i = 0; i <= 5; i++) {
                System.out.println("线程2输出：" + i);
            }
        }).start();


        for (int i = 0; i <= 5; i++) {
            System.out.println("主线程输出：" + i);
        }
}
}
