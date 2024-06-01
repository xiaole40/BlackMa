package com.lege;

public class JXing {
    public static void main(String[] args) {
        rectangle resser = new rectangle(8,8);
        System.out.println(resser.getHeight());
    }
}
class rectangle{
    public double width;
    public double length;
    public rectangle(double width,double length){
        this.width = width;
        this.length = length;

    }
    public double getHeight(){
        return this.width * this.length;
    }


}
