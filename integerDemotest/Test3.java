package BlackMa.com.lele.integerDemotest;

public class Test3 {
    public static void main(String[] args) {
        /*
        *   定义一个方法自己实现toBinaryString方法的效果，将一个十进制整数转成字符串表示的二进制
         * */

        System.out.println(toBinaryString(10));
    }

    public static String toBinaryString(int number){
        //核心逻辑:
        //不断的去除以2，得到余数，一直到商为日就结束。
        //还需要把余数倒着拼接起来

        //定义一个StringBuilder用来拼接余数
        StringBuilder sb = new StringBuilder();
        while(true){
            if(number == 0){
                break;
            }

            //获取余数  %
            int remaindar = number % 2;
            //倒着拼接
            sb.insert(0,remaindar);
            //除以 2   /
            number = number / 2;

        }
        return sb.toString();
    }
}
