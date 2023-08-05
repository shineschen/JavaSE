/**
 * 创建线程方式二：实现Runnable接口
 * 优点 ： 任务类只是实现接口，可以继承其他类，实现其他接口，扩展性强
 */
package learn_create_thread;

//定义一个任务类，实现runnable接口
public class MyRunnable implements Runnable{

    //重写runnable的run方法
    @Override
    public void run() {
        //线程执行的任务
        for (int i = 0; i <= 5; i++) {
            System.out.println("子线程输出：" + i);
        }
    }
}
