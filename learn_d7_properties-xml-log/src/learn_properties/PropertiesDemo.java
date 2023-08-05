package learn_properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {
    public static void main(String[] args) throws Exception {
        // 创建Properties对象
        Properties properties = new Properties();
        System.out.println(properties);
        // 加载属性文件中的键值对数据到properties对象中去
        properties.load(new FileReader("learn_d7_properties-xml-log\\src\\users.properties"));

        System.out.println(properties);

        System.out.println(properties.getProperty("admin"));  //根据键取值

        //遍历得到全部和值
        Set<String> keys =  properties.stringPropertyNames();

        for (String key : keys) {
            String value = properties.getProperty(key);
            System.out.println(key +  value);
        }

        properties.forEach((k,v) ->{
            System.out.println(k+"->" + v);
        });

    }
}
