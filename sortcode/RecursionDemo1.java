package BlackMa.com.lele.sortcode;

public class RecursionDemo1 {
    public static void main(String[] args) {
        //需求：利用递归求1~100之间的和
        //100 + 99 + 98 + 97 +...+ 2 + 1

        //1~100之间的和 = 100 + (1~99之间的和)
        //1~99之间的和 = 99 + (1~98之间的和)
        //1~98之间的和 = 98 + (1~97之间的和)
        //...
        //1~1之间的和 = 1 (递归出口)
        System.out.println(getSum(100));//5050


    }

    public static int getSum(int number){
        if (number == 1){
            return 1;
        }
        return number + getSum(number - 1);
    }
}
