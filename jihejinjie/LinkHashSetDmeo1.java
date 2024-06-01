package BlackMa.com.lele.jihejinjie;

import java.util.LinkedHashSet;

public class LinkHashSetDmeo1 {
    public static void main(String[] args) {
        //1.创建4个学生对象
        HashSetStudent s1 = new HashSetStudent("zhangsan",23);
        HashSetStudent s2 = new HashSetStudent("lisi",24);
        HashSetStudent s3 = new HashSetStudent("wangwu",25);
        HashSetStudent s4 = new HashSetStudent("zhangsan",23);

        //2.创建集合对象
        LinkedHashSet<HashSetStudent> lhs = new LinkedHashSet<>();

        //3.添加元素
        System.out.println(lhs.add(s1));
        System.out.println(lhs.add(s2));
        System.out.println(lhs.add(s3));
        System.out.println(lhs.add(s4));

        //打印集合
        System.out.println(lhs);
    }
}
