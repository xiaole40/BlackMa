package BlackMa.com.lele.test;
/*需求:
定义Javabean类: Phone
Phone属性: 品牌，价格。
main方法中定义一个集合，存入三个手机对象。
分别为: 小米，108日。苹果，8888。锤子2999.
定义一个方法，将价格低于3@e的手机信息返回。
*/
public class Phone {
    //Phone属性：品牌 价格
    private String brand;
    private int price;

    public Phone() {
    }

    public Phone(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
