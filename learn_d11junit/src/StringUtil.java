/**
 * 字符串工具类
 */
public class StringUtil {
    public static void printNumber(String name){
        System.out.println("长度是" + name.length());
    }


    /**
     * 求字符串的最大索引
     */

    public static int getMaxIndex(String data){
        if (data==null){
            return -1;

        }
        return data.length();
    }

}
