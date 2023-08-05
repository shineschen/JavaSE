package test_demo;

import java.io.File;
import java.math.BigDecimal;

public class DivideDemo {

    private static final BigDecimal serverCommission = BigDecimal.valueOf(0.04);//服务费抽成

    private static  BigDecimal ChannelProportion = BigDecimal.valueOf(0.12); // 渠道扣款比例

    private static final BigDecimal saveMoney = BigDecimal.valueOf(0.15); // 储值扣款比例


    /**
     * 无渠道费，无储值费  分成
     *
     * @param projectMoney 项目金额
     * @param carMoney     车费
     * @return 实际所得金额
     */
    private static void test2(BigDecimal projectMoney, BigDecimal carMoney, BigDecimal artCommission) {

        BigDecimal money = projectMoney.multiply(artCommission);     // 技师预计应得收益 = 项目金额 * 技师提成比例
        BigDecimal actualMoney = money.multiply(serverCommission);    //  服务费扣款 = 技师应得收益 * 服务费抽成比例
        BigDecimal lastMoney = money.subtract(actualMoney);           // 技师实际收益 = 应得收益 - 服务费扣款金额
        System.out.println("技师预计应得收益：" + money);
        System.out.println("扣款金额" + actualMoney);
        System.out.println("技师实际所得项目收益" + lastMoney);
        System.out.println("技师实际所得车费收益" + carMoney);
        System.out.println("该订单技师实际所得全部收益 = " + lastMoney.add(carMoney));


    }

    /**
     * 有储值费扣款
     *
     * @param pjMoney     项目金额
     * @param carMoney    车费金额
     * @param aftScale    技师分成比例
     * @param serverScale 服务费抽成比例
     */

    public static void test(BigDecimal pjMoney, BigDecimal carMoney, BigDecimal aftScale, BigDecimal serverScale) {
        System.out.println("项目总金额 ：" + pjMoney);
        System.out.println("分成比例：" + aftScale);
        BigDecimal money = pjMoney.multiply(aftScale);
        System.out.println("应得收益：" + money);

        System.out.println("-----扣款明细----");
        System.out.println("服务费扣款：" + money.multiply(serverScale));
        System.out.println("储值费扣款：" + money.multiply(saveMoney.multiply(aftScale)));
        BigDecimal allDeduct = money.multiply(serverScale).add(money.multiply(saveMoney.multiply(aftScale)));
        System.out.println("合计扣款：" + allDeduct);

        System.out.println("实际收益：" + money + "-" + allDeduct + "+" + carMoney + "=" + money.subtract(allDeduct).add(carMoney));

    }

    /**
     * 有渠道费扣款
     *
     * @param pjMoney     项目金额
     * @param carMoney    车费
     * @param aftScale    技师分成比例
     * @param serverScale 服务费抽成比例
     */

    public static void test1(BigDecimal pjMoney, BigDecimal carMoney, BigDecimal aftScale, BigDecimal serverScale) {
        System.out.println("项目总金额 ：" + pjMoney);
        System.out.println("分成比例：" + aftScale);
        BigDecimal money = pjMoney.multiply(aftScale);
        System.out.println("应得收益：" + money);

        System.out.println("-----扣款明细----");
        System.out.println("服务费扣款：" + money.multiply(serverScale));
        System.out.println("渠道费扣款：" + pjMoney.multiply(ChannelProportion).multiply(aftScale));
        BigDecimal allDeduct = money.multiply(serverScale).add(pjMoney.multiply(ChannelProportion).multiply(aftScale));
        System.out.println("合计扣款：" + allDeduct);

        System.out.println("实际收益：" + money + "-" + allDeduct + "+" + carMoney + "=" + money.subtract(allDeduct).add(carMoney));
    }

    public static void main(String[] args) {

        test(BigDecimal.valueOf(796), BigDecimal.valueOf(16.75), BigDecimal.valueOf(0.7), BigDecimal.valueOf(0.04));
        System.out.println();
        test1(BigDecimal.valueOf(596), BigDecimal.valueOf(25.61), BigDecimal.valueOf(0.7), BigDecimal.valueOf(0.04));
        System.out.println();


    }
}
