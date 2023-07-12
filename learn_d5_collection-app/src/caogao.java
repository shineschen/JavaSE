import com.sun.org.apache.xpath.internal.operations.Neg;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

// double itemMoney = 1494;    //项目金额
//        double carMoney = 35.46;    //车费
//        double totalAmount = itemMoney+carMoney;  // 总额
//
//        double artificerDivide = sc.nextDouble();  // 技师分成比例
//
//        double artificerPredict = itemMoney * artificerDivide;  // 技师预计收益
//
//        double artChannel = 122.01;   // 技师渠道费扣款
//
//        double serverChannel = 41.57;  // 技师服务费扣款
//        double artificerDeduction =  artificerPredict + artChannel;   //技师合计扣费 = 渠道费扣款 + 服务费
//
//        double artMoney = 917.68;   // 技师实际所得
public class caogao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入项目金额：");
        BigDecimal item = new BigDecimal(sc.next());  //项目金额
        System.out.println("请输入车费金额：");
        BigDecimal car = new BigDecimal(sc.next());  // 车费
        System.out.println("请输入技师分成比例：");
        BigDecimal divide = new BigDecimal(sc.next()); // 技师分成比例
        System.out.println("请输入渠道分成比例：");
        BigDecimal qudao = new BigDecimal(sc.next()); // 渠道分成比例
        System.out.println("请输入服务费分成比例：");
        BigDecimal server = new BigDecimal(sc.next());

        BigDecimal[] res = getArtificerMoney(item, car, divide,qudao,server);
        System.out.println("技师应得收益::"+res[0]);
        System.out.println("渠道扣款:"+res[1]);
        System.out.println("服务费扣款:"+res[2]);
        System.out.println("技师实际所得收益:"+res[3]);
        System.out.println("平台渠道扣款:"+res[4]);
        System.out.println("平台实际所得："+item.add(car).subtract(res[3].subtract(res[4])));
        System.out.println("******************");


        System.out.println("订单总金额："+item.add(car));
        System.out.println("技师所得："+res[3]+"+渠道商所得："+ res[1].add(res[4])+"+平台所得："+res[5]+"="+res[3].add(res[5]));




    }

    /**
     * 技师分成demo
     *
     * @param item   项目金额
     * @param car    车费金额
     * @param Divide 技师分成比例
     * @param qudao 渠道分成比例
     * @param server 服务费抽取比例
     * @return 【技师应得收益，渠道扣款，服务费扣款，技师实际所得】
     */


    public static BigDecimal[] getArtificerMoney(BigDecimal item, BigDecimal car, BigDecimal Divide, BigDecimal qudao, BigDecimal server) {
        BigDecimal[] res = new BigDecimal[6];

        BigDecimal countMoney = item.add(car);
        res[0] = item.multiply(Divide);   // 技师应得收益

        // 渠道扣款
        res[1] = item.multiply(qudao).multiply(Divide);
        // 服务费扣款
        res[2] = countMoney.multiply(server);
        // 技师实际所得
        res[3] = res[0].subtract(res[1]).subtract(res[2]);
        res[3] = res[3].add(car.subtract(car.multiply(qudao)));

        res[4] = item.multiply(qudao).multiply(new BigDecimal("0.3"));
        res[5] = countMoney.subtract(res[3]).subtract(res[4]);

        return res;
    }


    public static void print99Table() {
        int[] data = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i : data) {
            System.out.println();
            for (int j : data) {
                System.out.print(i + "x" + j + "=" + i * j + "\t");
            }
        }

    }

}

