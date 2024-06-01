package BlackMa.com.lele.test;
/*需求:定义一个集合，添加一些学生对象，并进行遍历
学生类的属性为:姓名，年龄。

要求:对象的数据来自键盘录入
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        //1.创建集合
        ArrayList<Student> list = new ArrayList<>();
        //长度为0

        //2.键盘录入学生的信息并添加到集合当中
        Scanner sc  = new Scanner(System.in);
//        Student s = new Student(); //放外面输出全部都是最后一个对象
        for (int i = 0; i < 4; i++) {
            Student s = new Student();
            System.out.print("请输入学生的姓名：");
            String name = sc.next();
            System.out.print("请输入学生年龄：");
            int age = sc.nextInt();

            //把name和age赋值给学生对象
            s.setName(name);
            s.setAge(age);

            //把学生对象添加到集合当中
            list.add(s);
        }

        //集合里面是否有学生对象
        //有？ 没有？
//        System.out.println(list.size());//3

        //遍历
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            //i 索引 list.get() 元素/学生对象
            Student stu = list.get(i);
            System.out.print(stu.getName() +" "+ stu.getAge()+", ");
        }
        System.out.println("]");
    }
}
