package com.study.day9.SB;

import com.study.day9.SA.student1;
import com.study.day9.SA.student2;

public class B extends student1 implements student2 {
    int eng;
    public B(String name, int eng){
        super(name);
        this.eng = eng;
    }
    @Override
    public void skill(){
        System.out.println("B skill");
    }
    @Override
    public String show(){
        return  super.show()+ "\teng:" + eng;
    }
}
