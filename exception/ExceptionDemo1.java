package BlackMaNext.com.lele.exception;

public class ExceptionDemo1 {
    public static void main(String[] args) {
        /*
        *   格式：
        *       try{
        *           可能出现异常的代码;
        *       }catch(异常类名 变量名){
        *           异常的处理代码;
        *       }
        *       好处：可以让程序继续往下执行，不会停止
        * */
        int[] arr = {1,2,3,4,5,6};
        try {
            //可能出现异常的代码
            System.out.println(arr[10]);//此处出现了异常代码，程序就会在这创建一个ArrayIndexOutBoundException对象
                                        //new ArrayIndexOutBoundException();
                                        //拿着这个对象到catch的小括号中对比，看看括号是否可以接收这个对象
                                        //如果能接收，就表示该异常就被捕获（抓住），执行catch里面对应的代码
                                        //当catch里面所有的代码执行完毕，继续执行try...catch体系下的其他代码
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("索引越界了");
        }
        System.out.println("看看我执行了吗？");
    }
}
