package BlackMa.com.lele.a04polymorphismdemo4;

/*根据需求完成代码:
1.定义狗类
属性:
年龄，颜色
行为:
   eat(string something)(something表示吃的东西)
看家1ookHome方法(无参数)

2.定义猫类
属性:
年龄，颜色
行为:
    eat(string something)方法(something表示吃的东西)
   逮老鼠catchMouse方法(无参数)

3.定义Person类//饲养员
属性:
姓名，年龄
行为:
      keepPet(Dog dog,string something)方法
功能:喂养宠物狗，something表示喂养的东西
行为:
      keepPet(cat cat,string something)方法
功能:喂养宠物猫，something表示喂养的东西
生成空参有参构造，set和get方法
4.定义测试类(完成以下打印效果):
       keepPet(Dog dog,string somethind)方法打印内容如下:
      年龄为38岁的老王养了一只黑颜色的2岁的狗
      2岁的黑颜色的狗两只前雕死死的抱住骨头猛吃
      keepPet(cat cat,string somethind)方法打印内容如下:
      年龄为25岁的老李并了-只灰颜色的3岁的猫
      3岁的灰颜色的猫咪着眼睛侧着头吃鱼
5.思考
      1.Doghcat都是Anima1的子类，以上案例中针对不同的动物，定义了不同的keepPet方法，过于繁质，能否简化，并体会简化后的好处?
      2.Dog和Cat虽然都是Animal的了类，但是都有其特有方法，能否想办法keepPet中调川特有方法*/
public class Test {
    public static void main(String[] args) {
        //创建对象并调用方法

        /*Person p1 = new Person("老王",38);
        Dog d = new Dog(2,"黑");
        p1.keepPet(d,"骨头");


        Person p2 = new Person("老李",24);
        Cat c = new Cat(3,"灰");
        p2.keepPet(c,"鱼");*/

        //创建伺养员对象
        Person p = new Person("老王",38);
        Dog d = new Dog(2,"黑");
        Cat c = new Cat(3,"灰");
        p.keepPet(d,"骨头");
        p.keepPet(c,"鱼");

    }
}
