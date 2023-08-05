package learn_d2_recuision;

/**
 *  方法递归的形式
 */
public class RecursionDemo {
    public static void main(String[] args) {

        test1();

    }

    // 直接方法递归
    public static void test1(){
        System.out.println("--test1--");
        test1();
    }


    //  间接方法递归
    public static void test2(){
        System.out.println("---test2----");
    }


    public static void test3(){
        test2();
    }

}
