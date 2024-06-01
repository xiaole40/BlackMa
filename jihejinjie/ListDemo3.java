package BlackMa.com.lele.jihejinjie;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

public class ListDemo3 {
    public static void main(String[] args) {
        /*
        *   List系列集合的五种遍历方式：
        *       1.迭代器
        *       2.列表迭代器
        *       3.增强for
        *       4.lamdba表达式
        *       5.普通for循环
        * */

        //1.创建集合添加元素
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        //2.迭代器
        /*Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String str = it.next();
            System.out.println(str);
        }*/

        //3.增强for
        //下面的变量s，就是一个第三方的变量而已
        /*for (String s : list) {
            System.out.println(s);
        }*/

        //4.Lamdba表达式
        //forEach方法的底层其实就是一个循环遍历，依次得到集合的每一个元素
        //并把每一个元素传递给下面的accept方法
        //accept方法的形参s，依次表示集合中的每一个元素
        //list.forEach( s -> System.out.println(s));

        //5.普通for循环
        //size方法跟get方法还是循环结合的方式，利用索引获取到集合中的每一个元素
        /*for (int i = 0; i < list.size(); i++) {
            //i:依次表示集合中的每一个索引
            String s = list.get(i);
            System.out.println(s);
        }*/

        //6.列表迭代器
        ListIterator<String> it = list.listIterator();
        while (it.hasNext()){
            String str = it.next();
            if ("bbb".equals(str)){
                it.add("qqq");
            }
        }
        System.out.println(list);
    }
}
