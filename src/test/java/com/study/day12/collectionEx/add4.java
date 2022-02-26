package com.study.day12.collectionEx;
import java.util.TreeSet;
public class add4 {
    public static void main(String[] args) {
        TreeSet<student> s = new TreeSet();
        s.add(new student("a", 78, 65));
        s.add(new student("b", 79, 65));
        s.add(new student("c", 80, 65));
        s.add(new student("d", 81, 65));
        s.add(new student("e", 82, 65));
        for (student o : s) {
            System.out.println(o.show());
        }
    }
}