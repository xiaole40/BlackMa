package BlackMa.com.lele.sortcode;

import java.util.Arrays;
import java.util.Comparator;

public class Test1 {
    public static void main(String[] args) {
        /*定义数组并存储一些女朋友对象，利用Arrays中的sort方法进行排序
            要求1:属性有姓名、年龄、身高
            要求2:按照年龄的大小进行排序，年龄一样，按照身高排序，身高一样按照姓名的字母进行排序。
            (姓名中不要有中文或特殊字符，会涉及到后面的知识)*/

        //1.创建3个女朋友对象
        Test1GirlFriend gfd1 = new Test1GirlFriend("xiaosisi",18,1.68);
        Test1GirlFriend gfd2 = new Test1GirlFriend("xiaotiantian",19,1.78);
        Test1GirlFriend gfd3 = new Test1GirlFriend("xiaoqianqian",20,1.88);
        Test1GirlFriend gfd4 = new Test1GirlFriend("abc",20,1.88);

        //2、定义数组存储女朋友的信息
        Test1GirlFriend[] arr = {gfd1,gfd2,gfd3,gfd4};

        //3.利用Arrays中的sort方法进行排序
        //匿名内部类，lambda表达式
        /*Arrays.sort(arr, new Comparator<Test1GirlFriend>() {
            @Override
            public int compare(Test1GirlFriend o1, Test1GirlFriend o2) {
                //按照年龄的大小进行排序，年龄一样，按照身高排序，身高一样按照姓名的字母进行排序。
                double temp = o1.getAge() - o2.getAge();
                temp = temp == 0 ? o1.getHeight() - o2.getHeight() : temp;
                temp = temp == 0 ? o1.getName().compareTo(o2.getName()) : temp;

                if (temp > 0){
                    return 1;
                }else if(temp < 0){
                    return -1;
                }else{
                    return 0;
                }
            }
        });*/
        //lambda表达式
        //() -> {}
        //() : 对应着抽象方法的形参
        //{} : 方法体
        Arrays.sort(arr,( o1,  o2)-> {
                //按照年龄的大小进行排序，年龄一样，按照身高排序，身高一样按照姓名的字母进行排序。
                double temp = o1.getAge() - o2.getAge();
                temp = temp == 0 ? o1.getHeight() - o2.getHeight() : temp;
                temp = temp == 0 ? o1.getName().compareTo(o2.getName()) : temp;

                if (temp > 0){
                    return 1;
                }else if(temp < 0){
                    return -1;
                }else{
                    return 0;
                }
        });






        //4.展示一下数组中的内容
        //年龄和身高一样，按照姓名来排序
        System.out.println(Arrays.toString(arr));
    }
}

