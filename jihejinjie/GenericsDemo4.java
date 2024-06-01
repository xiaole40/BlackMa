package BlackMa.com.lele.jihejinjie;

import java.util.ArrayList;

public class GenericsDemo4 {
    /*
    *   泛型接口的两种使用方式：
    *       1.实现类给出具体的类型
    *       2.实现类延续泛型，创建实现类对象时再确定类型
    * */

    public static void main(String[] args) {
        /*MyArrayList2 list =new MyArrayList2();
        list.add("aaa");*/

        MyArrayList3<String> list = new MyArrayList3<>();
    }
}
