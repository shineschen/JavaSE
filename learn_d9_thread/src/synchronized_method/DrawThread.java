package synchronized_method;

public class DrawThread extends Thread{
    private Account acc;
    public DrawThread(){

    }
    public DrawThread(String name, Account acc){
        super(name);
        this.acc = acc;
    }


    @Override
    public void run() {
        //取钱
        acc.drawMoney(100000);
    }
}
