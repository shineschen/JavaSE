package com.learn_modifier.d1_testdemo;

import jdk.internal.org.objectweb.asm.tree.analysis.SourceInterpreter;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class AtmSystem {
    public static void main(String[] args) {
        ArrayList<Account> accounts = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("======System-Menu======");
            System.out.println("1、注册");
            System.out.println("2、登录");
            System.out.println("3、退出");
            System.out.println("请输入操作序号：");

            int command = sc.nextInt();
            switch (command) {
                case 1:
                    register(sc, accounts);
                    break;
                case 2:
                    login(accounts, sc);
                    break;
                case 3:
                    break;
            }
        }


    }

    private static void login(ArrayList<Account> accounts, Scanner sc) {
        if (Account.AccountsNum == 0) {
            System.out.println("当前系统中无任何账户，请先注册~");
            return;
        }
        System.out.println("******登录******");
        System.out.println("请输入您的卡号：");
        String cardId = sc.next();

        for (int i = 0; i < accounts.size(); i++) {
            Account account = accounts.get(i);
            if (account.getCardId().equals(cardId)) {
                System.out.println("请输入密码：");
                String passWord = sc.next();

                if (account.getPassWord().equals(passWord)) {
                    System.out.println("恭喜您，登录成功！");

                    while (true) {
                        showUserMenu();
                        System.out.println("请输入操作序号：");
                        int command = sc.nextInt();

                        switch (command) {
                            case 1:
                                queryInfoAccount(account);
                                break;
                            case 2:
                                deposit(account, sc);
                                break;
                            case 3:
                                consumption(account, sc);
                                break;
                            case 4:
                                Transfer(accounts, account, sc);
                                break;
                            case 5:
                                break;
                            case 6:
                                break;


                        }
                    }
                }

                System.out.println("密码输入错误！");
                return;

            }
            System.out.println("卡号不存在，请检查后输入！");
            return;


        }
    }

    private static void Transfer(ArrayList<Account> accounts, Account account, Scanner sc) {
        System.out.println("======转账======");
        if (Account.AccountsNum < 2) {
            System.out.println("对不起，当前系统中暂无其他用户账户，无法执行该操作~");
            return;
        }
        System.out.println("请输入您要转账的卡号：");
        String cardId = sc.next();
        for (int i = 0; i < accounts.size(); i++) {
            Account account1 = accounts.get(i);
            if (account1.getCardId().equals(cardId)) {
                while (true) {
                    System.out.println("请输入转账金额：");
                    double money = sc.nextDouble();
                    if (money > account.getMoney()) {
                        System.out.println("对不起，您的账户余额不足~");
                        continue;
                    }
                    if (money > account.getQuotaMoney()) {
                        System.out.println("对不起，已超过每日可用限额~");
                        continue;
                    }
                    String result = account1.getUserName().substring(0,1);
                    System.out.println("请输入该账户用户名姓氏");
                    String userInput = sc.next();
                    if (!result.equals(userInput)){
                        System.out.println("您输入的姓氏有误~");
                        return;
                    }

                    account.setMoney(account.getMoney()-money);
                    account.setQuotaMoney(account.getQuotaMoney()-money);
                    account1.setMoney(account1.getMoney()+money);
                    System.out.println("恭喜转账成功~转账后您的余额为："+account.getMoney());
                }

            }


        }
    }

    private static void consumption(Account account, Scanner sc) {
        System.out.println("======取款=====");
        if (account.getMoney() <= 0) {
            System.out.println("对不起，您当前账户暂无可用余额~");
            return;
        }
        while (true) {
            System.out.println("请输入您要取款的金额：");
            double money = sc.nextDouble();
            if (account.getQuotaMoney() < money) {
                System.out.println("对不起，您的取款金额超过了每日限额~");
                continue;
            }

            if (money > account.getMoney()) {
                System.out.println("对不起，余额不足~");
                continue;
            }

            account.setMoney(account.getMoney() - money);
            account.setQuotaMoney(account.getQuotaMoney() - money);
            System.out.println("恭喜您取款成功！账户现可用余额为" + account.getMoney());
            return;
        }
    }

    private static void deposit(Account account, Scanner sc) {
        System.out.println("=====存款=====");
        while (true) {
            System.out.println("请输入您的存款金额：");
            double money = sc.nextDouble();
            if (money <= 0) {
                System.out.println("存入的金额不能小于等于0~");
                continue;
            }
            account.setMoney(account.getMoney() + money);
            System.out.println("恭喜您存款成功！账户现可用余额为" + account.getMoney());
            break;
        }
    }

    private static void queryInfoAccount(Account account) {
        System.out.println("=====账户信息如下====");
        System.out.println("用户名：" + account.getUserName());
        System.out.println("卡号：" + account.getCardId());
        System.out.println("账户余额" + account.getMoney());
        System.out.println("每日取现额度" + account.getQuotaMoney());
    }

    private static void showUserMenu() {
        System.out.println("*****用户菜单******");
        System.out.println("1.查询账户信息");
        System.out.println("2.存款");
        System.out.println("3.取款");
        System.out.println("4.转账");
        System.out.println("5.修改密码");
        System.out.println("6.注销账户");
    }

    private static void register(Scanner sc, ArrayList<Account> accounts) {
        Account account = new Account();
        System.out.println("*****注册*****");
        while (true) {
            System.out.println("请输入注册用户名:");
            String userName = sc.next();
            if (userName.length() < 2 || userName.length() >= 5) {
                System.out.println("输入的用户名长度需是 2 - 4 ~ 请重新输入");
                continue;
            }
            account.setUserName(userName);
            for (int i = 0; i <= 2; i++) {
                System.out.println("请输入密码（4~8位）：");
                String passWord = sc.next();
                if (passWord.length() < 4) {
                    System.out.println("密码长度输入有误~请重新输入，还剩下" + (2 - i) + "次机会~");
                    continue;
                }
                System.out.println("请再次输入密码（4~8）");
                String okPassWord = sc.next();
                if (!okPassWord.equals(passWord)) {
                    System.out.println("对不起，您俩次输入的密码不一致。请重新输入，还剩下" + (2 - i) + "次机会~");
                    continue;
                }
                account.setPassWord(okPassWord);
                System.out.println("请输入取现额度：");
                double quotaMoney = sc.nextDouble();
                account.setQuotaMoney(quotaMoney);
                account.setCardId(createCardId(accounts));
                accounts.add(account);
                System.out.println("恭喜注册成功！您的卡号是:" + account.getCardId());
                Account.AccountsNum++;
                return;
            }


        }

    }

    /**
     * 生成随机且不重复的卡号
     *
     * @param accounts 存储账户对象的集合容器
     * @return 返回随机且与系统账户中不重复的卡号
     */
    private static String createCardId(ArrayList<Account> accounts) {
        TO:
        while (true) {
            String cardId = "110";
            Random r = new Random();
            for (int i = 0; i < 5; i++) {
                cardId += r.nextInt(10);
            }


            for (int i = 0; i < accounts.size(); i++) {
                Account account = accounts.get(i);
                if (account.getCardId().equals(cardId)) {
                    continue TO;
                }
            }
            return cardId;
        }
    }
}


