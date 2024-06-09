package BlackMaNext.com.lele.mystream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        /*
        *   定义一个集合，并添加一些整数 1,2,3,4,5,6,7,8,9,10
        *   过滤奇数，只保留偶数
        *   并将结果保存下来
        * */

        //1.定义一个集合
        ArrayList<Integer> list = new ArrayList<>();
        //2.添加一些整数
        Collections.addAll(list,1,2,3,4,5,6,7,8,9,10);
        //3.过滤奇数，只保留偶数
        //进行判断，如果偶数保存下来
        List<Integer> newList = list.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        //打印集合
        System.out.println(newList);


    }
}
