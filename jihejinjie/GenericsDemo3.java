package BlackMa.com.lele.jihejinjie;

import java.util.ArrayList;

public class GenericsDemo3 {
    public static void main(String[] args) {
        /*
        * 定义一个工具类：ListUtil
        * 类中定义一个静态方法addAll，用来添加多个集合的元素
        * */
        ArrayList<String> list1 = new ArrayList<>();
        ListUtil.addAll(list1,"aaa","bbb","ccc","ddd");
        System.out.println(list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        ListUtil.addAll(list2,1,2,3,4);
        //ListUtil.addAll2(list2,1,2,3,4,1,3,4,6,7);
        System.out.println(list2);
    }
}
