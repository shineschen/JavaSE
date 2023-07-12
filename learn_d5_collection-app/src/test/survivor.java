package test;

import javax.naming.NamingEnumeration;
import java.sql.Array;
import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.FormatFlagsConversionMismatchException;
import java.util.Random;
import java.util.regex.Pattern;

/**
 * 目前有100名囚犯，每个囚犯的编号是1-200之间的随机数，现在要求依次随机生成100名囚的编号(要求这些囚犯的编号是不能重复的)，
 * 然后让他们依次站成一排，:位置是从1开始计数的，接下来，国王命令手下先干掉全部奇数位置处的人。剩下的人，又从新按位置1开始，
 * 再次干掉全部奇数位置处的人，依此类推，直到最后利下一个人为止，剥下的这个人为辛存者，
 */
public class survivor {



    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<Convict> allConvicts = new ArrayList<>();
        String[] firstNames = {"张", "王", "李", "赵", "刘", "陈", "杨", "黄", "周", "吴"};
        String[] lastNames = {"伟", "芳", "婷", "军", "艳", "秀", "丽", "华", "明", "强"};
        String[] genders = {"男", "女"};
        String[] bios = {"抢劫", "偷盗", "诈骗", "过失杀人", "贪污腐败", "无证驾驶"};
        String[] imprisonment = {"3个月", "半年", "1年", "5年", "十年", "终身"};
        int position = 1;




        for (int i = 0; i < 100; i++) {
            Convict convict = new Convict();
            convict.setPosition(position);
            position++;
            convict.setId(createSoleId(allConvicts));
            convict.setName(createRdmPeople(allConvicts,firstNames,lastNames));
            convict.setPenalty(createRdmBios(bios));
            convict.setImprisonment(createRdmImprison(imprisonment));
            convict.setGender(createRdmGender(genders));
            allConvicts.add(convict);
        }


        for (int i = 0; i < allConvicts.size(); i++) {
            Convict convict = allConvicts.get(i);
            System.out.println("id:"+convict.getId());
            System.out.println("姓名："+convict.getName());
            System.out.println("性别："+ convict.getGender());
            System.out.println("罪名："+ convict.getPenalty());
            System.out.println("刑期："+ convict.getImprisonment());
            System.out.println("排序位置："+convict.getPosition());
            System.out.println("********************");
        }

        for (int i = 0; i < allConvicts.size(); i++) {
            Convict convict = allConvicts.get(i);
            if (convict.getPosition() % 2 != 0){
                allConvicts.remove(convict);
            }
        }
        int newPosition = 1;
        for (int i = 0; i < allConvicts.size(); i++) {
            Convict convict = allConvicts.get(i);
            convict.setPosition(newPosition);
            newPosition++;

        }
        for (int i = 0; i < allConvicts.size(); i++) {
            Convict convict = allConvicts.get(i);
            if (convict.getPosition() % 2 != 0){
                allConvicts.remove(convict);
            }
        }





    }





    public static String createRdmGender(String[] genders){
        Random r = new Random();
        return genders[r.nextInt(genders.length)];

    }

    public static String createRdmBios(String[] bios){
        Random r = new Random();
        return bios[r.nextInt(bios.length)];
    }

    public static String createRdmImprison(String[] imprison){
        Random r = new Random();
        return imprison[r.nextInt(imprison.length)];

    }







    public static String createRdmPeople(ArrayList<Convict> allConvicts,String[] firstNames,String[] lastNames) {
        // 随机创建人员姓名
        Random r = new Random();
        TO:
        while (true) {
            String name = firstNames[r.nextInt(firstNames.length)] + lastNames[r.nextInt(lastNames.length)];
            for (int i = 0; i < allConvicts.size(); i++) {
                Convict convict = allConvicts.get(i);
                if (convict.getName().equals(name)) {
                    continue TO;
                }
            }
            return name;

        }




    }


    public static String createSoleId(ArrayList<Convict> convicts) {
        Random r = new Random();
        while (true) {
            StringBuilder id = new StringBuilder("110");
            for (int i = 0; i < 5; i++) {
                id.append(r.nextInt(10));
            }

            for (int i = 0; i < convicts.size(); i++) {
                Convict convict = convicts.get(i);
                if (convict.getId().equals(id.toString())) {
                    break ;
                }
            }

            return id.toString();


        }

    }

}


