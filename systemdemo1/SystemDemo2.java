package BlackMa.com.lele.systemdemo1;

public class SystemDemo2 {
    public static void main(String[] args) {
        //判断1 ~ 100000之间所有的质数

        long start = System.currentTimeMillis();

        for (int i = 1; i < 100000; i++) {
            boolean flag = isPrime1(i);
            if (flag){
                System.out.println(i);
            }
        }

        long end = System.currentTimeMillis();
        //获取程序运行的总时间
        System.out.println(end - start);

    }

    //以前的方式来判断的
    public static boolean isPrime1(int number){
        for (int i = 2; i < number; i++) {
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }

    //改进之后的方式来判断的  --- 效率更高
    public static boolean isPrime2(int number){
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }

}
