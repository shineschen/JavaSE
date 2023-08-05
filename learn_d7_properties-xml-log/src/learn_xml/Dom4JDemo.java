package learn_xml;


import org.dom4j.Document;

import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

/**
 * 使用dom4J解析xml文件
 */
public class Dom4JDemo {
    public static void main(String[] args) throws Exception {
        // 创建一个Dom4j框架提供的解析器对象
        SAXReader saxReader = new SAXReader();

        // 使用解析器对象把需要解析的文件读成一个Document对象
        Document document  = saxReader.read("learn_d7_properties-xml-log\\src\\helloword.xml");

        // 拿到根元素对象
        Element element = document.getRootElement();
        System.out.println(element.getName());

        // 获取根元素下的全部一级子元素
        List<Element> elements = element.elements();

        for (Element e : elements) {
            System.out.println(e.getName());
        }
        // 获取根元素下的全部一级子元素
        List<Element> elements1 = element.elements("user");

//        for (Element e : elements) {
//            System.out.println(e.getName());
//        }

        //获取当前元素下的某个子元素
        Element people = element.element("user");
        System.out.println(people.getText());

    }
}
