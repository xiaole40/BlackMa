package BlackMaNext.com.lele.mapdemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {
        //Map集合的第一种遍历方式

        //1.创建Map集合的对象
        Map<String, String> map = new HashMap<>();

        //2.添加元素
        map.put("尹志平","小龙女");
        map.put("郭靖","黄蓉");
        map.put("李新安","乐美源");

        //3.通过键找值

        //3.1获取所有的键，把这些键放到一个单列集合当中
        /*Set<String> keys = map.keySet();
        Iterator<String> it = keys.iterator();
        while (it.hasNext()){
            //System.out.println(keys);
            //3.3利用map集合中的键获取对应的值，get
            Set<String> value = map.keySet();
            String str = it.next();
            System.out.println( str + "=" + value);
        }*/
        Set<String> keys = map.keySet();
        //迭代器方法
        Iterator<String> it = keys.iterator();
        while (it.hasNext()) {
            String key = it.next();
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }

        /*
        //增强for
        for (String key : keys) {
            //System.out.println(key);
            //3.3利用map集合中的键获取对应的值，get
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }*/
        //3.2遍历单列集合得到每一个键
        //lamdba表达式
        /*keys.forEach((String s)->{
                //System.out.println(key);
                //3.3利用map集合中的键获取对应的值，get
                String value = map.get(s);
                System.out.println(s + " = " + value);
        });*/
    }
}
