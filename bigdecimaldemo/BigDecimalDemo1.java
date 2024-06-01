package BlackMa.com.lele.bigdecimaldemo;

import java.math.BigDecimal;

public class BigDecimalDemo1 {
    public static void main(String[] args) {
        /*
        * 构造方法获取BigDecimal对象
        *       public BigDecimal(double val)
        *       public BigDecimal(String val)
        *
        * 静态方法获取BigDecimal对象
        *       public static BigDecimal valueOf(double val)
        * */

        //1.通过传递double类型的小数来创建对象
        //细节：
        //这种方式优可能是不精确的，所以不建议使用
        //BigDecimal bd1 = new BigDecimal(0.01);
        //BigDecimal bd2 = new BigDecimal(0.09);

        //System.out.println(bd1);
        //System.out.println(bd2);

        //2.通过传递字符串表示的小数来创建对象
        /*BigDecimal bd3 = new BigDecimal("0.01");
        BigDecimal bd4 = new BigDecimal("0.09");
        BigDecimal bd5 = bd3.add(bd4);
        System.out.println(bd3);
        System.out.println(bd4);
        System.out.println(bd5);*/

        //3.通过静态方法获取对象
        BigDecimal bd6 = BigDecimal.valueOf(10.0);
        BigDecimal bd7 = BigDecimal.valueOf(10.0);
        System.out.println(bd6 == bd7);//false

        //细节：
        //1.如果要表示的数字不大，没有超过double的取值范围，建议使用静态方法
        //2.如果要表示的数字比较大，超过double的取值范围，建议使用构造方法
        //3.如果我们传递的是0~10之间的整数，包含0，包含10那么方法会·返回已经创建好的对象，不会重新new







    }
}
