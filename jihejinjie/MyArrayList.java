package BlackMa.com.lele.jihejinjie;

import java.util.ArrayList;
import java.util.Arrays;

/*
*   当我在编写一个类的时候，如果不确定类型，那么这个类就可以定义为泛型
*
*
* */
public class MyArrayList<E> {

    Object[] obj = new Object[10];
    int size;

    //E:表示不确定的类型，该类型在类名后面已经定义了
    //e:形参的名字，变量名
    public boolean add(E e){
        obj[size] = e;
        size++;
        return true;
    }

    public E get(int index){
        return (E)obj[index];
    }

    @Override
    public String toString() {
        return Arrays.toString(obj);
    }
}
