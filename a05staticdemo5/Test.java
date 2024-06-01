package BlackMa.com.lele.a05staticdemo5;

public class Test {
    public static void main(String[] args) {
        //[] 数组
        //String : 数据类型
        //args  ： 数组名

        //点击Edit Configurations 在Program arguments 输入 Hello world Java 输出结果 3 Hello World Java

        System.out.println(args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
