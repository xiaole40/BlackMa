package BlackMa.com.lele.a04staticdemo4;
/*
* 总结：
*     静态方法中没有this关键字
*     静态方法中，只能访问静态
*     非静态方法可以访问所有。
* */

public class Student {
    String name;
    int age;
    static String teacherName;

    //this:表示当前方法调用者的地址值
    //这个this：是虚拟机赋值的
    public void show1(Student this){
        System.out.println("this:" + this);
        System.out.println(this.name + ", " + this.age + ", " + teacherName);

        //调用其他方法
        this.show2();
        this.method();

    }

    public void show2(){
        System.out.println("show2");
    }
    public static void method(){
        System.out.println("静态方法");
    }
}
