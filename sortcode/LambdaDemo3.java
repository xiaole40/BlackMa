package BlackMa.com.lele.sortcode;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaDemo3 {
    public static void main(String[] args) {
        /*
        *   Lambda的省略规则：
        *       1.参数类型可以省略不写.
        *       2.如果只有一个参数，参数类型可以省略，同时()也可以省略
        *       3.如果Lambda表达式的方法体只有一行，大括号，分号，return可以省略不写，需要同时省略
        * */

        Integer[] arr = {2, 3, 1, 5, 6, 7, 8, 4,  9};

        /*Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });*/

        //lambda完整格式进行改写
        /*Arrays.sort(arr,(Integer o1, Integer o2)-> {
                return o1 - o2;
            }
        );*/
        //lambda省略写法
        Arrays.sort(arr,(o1, o2)-> o1 - o2);//[1, 2, 3, 4, 5, 6, 7, 8, 9]
        //Arrays.sort(arr,(o1, o2)-> o2 - o1);//[9, 8, 7, 6, 5, 4, 3, 2, 1]

        System.out.println(Arrays.toString(arr));
    }
}
