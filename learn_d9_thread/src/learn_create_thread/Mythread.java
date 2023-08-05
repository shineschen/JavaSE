package learn_create_thread;

/**
 * 创建线程 ： 继承thread类
 *  1. 必须继承thread类
 *  2. 必须重写run方法
 *  缺点 ： 单继承 不利于功能扩展
 */
public class Mythread extends Thread{
    //重写run方法

    @Override
    public void run() {
        //线程的执行任务
        for (int i = 0; i <= 5; i++) {
            System.out.println("MyThread子线程输出：" +i);
        }
    }
}
