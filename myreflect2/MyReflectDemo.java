package BlackMaNext.com.lele.myreflect2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class MyReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        /*
        *   Class类中用于获取构造方法的方法：
        *       Constructor<?>[] getConstructors()
        *       Constructor<?>[] getDeclaredConstructors()
        *       Constructor<?>[] getConstructor(Class<?>... parameterTypes)
        *       Constructor<?>[] getDeclaredConstructor(Class<?>... parameterTypes)
        *
        *
        *   Constructor类中用于创建对戏的方法
        *       T newInstance(Object... initargs)
        *       setAccessible(boolean flag)
        * */

        //1.第一种方式
        //1.获取class字节码文件对象
        Class<?> clazz1 = Class.forName("BlackMaNext.com.lele.myreflect2.Student");

        //2.获取构造方法
        /*Constructor<?>[] cons1 = clazz1.getConstructors();
        for (Constructor<?> con : cons1) {
            System.out.println(con);
        }*/

        /*Constructor<?>[] cons2 = clazz1.getDeclaredConstructors();
        for (Constructor<?> con : cons2) {
            System.out.println(con);
        }*/

        /*Constructor con1 = clazz1.getDeclaredConstructor();
        System.out.println(con1);

        Constructor con2 = clazz1.getDeclaredConstructor(String.class);
        System.out.println(con2);

        Constructor con3 = clazz1.getDeclaredConstructor(int.class);
        System.out.println(con3);*/

        Constructor con4 = clazz1.getDeclaredConstructor(String.class,int.class);
        //System.out.println(con4);

        /*int modifiers = con4.getModifiers();
        System.out.println(modifiers);*/

        //暴力反射：表示临时取消权限的效验
        con4.setAccessible(true);
        Student stu = (Student) con4.newInstance("张三", 23);
        System.out.println(stu);


    }
}
