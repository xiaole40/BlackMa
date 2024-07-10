package BlackMaNext.com.lele.mythread1;

public class ThreadDemo1 {
    public static void main(String[] args) {
        /*
        *   多线程的第一种启动方式:
        *       1.自己定义一个类继承Thread
        *       2.重写run方法
        *       3.创建子类的对象，并启动线程
        * */

        MyTread t1 = new MyTread();
        MyTread t2 = new MyTread();

        t1.setName("线程1");
        t2.setName("线程2");
        //开启线程
        t1.start();
        t2.start();
    }
}
