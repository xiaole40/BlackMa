package BlackMa.com.lele.jihejinjie;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo2 {
    public static void main(String[] args) {
        //1.创建集合对象
        Collection<Student> coll = new ArrayList<>();

        //2.创建三个学生对象
        Student stu1 = new Student("zhangsan",23);
        Student stu2 = new Student("lisi",24);
        Student stu3 = new Student("wangwu",25);

        //3.把学生对象添加到集合当中
        coll.add(stu1);
        coll.add(stu2);
        coll.add(stu3);

        //4.判断集合中某一个学生对象是否包含
        Student stu4 = new Student("zhangsan",23);
        //如果同姓名和同年龄，就认为是同一个学生
        //因为contains方法在底层是依赖equals方法进行判断对象是否一致的
        //如果存在的是自定义对象，没有重写equals方法，那么默认使用Object类中的equals方法进行判断，
        //而Object类中的equals方法，，依赖地址值进行判断
        //需求：如果同姓名同年龄，就认为是同一个人
        //所以，需要在自定义的javabean类中，重写equals方法就可以了。
        System.out.println(coll.contains(stu4));
    }
}
