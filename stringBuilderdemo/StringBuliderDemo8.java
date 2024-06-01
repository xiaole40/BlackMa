package BlackMa.com.lele.stringBuilderdemo;

public class StringBuliderDemo8 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        //容量：最多装多少
        //长度：已经装了多少
//        System.out.println(sb.capacity());
//        System.out.println(sb.length());

//        sb.append("abc");
        sb.append("abcdefghijklmnopqrstuvwxyz");//扩容到原来的（2倍+2）34
        System.out.println(sb.capacity());
        System.out.println(sb.length());
    }
}
