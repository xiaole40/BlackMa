package BlackMa.com.lele.neibulei1;

public class Car {
    String carname;
    int carAge;
    String carcolor;

    public void show(){
        //是打印调研者车的名字：奥迪A8
        System.out.println(carname);//奥迪A8
        Engine e = new Engine();
        System.out.println(e.engineName);
    }


    class Engine{
        String engineName;
        int engineAge;

        public void show(){
            System.out.println(engineName);
            System.out.println(carname);
        }
    }
}
