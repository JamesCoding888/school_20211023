package com.study.day5;
public class practice {
    public static void main(String[] args) {
        int[] x = new int[]{1,2,3};       
        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);
        System.out.println("The length of x array:" + x.length);
        // 底下的寫法比較好! 
        int[] y = new int[3];
        y[0] = 1;
        y[1] = 2;
        y[2] = 3;
        System.out.println(y[0]);
        System.out.println(y[1]);
        System.out.println(y[2]);
        System.out.println("The length of y array:" + y.length);
    }
}
