package BlackMa.com.lele.jiekou1;

/*
* 青蛙  属性：名字，年龄     行为：吃虫子，蛙泳
* 狗   属性： 名字，年龄     行为：吃骨头，狗刨
* 兔子 属性：  名字，年龄     行为：吃胡萝卜
* */
public class Test {
    public static void main(String[] args) {

        //创建对象
        Frog f = new Frog("小七",2);
        System.out.println(f.getName() + ", " + f.getAge());
        f.eat();
        f.swim();

        Rabbit r = new Rabbit("小包",2);
        System.out.println(r.getName() + ", " + r.getAge());
        r.eat();

    }
}
