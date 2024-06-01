package com.lege;

public class JCeng {
    public static void main(String[] args) {
        //使用 while 循环语句计算 1+1/2!+1/3!+1/4!+…+1/20!的结果。
        double shu = 0 , jieg = 1 , i=1;
        while (i<=20){
            jieg *= (1.0/i);
            shu +=jieg;
            i++;
        }
        System.out.println("结果："+shu);
    }
}
