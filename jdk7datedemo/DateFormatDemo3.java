package BlackMa.com.lele.jdk7datedemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatDemo3 {
    public static void main(String[] args) throws ParseException {
        /*
        * 需求：
        * 秒杀活动：2023年11月11日 0:0:0    (毫秒值)
        * 开始时间：2023年11月11日 0:10:0   (毫秒值)
        *
        * 小贾下单并付款的时间为：2023年11月11日 0:01:00
        * 小皮下单并付款的时间为：2023年11月11日 0:11:00
        * 用代码说明两位同学有没有参加上秒杀活动？
        * */

        //1.定义字符串表示三个时间
        String startStr = "2023年11月11日 0:0:0";
        String endStr = "2023年11月11日 0:10:0";
        String orderStr = "2023年11月11日 0:01:0";

        //2.解析上面三个时间，得到Date对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date stractDate = sdf.parse(startStr);
        Date endDate = sdf.parse(endStr);
        Date orderDate = sdf.parse(orderStr);

        //3.得到三个时间的毫秒值
        long stractTime = stractDate.getTime();
        long endTime = endDate.getTime();
        long orderTime = orderDate.getTime();

        //4.判断
        if (orderTime >= stractTime && orderTime <= endTime){
            System.out.println("参加秒杀活动成功");
        }else{
            System.out.println("参加秒杀活动失败");
        }


    }
}
