package BlackMa.com.lele.a03oopextensdemo03;

public class Test {
    public static void main(String[] args) {
        Zi z = new Zi();
        z.ziShow();
    }
}

class Fu{
    String name = "Fu";
}

class Zi extends Fu{
    String name = "Zi";
    public void ziShow(){
        String name = "ziShow";
        System.out.println(name);//ziShow
        System.out.println(this.name);//Zi
        System.out.println(super.name);//Fu
    }
}
