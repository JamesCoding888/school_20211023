/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.study.day8;

/**
 *
 * @author jamesliao
 */
public interface apple {
    public static final String name = "n";
    public static String name1 = "n";
    default double bookPrice(double price){
        return price;
    }
    static double bookPrice2(double price){
        return price;
    }
    abstract double book1Price(double price);
    
}
