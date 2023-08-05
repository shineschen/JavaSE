package learn_d2_recuision;

/**
 * 计算 n的阶乘
 * 递归的应用，执行流程和算法思想
 */

public class RecursionDemo1 {
    public static void main(String[] args) {

        System.out.println(f(5));

    }

    public static int f(int n ){
        // 终结点
        if (n==1){
            return 1;
        }else {
            return f(n-1) * n;
        }
    }


}
