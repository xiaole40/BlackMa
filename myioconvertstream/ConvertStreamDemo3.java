package BlackMaNext.com.lele.myioconvertstream;

import java.io.*;
import java.nio.charset.Charset;

public class ConvertStreamDemo3 {
    public static void main(String[] args) throws IOException {
        /*
         *   将本地文件中的GBK文件，转成UTF-8
         * */

        //1.JDK11以前的方案
        /*InputStreamReader isr = new InputStreamReader(new FileInputStream("..\\untitled\\d.txt"),"GBK");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("..\\untitled\\d1.txt"),"UTF-8");
        int b;
        while ((b = isr.read()) != -1){
            osw.write(b);
        }
        osw.close();
        isr.close();*/

        //1.替代方案
        FileReader fr = new FileReader("..\\untitled\\d.txt", Charset.forName("GBK"));
        FileWriter fw = new FileWriter("..\\untitled\\d2.txt", Charset.forName("UTF-8"));
        int b;
        while ((b = fr.read()) != -1){
             fw.write(b);
        }
        fw.close();
        fr.close();
    }
}
