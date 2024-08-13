package BlackMaNext.com.lele.myreflect1;

public class MyReflectDemo1 {
    public static void main(String[] args) throws ClassNotFoundException {
        /*
        *   获取class对象的三种方式：
        *       1.Class.forName("全类名")
        *       2.类名.class
        *       3.对象.getClass();
        * */

        //1.第一种方式
        //全类名：包名 + 类名
        Class<?> clazz1 = Class.forName("BlackMaNext.com.lele.myreflect1.Student");

        //2.第二种方式
        Class clazz2 = Student.class;

        //3.第三种方式
        Student s = new Student();
        Class clazz3 = s.getClass();

        System.out.println(clazz1 == clazz2);
        System.out.println(clazz2 == clazz3);
    }
}
