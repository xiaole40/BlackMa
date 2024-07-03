package BlackMaNext.com.lele.myio;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamDemo5 {
    public static void main(String[] args) throws IOException {
        /*
         *   字节输入流细节：
         *       1.创建字节输入流对象
         *           细节1：如果文件不存在，就直接报错
         *       2.写数据：
         *           细节1：一次读一个字节，读出来的是数据在ACSII上对应的数字
         *           细节2：读到文件末尾了，read方法范湖-1
         *       3.释放资源：
         *           细节：每次使用完流之后都要释放资源
         * */
        //1.创建对象
        FileInputStream fis = new FileInputStream("..\\untitled\\a.txt");
        //2.读取数据
        int b1 = fis.read();
        System.out.println((char)b1);
        //3.释放资源
        fis.close();
    }
}
