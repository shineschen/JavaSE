package ThreadPoolExecutor_callable;

import java.util.concurrent.Callable;

//让这个类实现callable接口
public class MyCallable implements Callable<String>{


    private int n;

    public MyCallable(int n ){
        this.n = n;
    }

    //重写call方法
    @Override
    public String call() throws Exception {
      //描述线程的任务，返回线程执行的结果
        //求 1- n 的和
        int sum = 0;
        for (int i = 0; i <= n ; i++) {
            sum+=i;
        }
        return Thread.currentThread().getName()+ "求出了 1 ~" + n + "的和是：" + sum;
    }
}
