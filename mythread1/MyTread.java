package BlackMaNext.com.lele.mythread1;

public class MyTread extends Thread {
    @Override
    public void run() {
        //书写线程要执行代码
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + "廖乐乐好坏");
        }
    }
}
