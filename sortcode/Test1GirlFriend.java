package BlackMa.com.lele.sortcode;

public class Test1GirlFriend {
    //要求1：属性有姓名，年龄，身高
    private String name;
    private int age;
    private double height;


    public Test1GirlFriend() {
    }

    public Test1GirlFriend(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return height
     */
    public double getHeight() {
        return height;
    }

    /**
     * 设置
     * @param height
     */
    public void setHeight(double height) {
        this.height = height;
    }

    public String toString() {
        return "Test1GirlFriend{name = " + name + ", age = " + age + ", height = " + height + "}";
    }
}
