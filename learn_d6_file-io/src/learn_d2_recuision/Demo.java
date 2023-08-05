package learn_d2_recuision;

/**
 * 啤酒 2 一瓶 ， 4个盖子可以换一瓶 ，俩个空瓶可以换一瓶
 */
public class Demo {

    public static int totalNumber;  // 总酒数
    public static int lastBottleNumber;  // 剩余瓶子数
    public static int lastCoverNumber;   // 剩余盖子数
    public static void main(String[] args) {

        buy(10);
        System.out.println("总酒数：" + totalNumber);
        System.out.println("剩余瓶子数：" + lastBottleNumber);
        System.out.println("剩余盖子数" + lastCoverNumber);
    }


    public static void buy(int money){
        // 买到的啤酒数量
        int buyNumber = money / 2 ;
        totalNumber += buyNumber;

        // 把瓶子和盖子换算成钱继续买
        // 计算本轮总瓶子数和盖子数
        int allBottleNumber = buyNumber + lastBottleNumber ;
        int allCoverNumber = buyNumber + lastCoverNumber;

        int allMoney = 0;

        if (allBottleNumber >=2 ){
            allMoney += (allBottleNumber / 2 ) * 2;
        }
        lastBottleNumber = allBottleNumber % 2;


        if (allCoverNumber >=4){
            allMoney += (allCoverNumber /4) *2;
        }
        lastCoverNumber = allCoverNumber % 4;

        if (allMoney >= 2 ){
            buy(allMoney);
        }




    }
}
