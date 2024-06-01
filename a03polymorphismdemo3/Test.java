package BlackMa.com.lele.a03polymorphismdemo3;

public class Test {
    public static void main(String[] args) {
        Animal a = new Dog();
        //编译看左边，运行看右边
        a.eat();
        //多态弊端，不能调用子类的特有功能
//        a.lookhome();

        //解决方案：
        //变回子类类型就可以
        //细节：转换的时候不能瞎转，如果转换其他类就会报错
//        Dog d = (Dog) a;//强制类型转换
//        d.lookhome();

        //新特性
        //先判断a是否为Dog类型，如果是，则强转成Dog类型，转换之后变量名为d
        //如果不是，则不强转，结果直接是false
        if(a instanceof Dog){
            ((Dog) a).lookhome();
        }else{
            System.out.println("没有这个类型，无法转换");
        }




    }
}
class Animal{
    public void eat(){
        System.out.println("动物在吃东西");
    }
}
class Dog extends Animal{
    @Override
    public void eat(){
        System.out.println("狗在吃骨头");
    }

    public void lookhome(){
        System.out.println("狗在看家");
    }
}
