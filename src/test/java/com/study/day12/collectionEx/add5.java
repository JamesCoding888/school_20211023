package com.study.day12.collectionEx;
import java.util.PriorityQueue;
public class add5 {
 	public static void main(String[] args) {
            PriorityQueue<student> s = new PriorityQueue();
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