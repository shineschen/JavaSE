package com.learn.frame;

import com.learn.bean.Appointment;
import com.learn.bean.Department;

import java.util.ArrayList;
import java.util.Scanner;

public class HospitalManager {
    // 系统需要存储全部科室信息
    private ArrayList<Department> allDepartments = new ArrayList<>();
    // 系统需要记录全部的预约详情
    private ArrayList<Appointment> appointments = new ArrayList<>();

    private Scanner sc = new Scanner(System.in);

    public void start(){
        while (true){
            System.out.println("==========信息管理系统===========");
            System.out.println("1. 科室管理 - 添加科室");
            System.out.println("2. 科室管理 - 删除科室");
            System.out.println("3. 科室管理 - 修改科室");
            System.out.println("4. 医生管理 - 录入医生");
            System.out.println("5. 医生管理 - 医生坐诊设置（可设置当天和未来六天的坐诊情况）");
            System.out.println("6. 医生管理 - 展示全部医生的坐诊详情（当天和未来六天）");
            System.out.println("7. 医生管理 - 挂号预约");
            System.out.println("8. 搜索某个医生当天和未来六天内的病人预约详情（展示每天预约病人的具体信息）");
            System.out.println("请输入操作命令：");
            switch (sc.nextInt()){
                case 1:
                    addDepartment();
                    break;
                case 2:
                    delDepartment();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                default:
                    System.out.println("输入有误~请重新输入");
            }
        }
    }

    private void delDepartment() {
        System.out.println("======删除科室======");
        TO:
        while (true){
        System.out.println("请输入要删除的科室名称：");
        String name = sc.next();
        //判断科室是否存在
            for (int i = 0; i < allDepartments.size(); i++) {
                Department department = allDepartments.get(i);
                if (department.getName().equals(name)){
                    System.out.println("确认删除（Y/N）");
                    String command = sc.next();
                    if (command.equals("y") ||command.equals("Y")){
                        allDepartments.remove(department);
                        System.out.println("删除成功！是否继续删除（Y/N）？");
                        String command1 = sc.next();
                        if (command1.equals("Y")|| command1.equals("y")){
                            continue TO;
                        }
                        if (command1.equals("N") ||command1.equals("n")){
                            return;
                        }

                    }
                    if (command.equals("N") ||command.equals("n")){
                        continue TO;
                    }
                    }
                }
            System.out.println("输入的科室名称不存在~请重新输入！");

            }

        }


    private void addDepartment() {
        System.out.println("=====添加科室=======");
        TO:
        while (true){
            System.out.println("请输入科室名称：");
            String name = sc.next();
            // 判断科室是否存在
            for (int i = 0; i < allDepartments.size(); i++) {
                Department department = allDepartments.get(i);
                if (department.getName().equals(name)){
                    System.out.println("该名称已存在！请重新输入~");
                    continue TO;
                }
            }
            Department department = new Department();
            department.setName(name);
            allDepartments.add(department);
            System.out.println("添加成功！是否继续添加(Y/N)?");
            String command = sc.next();
            if (command.equals("y") || command.equals("Y")){
                continue TO;
            }
            if (command.equals("N") || command.equals("n")){
                return;
            }

        }
    }

}
