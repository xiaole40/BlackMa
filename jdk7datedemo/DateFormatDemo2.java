package BlackMa.com.lele.jdk7datedemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatDemo2 {
    public static void main(String[] args) throws ParseException {
        /*
        * 假设，你初恋的出生年月日为：2001-02-09
        * 请用字符串表示这个数据，并将其转换为：2001年2月9日
        *
        * 可以通过2001-02-09进行解析，解析成一个Date对象
        * 创建一个Date对象表示2001年2月9日
        * 创建一个SimpleDateFormat对象，并定义格式为年月日
        *把时间变成：2001年2月9日
        * */

        //1.可以通过2001-02-09进行解析，解析成一个Date对象

        String str = "2001-02-09";
        //2.解析
        SimpleDateFormat  sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf1.parse(str);
        //格式化
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日");
        String result = sdf2.format(date);
        System.out.println(result);



    }
}
