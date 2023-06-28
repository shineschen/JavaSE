package test_demo.frame;

import test_demo.bean.Appointment;
import test_demo.bean.Department;
import test_demo.bean.Doctor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class HospitalManager {
    // 系统需要存储全部科室信息
    private ArrayList<Department> allDepartments = new ArrayList<>();
    // 系统需要记录全部的预约详情
    private ArrayList<Appointment> appointments = new ArrayList<>();

    private Scanner sc = new Scanner(System.in);

    public void start() {

        while (true) {
            System.out.println("==========信息管理系统===========");
            System.out.println("1. 科室管理 - 添加科室");
            System.out.println("2. 科室管理 - 删除科室");
            System.out.println("3. 科室管理 - 修改科室");
            System.out.println("4. 科室管理 - 信息查询");
            System.out.println("5. 医生管理 - 录入医生");
            System.out.println("6. 医生管理 - 医生坐诊设置（可设置当天和未来六天的坐诊情况）");
            System.out.println("7. 医生管理 - 展示全部医生的坐诊详情（当天和未来六天）");
            System.out.println("8. 医生管理 - 挂号预约");
            System.out.println("9. 搜索某个医生当天和未来六天内的病人预约详情（展示每天预约病人的具体信息）");
            System.out.println("请输入操作命令：");
            switch (sc.nextInt()) {
                case 1:
                    addDepartment();
                    break;
                case 2:
                    delDepartment();
                    break;
                case 3:
                    updateDepartment();
                    break;
                case 4:
                    queryDepartment();
                    break;
                case 5:
                    addDoctor();
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

    private void queryDepartment() {
        while (true) {
            System.out.println("请输入要查询的科室：");
            String departmentName = sc.next();
            for (int i = 0; i < allDepartments.size(); i++) {
                Department department = allDepartments.get(i);
                if (department.getName().equals(departmentName)) {
                    System.out.println("*****该科室信息如下******");
                    System.out.println("科室名:" + department.getName());
                    System.out.println("科室总人数：" + department.getDoctors().size() + "人");
                    System.out.print("科室医生：[");
                    for (int j = 0; j < department.getDoctors().size(); j++) {
                        Doctor doctor = department.getDoctors().get(j);
                        System.out.print(j == department.getDoctors().size() - 1 ? doctor.getName() : doctor.getName() + ",");
                    }
                    System.out.print("]");
                    System.out.println();
                    return;
                }
            }
            System.out.println("输入的科室不存在~请重新输入！");

        }
    }

    private void addDoctor() {
        System.out.println("=======录入医生信息======");
        while (true) {
            System.out.println("请选择科室：");
            String departmentName = sc.next();
            for (int i = 0; i < allDepartments.size(); i++) {
                Department department = allDepartments.get(i);
                if (department.getName().equals(departmentName)) {
                    if (department.getDoctors().size() == 0) {
                        System.out.println("请输入姓名:");
                        String name = sc.next();
                        Doctor doctor = new Doctor();
                        doctor.setName(name);
                        System.out.println("请输入性别：");
                        String gender = sc.next();
                        doctor.setGender(gender);
                        System.out.println("请输入年龄：");
                        int age = sc.nextInt();
                        doctor.setAge(age);
                        doctor.setDoctorId(createDoctorId());
                        System.out.println("请输入专业：");
                        String specialty = sc.next();
                        doctor.setSpecialty(specialty);
                        doctor.setDepartmentName(departmentName);
                        System.out.println("请输入入职日期：");
                        String joinDateStr = sc.next();
                        LocalDate joinDate = LocalDate.parse(joinDateStr);
                        doctor.setJoinDate(joinDate);
//                        ArrayList<Doctor> doctors = new ArrayList<>();
//                        doctors.add(doctor);
                        department.getDoctors().add(doctor);
                        System.out.println("录入成功！");
                        return;
                    }
                    System.out.println("请输入姓名:");
                    String name = sc.next();
                    Doctor doctor = new Doctor();
                    doctor.setName(name);
                    System.out.println("请输入性别：");
                    String gender = sc.next();
                    doctor.setGender(gender);
                    System.out.println("请输入年龄：");
                    int age = sc.nextInt();
                    doctor.setAge(age);
                    doctor.setDoctorId(createDoctorId());
                    System.out.println("请输入专业：");
                    String specialty = sc.next();
                    doctor.setSpecialty(specialty);
                    department.getDoctors().add(doctor);
                    System.out.println("录入成功！");
                    return;


                }
            }
            System.out.println("输入的科室不存在！请重新输入！");
        }
    }

    private String createDoctorId() {
        Random r = new Random();
        TO:
        while (true) {
            StringBuilder id = new StringBuilder("110");
            for (int i = 0; i < 8; i++) {
                id.append(r.nextInt(10));
            }

            // 校验所有科室里的所有医生有没有与其重复
            for (int i = 0; i < allDepartments.size(); i++) {
                Department department = allDepartments.get(i);
                ArrayList<Doctor> doctors = department.getDoctors();
                for (int j = 0; j < doctors.size(); j++) {
                    Doctor doctor = doctors.get(i);
                    if (doctor.getDoctorId().equals(id.toString())) {
                        continue TO;
                    }
                }
            }
            return id.toString();
        }
    }

    private void updateDepartment() {
        while (true) {
            System.out.println("请输入要修改的科室：");
            String name = sc.next();
            for (int i = 0; i < allDepartments.size(); i++) {
                Department department = allDepartments.get(i);
                if (department.getName().equals(name)) {
                    System.out.println("请输入要修改的名称:");
                    String names = sc.next();
                    department.setName(names);
                    System.out.println("修改成功！");
                    return;
                }
            }
            System.out.println("输入的科室不存在~！");
        }
    }

    private void delDepartment() {
        System.out.println("======删除科室======");

        TO:
        while (true) {
            System.out.println("请输入要删除的科室名称：");
            String name = sc.next();
            //判断科室是否存在
            for (int i = 0; i < allDepartments.size(); i++) {
                Department department = allDepartments.get(i);
                if (department.getName().equals(name)) {
                    if (department.getDoctors().size() == 0) {
                        System.out.println("确认删除（Y/N）");
                        String command = sc.next();
                        if (command.equals("y") || command.equals("Y")) {
                            allDepartments.remove(department);

                            System.out.println("删除成功！是否继续删除（Y/N）？");
                            String command1 = sc.next();
                            if (command1.equals("Y") || command1.equals("y")) {
                                continue TO;
                            }
                            if (command1.equals("N") || command1.equals("n")) {
                                return;
                            }

                        }
                        if (command.equals("N") || command.equals("n")) {
                            continue TO;
                        }

                    }
                    System.out.println("该科室存在医生信息，无法删除~");
                    return;


                }
            }
            System.out.println("输入的科室名称不存在~请重新输入！");

        }

    }


    private void addDepartment() {
        System.out.println("=====添加科室=======");
        TO:
        while (true) {
            System.out.println("请输入科室名称：");
            String name = sc.next();
            // 判断科室是否存在
            for (int i = 0; i < allDepartments.size(); i++) {
                Department department = allDepartments.get(i);
                if (department.getName().equals(name)) {
                    System.out.println("该名称已存在！请重新输入~");
                    continue TO;
                }
            }
            Department department = new Department();
            department.setName(name);
            allDepartments.add(department);

            System.out.println("添加成功！是否继续添加(Y/N)?");
            String command = sc.next();
            if (command.equals("y") || command.equals("Y")) {
                continue TO;
            }
            if (command.equals("N") || command.equals("n")) {
                return;
            }

        }
    }

}
