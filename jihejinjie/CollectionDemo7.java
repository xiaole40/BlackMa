package BlackMa.com.lele.jihejinjie;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class CollectionDemo7 {
    public static void main(String[] args) {
        /*
        *   Collection系列集合三种通用的遍历方式：
        *   1.迭代器遍历
        *   2.增强for循环
        *   3.lambda表达式遍历
        *
        *   lamdba表达式遍历：
        *               default void (Consumer<? super T> action):
        *
        * */

        //1.创建集合并添加数据
        Collection<String> coll = new ArrayList<>();
        coll.add("zhangsan");
        coll.add("lisi");
        coll.add("wangwu");

        //利用lamdba匿名内部类的形式
        //底层原理：
        //其实也会自己遍历集合，依次得到每一个元素
        //把得到的每一个元素，传递到下面的accept方法
        //s依次表示集合中的每一个数据
        /*coll.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/
        //lamdba表达式
        //()->{}
        coll.forEach(s -> System.out.println(s));

    }
}
