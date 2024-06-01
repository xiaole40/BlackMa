package BlackMa.com.lele.test;
/*需求:
定义Javabean类: Phone
Phone属性: 品牌，价格。
main方法中定义一个集合，存入三个手机对象。
分别为: 小米，108日。苹果，8888。锤子2999.
定义一个方法，将价格低于3@e的手机信息返回。
*/

import java.util.ArrayList;

public class Test8 {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<Phone> list = new ArrayList<>();

        //2.创建手机对象
        Phone p1 = new Phone("小米",1000);
        Phone p2 = new Phone("华为",8000);
        Phone p3 = new Phone("苹果",2999);

        //3.添加数据
        list.add(p1);
        list.add(p2);
        list.add(p3);

        //4.调用方法
        ArrayList<Phone> phoneInfoList = getPhoneInfo(list);

        //5.遍历
        for (int i = 0; i < phoneInfoList.size(); i++) {
            Phone phone = phoneInfoList.get(i);
            System.out.println(phone.getBrand() + ", " + phone.getPrice());
        }

    }

    //技巧
    //如果我们要返回多个数据，可以把这些数据先放到一个容器当中，再把容器返回
    //集合 数组
    public static ArrayList<Phone> getPhoneInfo(ArrayList<Phone> list){
        //定义一个集合用于存储价格低于3000的手机对象
        ArrayList<Phone> resultList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Phone p = list.get(i);
            int price = p.getPrice();
            //如果当前手机的价格低于3000，那么就把手机对象添加到resultList中
            if(price < 3000){
                resultList.add(p);
            }
        }
        return resultList;
    }
}
