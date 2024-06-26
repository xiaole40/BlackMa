package BlackMaNext.com.lele.function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;

public class FunctionDemo9 {
    /*
    *   需求：
    *       创建集合添加学生对象
    *       学生对象属性：name age
    *   要求：
    *       把姓名和年龄拼接成：张三-23的字符串，并放到数组当中
    *       使用方法引用完成
    * */
    public static void main(String[] args) {
        ArrayList<Student> list2 = new ArrayList<>();
        list2.add(new Student("zhangsan",23));
        list2.add(new Student("lisi",24));
        list2.add(new Student("wangwu",25));
        list2.add(new Student("zhaoliu",26));
        String[] arr = list2.stream().map(student -> student.getName() + "-" + student.getAge()).toArray(String[]::new);
        System.out.println(Arrays.toString(arr));

    }
}
