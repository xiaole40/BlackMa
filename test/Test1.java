package BlackMa.com.lele.test;

import java.util.ArrayList;
/*
* 需求：定义一个集合，添加元素，遍历
* 遍历格式参照：[元素1，元素2，元素3]*/
public class Test1 {
    public static void main(String[] args) {
        //创建集合
        ArrayList<String> list = new ArrayList<>();

        //添加元素
        list.add("廖乐乐真帅");
        list.add("祝英豪真强");
        list.add("李新安真猛");
        list.add("郑伊龙真牛");

        //遍历
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if(i == list.size() - 1){
                System.out.print(list.get(i));
            }else {
                System.out.print(list.get(i) + ", ");
            }
        }
        System.out.println("]");
    }
}
