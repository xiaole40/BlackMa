package BlackMaNext.com.lele.file;

import java.io.File;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) throws IOException {
        //需求：在当前模板下的aaa文件夹中创建一个a.txt文件

        //1.创建a.txt的父级路径
        File f1 = new File("myfile\\aaa");
        //2.创建父级路径
        f1.mkdir();
        //3.拼接父级路径和子级路径
        File f2 = new File("a.txt");
        boolean b = f2.createNewFile();
        if (b){
            System.out.println("创建成功");
        }else{
            System.out.println("创建失败");
        }

    }
}
