package learn_d8_printStream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * 输出语句的重定向
 */
public class PrintDemo1 {
    public static void main(String[] args) {
        System.out.println("至尊SPA");
        System.out.println("纯享SPA");
        System.out.println("面部SPA");

        try (
                PrintStream ps = new PrintStream("learn_d6_file-io/src/text.txt")
                )
        {
            System.setOut(ps);
            System.out.println("中式推拿");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
