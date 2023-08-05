package thread_api;

import learn_create_thread.MyCallable;

public class Mythread extends Thread{

    public Mythread(String name){
        super(name);  // 为当前线程设置名字
    }
    @Override
    public void run() {
        Thread t = Thread.currentThread();
        for (int i = 0; i <= 5; i++) {
            System.out.println(t.getName()+"输出：" + i);
        }
    }
}
