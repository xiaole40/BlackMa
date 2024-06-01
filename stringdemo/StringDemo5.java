package BlackMa.com.lele.stringdemo;

public class StringDemo5 {
    public static void main(String[] args) {
        String result = reverser("abc");
        System.out.println(result);
    }
    public static String reverser(String str){
        //abc
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            //i依次表示字符串中的每一个索引（倒着的）
            char c = str.charAt(i);
            result = result + c;
        }
        return result;
    }
}
