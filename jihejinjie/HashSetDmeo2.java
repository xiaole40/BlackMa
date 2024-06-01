package BlackMa.com.lele.jihejinjie;

import java.util.HashSet;

public class HashSetDmeo2 {
    public static void main(String[] args) {
        /*
        *   需求:创建一个存储学生对象的集合，存储多个学生对象。
        *       使用程序实现在控制台遍历该集合。
        *       要求:学生对象的成员变量值相同，我们就认为是同一个对象
        * */

        //创建三个学生对象
        HashSetStudent s1 = new HashSetStudent("zhangsan",23);
        HashSetStudent s2 = new HashSetStudent("lisi",24);
        HashSetStudent s3 = new HashSetStudent("wangwu",25);
        HashSetStudent s4 = new HashSetStudent("zhangsan",23);

        //2.创建集合用来添加学生
        HashSet<HashSetStudent> hs = new HashSet<>();

        //3.添加元素
        System.out.println(hs.add(s1));
        System.out.println(hs.add(s2));
        System.out.println(hs.add(s3));
        System.out.println(hs.add(s4));//重写hashCode返回false，反之true

        //打印集合
        System.out.println(hs);
    }
}
