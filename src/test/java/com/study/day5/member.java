package com.study.day5;
public class member {
    private String name;
    private String address;
    member(String name, String address){
        this.name = name;
        this.address = address; 
    }
    
    void show(){
        System.out.println("å:"+ name +"\tå°å:"+address);
    }
}
