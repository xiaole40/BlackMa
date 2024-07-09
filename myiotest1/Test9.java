package BlackMaNext.com.lele.myiotest1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Test9 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //1.创建反序列化流的对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("..\\untitled\\userinfo.txt"));

        //2.读取数据
        /*Object s1 = (Student) ois.readObject();
        Object s2 = (Student) ois.readObject();
        Object s3 = (Student) ois.readObject();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);*/

        ArrayList<Student> list = (ArrayList<Student>) ois.readObject();
        for (Student student : list) {
            System.out.println(student);
        }


        //3.释放资源
        ois.close();
    }
}
