package BlackMa.com.lele.stringBuilderdemo;

import java.util.Scanner;

public class StringBuilder9 {
    /*
    * 键盘录入一个字符串，
    * 要求1：长度为小于等于9
    * 要求2.只能是数字内容变成罗马数字
    * 下面是阿拉伯数字跟罗马数字的对比关系：
    * I —— 1、II——2、III——3、IV——4、VI——5、VI——6、VII——7、VIII——8、IX——9
    * 注意点；
    * 罗马数字里面没有0的
    * 如果键盘录入的数字包含0，可以变成""(长度为0的字符串)*/
    public static void main(String[] args) {

        //1.键盘输入一个字符串
        Scanner sc = new Scanner(System.in);
        String str;
        while(true){
            System.out.println("请输入一个字符串：");
            str = sc.next();
            //2.校验字符串是否满足规则
        boolean flag = checkStr(str);
        if(flag){
            break;
        }else{
            System.out.println("当前的字符串不符合规则，请重新输入");
            continue;
        }
        }
        //     将内容变成罗马数字
        //    下面是阿拉伯数字跟罗马数字的对比关系：
        //     I —— 1、II——2、III——3、IV——4、V——5、VI——6、VII——7、VIII——8、IX——9
        //查表法：数字跟数据产生一个对应关系
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int number = c - 48;
            String s = changeLuoMa(number);
            sb.append(s);
        }
        System.out.println(sb);
    }
    public static String changeLuoMa(int number){
        //定义一个数组，让索引跟罗马数字产生一个对应关系
        String[] arr = {"", " I ", " II ", " III ", " IV ", " V ", " VI ", " VII ", " VIII ", " IX "};
        return arr[number];
    }
    public static boolean checkStr(String str){
        //要求：长度为小于等于9
        if(str.length() > 9){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
            else{
                return true;
            }
        }
        //只有当字符串里面所以的字符全部判断完毕了，我才能认为当前的字符串是符合规则
        return true;
    }
}
