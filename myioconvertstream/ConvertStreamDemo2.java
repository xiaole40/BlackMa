package BlackMaNext.com.lele.myioconvertstream;

import java.io.*;
import java.nio.charset.Charset;

public class ConvertStreamDemo2 {
    public static void main(String[] args) throws IOException {
        /*
        *   利用转换流按照指定字符编码写出
        * */

        /*//1.创建转换流的对象
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("..\\untitled\\d.txt"),"GBK");
        //2.写出数据
        osw.write("你好你好");
        osw.close();*/

        FileWriter fw = new FileWriter("..\\untitled\\d.txt", Charset.forName("GBK"));
        fw.write("你好你好");
        fw.close();
    }
}
