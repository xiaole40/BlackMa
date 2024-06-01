package BlackMa.com.lele.stringdemo;

public class StringDemo7 {
    public static void main(String[] args) {
        //1.获取一个手机号码
        String phoneNumber = "12112349468";

        //2.截取手机号前三位
        String start = phoneNumber.substring(0,3);
        System.out.println(start);

        //3.截取手机号码后三位
        String end = phoneNumber.substring(7);

        //4.拼接
        String result = start + "****" + end;

        //5.打印
        System.out.println(result);
    }
}
