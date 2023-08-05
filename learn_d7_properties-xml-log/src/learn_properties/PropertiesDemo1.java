package learn_properties;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * 将价值对数据存入到属性文件中去
 */
public class PropertiesDemo1 {
    public static void main(String[] args) throws Exception {
        // 创建properties对象
        Properties properties = new Properties();
        properties.setProperty("yy","11111");
        properties.setProperty("ww","11111");

        // 把properties对象中的键值对数据存入到属性文件中去
        properties.store(new FileWriter("learn_d7_properties-xml-log\\src\\users1.properties"),"i saved many users");



    }
}
