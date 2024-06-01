package BlackMa.com.lele.sortcode;

public class RecursionDemo2 {
    public static void main(String[] args) {
        //需求
        //5! = 5 * 4 * 3 * 2 * 1
        //找规律 找出口
        /*
        * 5! = 5 * 4!
        * 4! = 4 * 3!
        * 3! = 3 * 2!
        * 2! = 2 * 1!
        * 1! = 1
        * */

        System.out.println(getFactorialRecursion(5));//120

    }

    public static int getFactorialRecursion(int number){
        if (number == 1){
            return 1;
        }
        return number * getFactorialRecursion(number - 1);
    }
}
