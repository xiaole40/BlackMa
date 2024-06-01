package BlackMa.com.lele.stringBuilderdemo;

public class StringBuliderDemo1 {
    public static void main(String[] args) {
        //1.创建对象
        StringBuilder sb = new StringBuilder("abc");

        //2.添加元素
//        sb.append(1);
//        sb.append(2.3);
//        sb.append(true);

        //反正
        sb.reverse();//cba

        //获取长度
        int len = sb.length();
        System.out.println(len);

        //2.打印
        //普及
        //因为StringBuilder是Java已经写好的类
        //Java对底层对他做了一些特殊处理
        //打印对象不是地址值而是属性值
        System.out.println(sb);
    }

}
