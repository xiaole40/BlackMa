package BlackMaNext.com.lele.mystream;

import java.util.stream.Stream;

public class StreamDemo5 {
    public static void main(String[] args) {
        //一堆零散数据    publicstatic<T> Stream<T> of(T...values)         Stream接口中的静态方法

        Stream.of(1,2,3,4,5).forEach(s-> System.out.println(s));
        System.out.println("=====================");
        Stream.of("a","b","c","d").forEach(s-> System.out.println(s));

    }
}
