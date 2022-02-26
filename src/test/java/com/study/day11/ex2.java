package com.study.day11;

import java.io.File;

public class ex2 {
    public static void main(String[] args) {
        File f = new File("c:/ocp/a.txt");
        try {
            f.createNewFile();            
        } catch (Exception e) {
            System.out.println("無新增權限");
            e.printStackTrace();
        }
    }
}
