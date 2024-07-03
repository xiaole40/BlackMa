package BlackMaNext.com.lele.myio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ByteStreamDemo6 {
    public static void main(String[] args) throws IOException {
        /*
        *   字节输入流细节：
        *       1.创建字节输入流对象
        *           细节1：如果文件不存在，就直接报错
        *           输出流：不存在，创建
        *                   把数据写到文件当中
        *           输入流：不存在，报错
        *                   因为创建出来的文件是没有数据的，没有任何意义
        *                   所有java就没有设计这种没有意义的逻辑，文件不存在就会报错
        *       2.写数据：
        *           细节1：一次读一个字节，读出来的是数据在ACSII上对应的数字
        *           细节2：读到文件末尾了，read方法范湖-1
        *       3.释放资源：
        *           细节：每次使用完流之后都要释放资源
        * */
        //1.创建对象
        FileInputStream fis = new FileInputStream("..\\untitled\\b.txt");
        //2.读取数据
        int b1 = fis.read();
        System.out.println((char)b1);
        //3.释放资源
        fis.close();
    }
}
