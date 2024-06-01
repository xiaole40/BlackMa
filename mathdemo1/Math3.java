package BlackMa.com.lele.mathdemo1;

public class Math3 {
    public static void main(String[] args) {
        //要求统计一共有多少个水仙花数

        int count = 0;
        for (int i = 100; i < 999; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i /100 % 10;
            //判断：每一次的三次方之和跟本身进行比较
            double sum = Math.pow(ge,3) + Math.pow(shi,3) + Math.pow(bai,3);
            if ( sum == i){
                count++;
                //System.out.println(i);//153 370 371 407
            }

        }
        System.out.println(count);//4
    }


}
