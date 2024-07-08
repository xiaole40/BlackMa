package BlackMaNext.com.lele.myiotest1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Test8 {
    public static void main(String[] args) throws IOException {
        /*
        *   需求：
        *       将多个自定义对象序列化到文件中，但是对象的个数不确定，该如何操作呢？
        * */

        //1.序列化对象
        Student s1 = new Student("zhangsan",23,"南京");
        Student s2 = new Student("lisi",24,"上饶");
        Student s3 = new Student("wangwu",25,"南昌");

        ArrayList<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("..\\untitled\\c.txt"));
        /*oos.writeObject(s1);
        oos.writeObject(s2);
        oos.writeObject(s3);*/
        oos.writeObject(list);
        oos.close();

    }

}
