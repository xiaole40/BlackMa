package BlackMa.com.lele.a02oopextensdemo02;

import java.io.IOException;
import java.util.Scanner;

public class Test   {
    public static void main(String[] args) throws IOException {
        Zi z = new Zi();

        //把对象的地址值以16进制的形式打在控制台上
        //System.out.println(Long.toHexString(VM.current().addressOf(z)));

        //因为内存分析工具需要程序不停止
        Scanner sc = new Scanner(System.in);
        sc.next();
    }
}

class Fu{
    private int a = 0x111;
    int b = 0x222;

    public void fuShow1(){
        System.out.println("public --- FuShow");
    }

    private void fuShow2(){
        System.out.println("private --- FUShow");
    }
}

class Zi extends Fu{
    int c = 0x333;

    public void ziShow(){
        System.out.println("public --- ZiShow");
    }
}
