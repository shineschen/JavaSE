package learn_properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;
import java.util.Set;

/**
 *  读取属性文件，判断是否存在固本强元，如果存在价格改为 66
 */
public class PropertiesTest {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();

        properties.load(new FileReader
                ("learn_d7_properties-xml-log\\src\\name.txt"));


        if (properties.containsKey("固本强元")){
            properties.setProperty("固本强元","66");
        }
        properties.store(new FileWriter("learn_d7_properties-xml-log\\src\\name.txt"),"success");
    }
}
