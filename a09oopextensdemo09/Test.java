package BlackMa.com.lele.a09oopextensdemo09;
/*
* 1.经理
成员变量:工号，姓名，工资，管理奖金
成员方法:工作(管理其他人)，吃饭(吃米饭)
2.厨师
成员变量:工号，姓名，工资
成员方法:工作(炒菜)，吃饭(吃米饭)
* */
public class Test {
    public static void main(String[] args) {
        //创建对象并赋值调用
        Manager m = new Manager("heima001","张三",15000,8000);
        System.out.println(m.getId() + ", " + m.getName() + ", " + m.getSalary() + ", " + m.getBouns());
        m.work();
        m.eat();


        Cook c = new Cook();
        c.setId("heima002");
        c.setName("李四");
        c.setSalary(8000);
        System.out.println(c.getId() + ", " + c.getName() + ", " + c.getSalary());
        c.work();
        c.eat();
    }
}
