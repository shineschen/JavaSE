package thread_communication;

import java.util.ArrayList;
import java.util.List;


public class Desk {
    private List<String> list = new ArrayList<>();


    //负责放一个数据
    //生产1 ，生产2，生产3
    public synchronized void put() {

        try {
            String name = Thread.currentThread().getName();
            //判断是否有数据
            if (list.size() == 0) {
                list.add(name + "生产的文本数据");
                System.out.println(name + "生产了一条数据~");
                Thread.sleep(2000);

                //唤醒别人，等待自己
                this.notifyAll();
                this.wait();
            } else {
                //有数据未消费，不生产。 唤醒别人，等待自己
                this.notifyAll();
                this.wait();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    //负责取一个数据
    //消费1，消费2
    public synchronized void get() {
        try {
            String name = Thread.currentThread().getName();
            if (list.size() == 1) {
                //有数据，消费了
                System.out.println(name + "消费了" + list.get(0));
                list.clear();
                Thread.sleep(1000);
                this.notifyAll();
                this.wait();
            } else {
                //没有数据
                this.notifyAll();
                this.wait();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
