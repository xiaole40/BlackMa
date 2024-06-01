package BlackMa.com.lele.a05oopextensdemo05;


//1.重写方法的名称、形参列表必须与父类中的一致。
//2.子类重写父类方法时，访问权限子类必须大于等于父类(暂时了解 :空着不写<protected<public)
//3.子类重写父类方法时，返回值类型子类必须小于等于父类
//4.建议:重写的方法尽量和父类保持一致。
//5.只有被添加到虚方法表中的方法才能被重写

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.lunch();
    }
}
class Person{
    public void eat(){
        System.out.println("吃米饭，吃菜");
    }
    public void drink(){
        System.out.println("喝开水");
    }
}
class Student extends Person{

    public void lunch(){
        //先在本类中查看eat和drink方法，就会调用子类的，如果没有，就会调用从父类中继承下来的eat和drink方法
        this.eat();
        this.drink();

        //直接调用父类中的eat和drink方法
        super.eat();
        super.drink();
    }
    //应用场景：当父类中的方法，不能满足子类现在的需求时，我们就要把这个方法进行重写
    //注意：子类中重写的方法上面要加@Override
    @Override
    public void eat(){
        System.out.println("吃意大利面");
    }
    @Override
    public void drink(){
        System.out.println("喝凉水");
    }
}
