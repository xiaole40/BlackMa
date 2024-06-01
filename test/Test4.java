package BlackMa.com.lele.test;

import java.util.ArrayList;

/*需求:定义一个集合，添加一些学生对象，并进行遍历
学生类的属性为:姓名，年龄.
*/
public class Test4 {
    public static void main(String[] args) {
        //创建集合
        ArrayList<Student> list = new ArrayList<>();

        //2.创建学生对象
        Student s1 = new Student("廖乐乐",22);
        Student s2 = new Student("李新安",23);
        Student s3 = new Student("祝英豪",24);
        Student s4 = new Student("郑伊龙",25);

        //添加元素
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        //3.遍历集合
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            //i 索引 list.get() 元素/学生对象
            Student stu = list.get(i);
            System.out.print(stu.getName() +" "+ stu.getAge()+", ");
        }
        System.out.println("]");
    }
}
