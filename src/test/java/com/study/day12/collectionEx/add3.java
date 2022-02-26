package com.study.day12.collectionEx;
import java.util.HashSet;
public class add3 {
    public static void main(String[] args) {
        HashSet<student> s = new HashSet();
        s.add(new student("a", 78, 65));
        s.add(new student("b", 78, 65));
        s.add(new student("c", 78, 65));
        s.add(new student("d", 78, 65));
        s.add(new student("e", 78, 65));
        for (student o : s) {
            System.out.println(o.show());
        }
        System.out.println(s);
    }
}