package thread_communication;

public class TreadDemo {
    public static void main(String[] args) {
        // 需求 ：三个生产者线程 ，负责生产 ，每次一个线程只能生产一个 放在桌子上
        // 2个消费着线程，每个线程每次只能从桌子上消费一个
        Desk desk = new Desk();

        //创建 3个生产线程
        new Thread(() -> {
            while (true) {
                desk.put();
            }
        },"生产线程1").start();

        new Thread(() -> {
            while (true) {
                desk.put();
            }
        },"生产线程2").start();

        new Thread(() -> {
            while (true) {
                desk.put();
            }
        },"生产线程3").start();

        //创建俩个消费线程
        new Thread(() -> {
            while (true) {
                desk.get();
            }
        },"消费线程1").start();

        new Thread(() -> {
            while (true) {
                desk.get();
            }
        },"消费线程2").start();



    }
}
