package BlackMa.com.lele.neibulei6;

public class Test {
    public static void main(String[] args) {
        /*
        * new 类名或者接口名(){
        *     重写方法;
        * };
        * */


        //编写匿名内部类的代码
        new Swim(){
            @Override
            public void swim() {
                System.out.println("重写了游泳的方法");
            }
        };


        new Animal(){

            @Override
            public void eat() {
                System.out.println("重写了eat方法");
            }
        };

        method(


                new Animal() {
                    @Override
                    public void eat() {
                        System.out.println("狗吃骨头");
                    }
                }
        );

    }

    public static void method(Animal a){//Animal a = 子类对象 多态
        a.eat();//编译看左边，运行看右边
    }
}
