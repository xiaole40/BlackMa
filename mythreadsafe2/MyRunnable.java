package BlackMaNext.com.lele.mythreadsafe2;

public class MyRunnable implements Runnable {

    int ticket = 0;

    @Override
    public void run() {
        //1.循环
        //2.同步代码块（同步方法）
          while (true){
                  if (method()) break;
          }
    }
    //Ctrl + Alt +M 抽取方法块
    //this
    private synchronized boolean method() {
        //3.判断共享数据是否到了末尾，如果到了
        if (ticket == 100){
            return true;
        }else{
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ticket++;
            System.out.println(Thread.currentThread().getName() + "在卖第" + ticket + "张票！");
        }
        return false;
    }
}
