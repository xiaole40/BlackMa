package BlackMa.com.lele.stringdemo;

import java.util.Scanner;

public class StringDemo1 {
    public static void main(String[] args) {
        //1.定义两个变量记录正确的用户名和密码
        String rightUsername = "zhangsan";
        String rightPassword = "123456";

        Scanner sc = new Scanner(System.in);

        //2.键盘录入用户名和密码
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名：");
            String username = sc.next();
            System.out.println("请输入密码：");
            String Password = sc.next();
            //3.比较
            if (username.equals(rightUsername) && Password.equals(rightPassword)) {
                System.out.println("用户登录成功");
                break;
            }else{
                if(i ==2){
                    //最后一次机会也输入错误，此时要提示账号被锁定
                    System.out.println("账号"+ username + "被锁定,请联系黑马程序员官方客服小姐姐：XXX-XXXX");
                }else {
                    System.out.println("用户登录失败，用户名或密码有误,您还剩下" + (2-i) + "次机会");
                }
            }
        }
    }
}
