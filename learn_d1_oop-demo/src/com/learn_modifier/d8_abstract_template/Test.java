package com.learn_modifier.d8_abstract_template;

public class Test {
    public static void main(String[] args) {

        // 模块方法模式思想和使用步骤
        StudentChild studentChild = new StudentChild();

        studentChild.write();

        StudentMiddle studentMiddle = new StudentMiddle();

        studentMiddle.write();
    }
}
