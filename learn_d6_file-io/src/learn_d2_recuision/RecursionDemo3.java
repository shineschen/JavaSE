package learn_d2_recuision;

/**
 * 递归案例 ：monkey 吃桃问题  递归经典案例
 */
public class RecursionDemo3 {
    public static void main(String[] args) {


        // 公式 ： f(x) - f(x)/2 -1 = f(x+1);
        // 变形 ： 2f(x) -f(x) - 2= 2f(x+1);
        // 变形2： f(x) = 2 * f(x + 1) + 2;
        System.out.println(f(1));
        System.out.println(f(2));
        System.out.println(f(3));


    }
    public static int f(int x){
        if (x==10){
            return 1;
        }else {
            return 2 * f(x+1) +2;
        }

    }
}
