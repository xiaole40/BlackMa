package BlackMaNext.com.lele.mythreadsafe3;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread{
    static int ticket = 0;

    static Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true){
            //synchronized (MyThread.class){
            try {
                lock.lock();
                if (ticket == 100){
                    break;
                }else{
                    Thread.sleep(10);
                    ticket++;
                    System.out.println(getName() + "在卖第" + ticket + "张票！");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
            //}
        }

    }
}
