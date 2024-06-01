package BlackMa.com.lele.stringBuilderdemo;

public class StringBuiler11 {
    public static void main(String[] args) {
        /* 给定两个字符串，A和B。
           A的旋转操作就是将A 最左边的字符移动到最右边。
           例如，若A =abcde'，在移动一次之后结果就是'bcdea
           如果在若干次调整操作之后，A能变成B，那么返回True。
           如果不能匹配成功，则返回false*/

        //定义两个字符串
        String strA = "abcde";
        String strB = "cdeab";

        //调用方法1进行比较 
        boolean result = check(strA,strB);
        System.out.println(result);

        //2.旋转字符串
//        String rotate = rotabe(strA);//bcdea

        //循环旋转并比较



        //1：bcdea
        //2：cdeab
        //3：deabc
        //4：eabcd
        //5：abcde

    }
    public static boolean check(String strA,String strB){
        for (int i = 0; i < strA.length(); i++) {
            strA = rotabe(strA);
            if(strA.equals(strB)){
                return true;
            }
        }
        //所有情况都比较完毕了，还不一样那就返回false
        return false;
    }
    //作用：旋转字符串，把左侧的字符串移动到右侧
    //形参：旋转前的字符串
    //返回值：旋转后的字符串
    public static String rotabe(String str){
        //套路
        //如果我们看到要修改字符串的内容
        //可以有两个方法
        //1.用subString进行截取，把左边的字符串截取出来拼接到右侧去
        //2.可以把字符串先变成一个字符数组，然后调整字符数组里面数据，最后再把字符数组变成字符串

        str.toCharArray();

        //截取思路
        //获取最左侧的那个字符
        char first = str.charAt(0);
        //获取剩余的字符
        String end  = str.substring(1);

        return end + first;


    }
}
