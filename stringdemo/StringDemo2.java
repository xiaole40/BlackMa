package BlackMa.com.lele.stringdemo;

import java.util.Scanner;

public class StringDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        //2.进行遍历
        for (int i = 0; i < str.length(); i++) {
            //i 依次表示字符串的每一个索引
            char c = str.charAt(i);
            System.out.println(c);
        }
    }
}
