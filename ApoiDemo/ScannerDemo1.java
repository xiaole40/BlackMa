package BlackMa.com.lele.ApoiDemo;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        //创建对象
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个小数：");
        //2.接收一个小数
        double result = sc.nextDouble();
        //3.输出打印
        System.out.println(result);

        //1. 使用new的方式来获取一个字符串对象
        //空参构造：可以获取一个空白的字符串对象
        String s2 = new String();
        System.out.println("@" + s2 + "!");

        //传递一个字符串，根据传递的字符串内容再创建一个新的字符串对象
        String s3 = new String("abc");
        System.out.println(s3);

        //传递一个字符串数组，根据字符数组的内容创建一个新的字符串对象
        //需求：我要修改字符串的内容
        //abc --> {'a','b','c'} --> {'Q','b','c'}
        char[] chs = {'a','b','c','d'};
        String s4 = new String(chs);
        System.out.println(s4);

        //传递一个字节数，根据字节数组的内容再创建一个新的字符串对象
        //我们一般要把字节信息进行转换，转成字符串，此时就要用到这个构造了
        byte[] bytes = {97,98,99,100};
        String s5 = new String(bytes);
        System.out.println(s5);

        String s6 = new String("abc");
        String s7 = ("abc");

        //1.==号比较
        //基本数据类型：比的是数据值
        //引用数据类型：比的是地址值
        System.out.println(s6 == s7);//false
        //3.比较字符串对象中的内容是否相等
        boolean result1 = s6.equals(s7);
        System.out.println(result1);

        //4.比较字符串对象中的内容是否相等，忽略大小写
        //1 一 壹
        //忽略大小写只能是英文状态下的a A
        boolean result2 = s6.equalsIgnoreCase(s7);
        System.out.println(result2);//true

        Scanner sc1 = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str1 = sc1.next();
        String str2 = "abc";
        System.out.println(str1 == str2);//false
    }
}
