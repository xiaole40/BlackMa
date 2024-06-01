package BlackMa.com.lele.a06oopextensdemo06;

/*三种动物分别有以下的行为:
        ●哈士奇: 吃饭(吃狗粮)、            喝水、看家、拆家
        ●沙皮狗: 吃饭(吃狗粮、吃骨头)      喝水、看家
        ●中华田园犬:吃饭(吃剩饭)          喝水、看家
*/
public class Test {
    public static void main(String[] args) {
        //创建对象，并调用方法
        Husky h = new Husky();
        h.eat();
        h.drink();
        h.lookhome();
        h.breakhome();

        ChineseDog cd = new ChineseDog();
        cd.eat();
        cd.drink();
        cd.lookhome();
    }
}
