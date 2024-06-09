package BlackMaNext.com.lele.mapdemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class MapDemo3 {
    public static void main(String[] args) {
        //Map集合的第二种遍历方式

        //1.创建Map集合的对象
        Map<String,String> map = new HashMap<>();

        //2.添加元素
        //键：人物的外号
        //值：人物的名字
        map.put("标枪选手","马超");
        map.put("人物挂件","明世隐");
        map.put("御龙选手","尹志平");


        //3.Map集合的第二种遍历方式
        //通过键值对对象进行遍历
        //3.1通过一个方法获取所有的键值对对象，返回一个Set集合
        Set<Map.Entry<String, String>> entries = map.entrySet();
        //3.2遍历entries这个集合，去得到里面的每一个键值对对象
        //迭代器表达方式
        /*Iterator<Map.Entry<String, String>> it = entries.iterator();
        while (it.hasNext()){
            Map.Entry<String, String> key = it.next();
            //因为map.get(key)这个方法是用来通过键获取值的，
            // 但是在这里我们已经有了键值对对象key，
            // 所以直接可以通过key.getValue()方法获取对应的值。
            String value = key.getValue();
            //因为在这里key是表示键值对的对象，所以需要通过getKey()方法获取键的值，
            // 而不是直接打印整个key对象。
            System.out.println(key.getKey() + " = " + value);
        }*/


        ////lamdba表达式

        entries.forEach(new Consumer<Map.Entry<String, String>>() {
            @Override
            public void accept(Map.Entry<String, String> stringStringEntry) {
                String key = stringStringEntry.getKey();
                String value = stringStringEntry.getValue();
                System.out.println(key + " = " + value);
            }
        });
        /*for (Map.Entry<String, String> entry : entries) {//entry --> "标枪选手","马超"
            //3.3利用entry调用get方法获取键和值
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " = " + value);
        }*/
    }
}
