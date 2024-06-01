package BlackMa.com.lele.finaltest1;

public class Test1 {
    public static void main(String[] args) {
        /*
        * final 修改基本数据类型：记录的值不能发生改变
        * final 修饰引用数据类型：记录的地址值不能发生改变，内部的属性值还是可以改变的
        *
        * 核心：
        *     常量记录的数据是不能发生改变的
        *
        *  字符串是不可改变的
        * */

        final double PI = 3.14;

        //创建对象
         final Student s = new Student("zhangsan",23);

         //记录的地址值不能发生改变，内部的属性值还是可以改变的
        //s = new Student;
         s.setName("李四");
         s.setAge(24);
        System.out.println(s.getName() + ", " + s.getAge());

        //数组
        final int[] ARR = {1,2,3,4,5};

        ARR[0] = 10;
        ARR[1] = 20;

        //遍历数组
        for (int i = 0; i < ARR.length; i++) {
            System.out.println(ARR[i]);
        }
    }
}
