package com.study.day11;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) throws check{
//        try {
            Order o1 = new Order("a", 1, 2);
            Order o2 = new Order("b", 3, 2);
            Order o3 = new Order("c", 1, 4);
            o1.show();
            o2.show();
            o3.show();
            System.out.println("================================");
            System.out.println("輸入修改 Lcd數值:");
            Scanner sc = new Scanner(System.in);
            int lcd = sc.nextInt();
            assert lcd>=0 : "Lcd 需 >= 0"; // 如果 Lcd < 0 則中斷底下程式執行，並拋出 Lcd 需 >= 0
            o1.setRam(5);                                    
            o1.setLcd(6);
            o1.show();
            o2.show();
            o3.show();
//        } catch (Exception e) {
//            System.out.println("新增 Ram, Lcd 需 >=0"); // 可能有其他 Exception 未為定義到，在這補充一次
//            e.printStackTrace();            
//        }        
    }
}
