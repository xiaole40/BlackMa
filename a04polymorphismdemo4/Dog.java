package BlackMa.com.lele.a04polymorphismdemo4;

public class Dog extends Animal{
    /*1.定义狗类
    行为:
    eat(string something)(something表示吃的东西)
    看家1ookHome方法(无参数)*/


    //空参构造
    //带全部参数构造


    public Dog() {
    }

    public Dog(int age, String color) {
        super(age, color);
    }

    //行为
    //eat(string something)(something表示吃的东西)
    //    看家1ookHome方法(无参数)

    @Override
    public void eat(String something){
        System.out.println(getAge() + "岁的"+ getColor() +"颜色的狗两只前腿死死的抱住"+ something +"猛吃");
    }

    public void lookhome(){
        System.out.println("狗在看家");
    }
}
