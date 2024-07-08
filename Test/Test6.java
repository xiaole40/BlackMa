package BlackMaNext.com.lele.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Test6 {
    public static void main(String[] args) throws IOException {
        //1.读取数据
        BufferedReader br = new BufferedReader(new FileReader("..\\untitled\\a.txt"));
        String line;
        TreeMap<Integer,String> tm = new TreeMap<>();
        while ((line = br.readLine()) != null){
            String[] arr = line.split("\\.");
            tm.put(Integer.parseInt(arr[0]),line);//生成序号把arr[1]换成line
        }
        br.close();

        //2.写出数据
        BufferedWriter bw = new BufferedWriter(new FileWriter("..\\untitled\\aa2.txt"));
        Set<Map.Entry<Integer, String>> entries = tm.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            String value = entry.getValue();
            bw.write(value);
            bw.newLine();
        }
        bw.close();
    }
}
