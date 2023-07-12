package com.learn_collection.d7_collection_set;




public class SetDemo_artificer {
    public static void main(String[] args) {

        Artificer a1 = new Artificer("小悠",21,175.00);
        Artificer a2 = new Artificer("小然",23,155.50);
        Artificer a3 = new Artificer("小然",23,155.50);

        System.out.println(a1.hashCode());   //1163157884
        System.out.println(a1.hashCode());   //1163157884
        System.out.println(a2.hashCode());   //1956725890

        String s1 = new String("abc");
        String s2 = new String("acD");
        System.out.println(s1.hashCode());  //96354
        System.out.println(s2.hashCode());  //96354


    }
}
