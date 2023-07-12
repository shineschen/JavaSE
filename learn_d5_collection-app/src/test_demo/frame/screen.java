package test_demo.frame;

import test_demo.bean.Server;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class screen {

    private static ArrayList<Server> allServers = new ArrayList<>();

    private static Scanner sc = new Scanner(System.in);

    public static void start() {
        while (true) {
            System.out.println("********悠然到家*******");
            System.out.println("1. 添加项目");
            System.out.println("2. 查询项目信息");
            System.out.println("3. 修改项目");
            System.out.println("4. 删除项目");
            System.out.println("5. 添加技师");
            System.out.println("6. 查询技师信息");
            System.out.println("7. 修改技师信息");
            System.out.println("8. 删除技师");
            System.out.println("请输入操作命令：");
            int command = sc.nextInt();
            switch (command) {
                case 1:
                    addServer();
                    break;
                case 2:
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
                    System.out.println("输入操作有误~");
            }
        }

    }

    private static void addServer() {
        System.out.println("*****添加项目*****");
        while (true) {
            System.out.println("请输入项目名：");
            String name = sc.next();
            for (int i = 0; i < allServers.size(); i++) {
                Server server = allServers.get(i);
                if (server.getName().equals(name)) {
                    System.out.println("项目名重复！请重新输入！");
                    break;
                }
            }
            Server server = new Server();
            System.out.println("请输入项目时长：");
            int time = sc.nextInt();
            server.setName(name);
            server.setTime(time);
            server.setId(createId());
            System.out.println("需要为该项目绑定技师吗？（Y/N）");
            String command = sc.next();
            switch (command) {
                case "Y":
                    System.out.println("请输入绑定的技师id");
                    String id = sc.next();
                    for (int i = 0; i < allServers.size(); i++) {
                        Server s = allServers.get(i);
                        if (s.getId().equals(id)) {

                            System.out.println("成功绑定~");
                        }
                    }
            }
        }
    }

    private static String createId() {
        Random r = new Random();
        TO:
        while (true) {
            StringBuilder id = new StringBuilder("No110");
            for (int i = 0; i < 5; i++) {
                id.append(r.nextInt(10));
            }
            for (int i = 0; i < allServers.size(); i++) {
                Server server = allServers.get(i);
                if (server.getId().equals(id.toString())) {
                    continue TO;
                }
            }
            return id.toString();
        }
    }

}
