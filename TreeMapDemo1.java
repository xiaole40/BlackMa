package BlackMaNext.com.lele.mapdemo;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo1 {
    public static void main(String[] args) {
        /*
        *   TreeMap集合：基本应用
        *       需求1.
        *           键：整数表示id
        *           值：字符串表示商品的名称
        *           要求：按照id的升序排列、按照id的降序排列
        * */

        //1.创建集合对象
        //Integer Double 默认情况下都是按照升序排列的
        //string 按照字母再ASCII码表中对应的数字升序进行排列
        //abcdefg ..
        TreeMap<Integer,String> tm = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                //o1:表示当前要添加的元素
                //o2:表示已经在红黑树中存在的元素
                return o2- o1;

            }
        });

        //2.添加元素
        tm.put(1,"白象");
        tm.put(2,"康师傅");
        tm.put(3,"汤达人");
        tm.put(4,"劲爽");
        tm.put(5,"统一");

        //3.打印集合
        System.out.println(tm);








    }
}
