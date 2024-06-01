package com.lege;

import java.util.InputMismatchException;
import java.util.Scanner;

public class zhengshu {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner scanner = new Scanner(System.in);
        try {
            for (int i = 1; i < arr.length+1; i++) {
                System.out.print("请输入第"+i+"个整数：");
                arr[i] = scanner.nextInt();
            }
            for(int j=1;j<arr.length+1;j++)
                System.out.println(arr[j]);
        }catch(InputMismatchException e){
            System.out.println("请输入整数!");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("数组越界，请输入5个数!");
        }finally {
            System.out.println("感谢使用本程序！");
        }

    }
}
