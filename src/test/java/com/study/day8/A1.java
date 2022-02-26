package com.study.day8;
class A1 extends student {
    private int chi;

    A1(String name, int chi){
        super(name);
        this.chi = chi;
    }
    String show(){
        return super.show() + "\t Chinese: " + chi;
    }
    @Override
    int setChi(int x) {
        return x+2;
    }
   
    A1(String name){
        super(name);        
    }
}