package BlackMaNext.com.lele.myiotest1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) throws IOException {
        //拷贝一个文件夹，考虑子文件夹
        //1.创建对象表示数据源
        File src = new File("D:\\aaa\\bbb");
        File bbb = new File("D:\\aaa\\src");

        //3.调用方法开始拷贝
        copydir(src,bbb);

    }

    private static void copydir(File src, File bbb) throws IOException {
        bbb.mkdirs();
        //递归
        //1.进入数据源
        File[] files = src.listFiles();
        //2.遍历数组
        for (File file : files) {
            if (file.isFile()){
                //3.判断文件，拷贝
                FileInputStream fis = new FileInputStream(file);
                FileOutputStream fos = new FileOutputStream(new File(bbb,file.getName()));
                byte[] bytes = new byte[1024];
                int len;
                while ((len = fis.read(bytes)) != -1){
                    fos.write(bytes,0,len);
                }
                fos.close();
                fis.close();
            }else {
                //4.判断文件夹，递归
                copydir(file,new File(src,file.getName()));
            }
        }
    }
}
