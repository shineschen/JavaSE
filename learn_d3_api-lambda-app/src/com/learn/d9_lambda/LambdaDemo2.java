package com.learn.d9_lambda;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.Arrays;
import java.util.Comparator;

public class LambdaDemo2 {
    public static void main(String[] args) {

        Integer[] arr = {34,12,33,23};

        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });

        Arrays.sort(arr, (Integer o1, Integer o2) -> o2-o1);
        System.out.println(Arrays.toString(arr));

        System.out.println("----------------");
        JFrame win = new JFrame("登录界面");

        JButton btn = new JButton("登录");

//        btn.addActionListener(new AbstractAction() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("点击事件触发~");
//            }
//        });
        btn.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("点击事件触发~");
            }
        });
        win.add(btn);
        win.setSize(400,300);
        win.setVisible(true);
    }
}
