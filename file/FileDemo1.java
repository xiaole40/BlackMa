package BlackMaNext.com.lele.file;

import java.io.File;

public class FileDemo1 {
    public static void main(String[] args) {
        /*
        *   public File(String pathname)                根据文件路径创建文件对象
        *   public File(String parent, String child)    根据父路径名字符串和子路径名字符串创建文件对象
        *   public File(File parent, String child)      根据父路径对应文件对象和子路径字符串名字符串创建文件对象
        *
        *   C:\Users\Default\Desktop
        * */

        //1.根据文件路径创建文件对象
        String str = "C:\\Users\\Default\\Desktop\\a.txt";
        File f1 = new File(str);
        System.out.println(f1);

        //2.父路径:C:\Users\Default\Desktop  子路径:a.txt
        String parent = "C:\\Users\\Default\\Desktop";
        String child  = "a.txt";
        File f2 = new File(parent,child);
        System.out.println(f2);

        File f3 = new File(parent + "\\" + child);
        System.out.println(f3);

        //3.把一个File表示的路径和String表示的路径进行拼接
        File parent2 = new File("C:\\Users\\Default\\Desktop");
        String child2 = "a.txt";
        File f4 = new File(parent2,child2);
        System.out.println(f4);

    }
}
