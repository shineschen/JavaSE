package com.learn.d6_regex;

import org.omg.CORBA.MARSHAL;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 正则爬取信息
 */

public class RegexDemo4 {
    public static void main(String[] args) {
        String rs = "悠然到家O2O服务平台，jpojdlaspasjpfjasjfa]k;k;kk;k;k;k 15191926676  jljaslkdjaslkj你16541313@163.comjslkdjash就哈哈哈400-1060-10215ldja4045643634sio76846543546asd4a6s4d5s6a4d98as哈后啊红底啊和尚道士都批萨加";

        // 取出邮箱，电话等数据
        //1 . 定义爬取规则，字符串形式
        String regex = "(\\w{1,30}@[a-zA-Z0-9]{2,20}(\\.[a-zA-Z0-9]{2,20}){1,2})|" +
                "(1[3-9]\\d{9})|(0\\d{2,6}-?\\d{5,20})|(400-?\\d{3,9}-?\\d{3,9})";

        //2 . 爬取规则编译成匹配对象
        Pattern pattern = Pattern.compile(regex);

        //3 . 得到一个内容匹配器对象
        Matcher matcher = pattern.matcher(rs);

        //4.  开始匹配
        while (matcher.find()){
            String res = matcher.group();
            System.out.println(res);
        }


    }
}
