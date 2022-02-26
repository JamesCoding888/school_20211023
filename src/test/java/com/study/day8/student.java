package com.study.day8;

abstract class student {
    private String name;

    public student(String name) {
        this.name = name;
    }

    String show(){
        return "name: " + name;
    }
    abstract int setChi(int x);
        
    
}
