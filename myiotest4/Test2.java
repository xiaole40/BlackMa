package BlackMaNext.com.lele.myiotest4;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Test2 {
    public static void main(String[] args) throws IOException {
        /*
        *   Properties跟IO流结合的操作
        *
        * */
        //1.创建集合
        Properties prop = new Properties();
        //2.添加数据
        prop.put("aaa","bbb");
        prop.put("ccc","ddd");
        prop.put("eee","fff");
        prop.put("ggg","hhh");

        //3.把集合中的数据以键值对的形式写到本地文件当中
        FileOutputStream fos = new FileOutputStream("E:\\NGJava\\untitled\\a.properties");
        prop.store(fos,"test");
        fos.close();





        /*BufferedWriter bw = new BufferedWriter(new FileWriter("..\\untitled\\a.properties"));
        Set<Map.Entry<Object, Object>> entries = prop.entrySet();
        for (Map.Entry<Object, Object> entry : entries) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            bw.write(key + "=" + value);
            bw.newLine();
        }
        bw.close();*/
    }
}
