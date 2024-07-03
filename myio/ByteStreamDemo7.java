package BlackMaNext.com.lele.myio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ByteStreamDemo7 {
    public static void main(String[] args) throws IOException {
        /*
        *   字节输入流循环读取
        *   read:表示读取数据，而且是读取一个数据就移动一次指针
        * */

        //1.创建对象
        FileInputStream fis = new FileInputStream("..\\untitled\\a.txt");
        //2.循环读取
        int b;
        while ((b = fis.read()) != -1){
            System.out.print((char) b);
        }
        //3.释放资源
        fis.close();
    }
}
