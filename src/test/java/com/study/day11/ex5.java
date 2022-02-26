package com.study.day11;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Stream;
public class ex5 {
    public static void main(String[] args) {
        // ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);
        System.out.println(arrayList);
        Integer[] number = {10,20,30,40,50};
        Arrays.asList(number).forEach(n -> System.out.printf("%d ", n));
        System.out.println();
        Stream.of(number).forEach(n -> System.out.printf("%d ", n));
        System.out.println();
        //HashSet
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(10);
        hashSet.add(10); 
        hashSet.add(30);
        hashSet.add(20);
        hashSet.add(40);
        System.out.println("HashSet 資料不允許重複，資料順序自行排序: " + hashSet);
        
        // TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(10);
        treeSet.add(30);
        treeSet.add(20);
        treeSet.add(40);
        // 順序由小到大
        System.out.println("TreeSet 資料不允許重複，資料有小到大: " + treeSet);
        // 順序由大到小
        treeSet.stream().sorted(Comparator.reverseOrder()).forEach(n -> System.out.printf("%d ", n));
        System.out.println();
        // Queue
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(10);
        queue.add(10);
        queue.add(30);
        queue.add(20);
        queue.add(40);
        System.out.println("PriorityQueue 資料允許重複，資料柱列排列: " + queue);
        // PriorityQueue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(10);
        priorityQueue.add(10);
        priorityQueue.add(30);
        priorityQueue.add(20);
        priorityQueue.add(40);
        System.out.println("PriorityQueue 資料允許重複，資料柱列排列: " + priorityQueue);
        // HashMap
        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("java7",100);
        hashMap.put("java7",100); // Key 不允許重複，取最後一個
        hashMap.put("java7",300); 
        hashMap.put("java8",100); 
        hashMap.put("java8",300);
        hashMap.put("java9",400);
        hashMap.put("java10",500);
        System.out.println("HashMap 資料 <Key 不允許重複 , Value 可允許重複>，順序自行排列: " + hashMap);
        // TreeMap
        TreeMap<String, Integer> treeMap1 = new TreeMap<>();
        treeMap1.put("java7",100);
        treeMap1.put("java7",100); // Key 不允許重複，取最後一個
        treeMap1.put("java7",300); 
        treeMap1.put("java8",100); 
        treeMap1.put("java8",300);
        treeMap1.put("java9",400);
        treeMap1.put("java10",500);
        System.out.println("TreeMap 資料 <Key 不允許重複 , Value 可允許重複>，順序自行排列: " + treeMap1);
        
        // TreeMap<String, Integer> 不一定由 Key 有小到大，因為是用 String 
        TreeMap<String, Integer> treeMap2 = new TreeMap<>();
        treeMap2.put("7",100);
        treeMap2.put("7",100); // Key 不允許重複，取最後一個
        treeMap2.put("7",300); 
        treeMap2.put("8",100); 
        treeMap2.put("8",300);
        treeMap2.put("9",400);
        treeMap2.put("10",500);
        System.out.println("TreeMap 資料 <Key 不允許重複 , Value 可允許重複>，順序自行排列: " + treeMap2);
        // TreeMap<Integer, Integer> 一定由 Key 有小到大排列
        TreeMap<Integer, Integer> treeMap3 = new TreeMap<>();
        treeMap3.put(7,100);
        treeMap3.put(7,100); // Key 不允許重複，取最後一個
        treeMap3.put(7,300); 
        treeMap3.put(8,100); 
        treeMap3.put(8,300);
        treeMap3.put(9,400);
        treeMap3.put(10,500);
        System.out.println("TreeMap 資料 <Key 不允許重複 , Value 可允許重複>，順序自行排列: " + treeMap3);
        // TreeMap 轉 Collection
        TreeMap<String, Integer> book = new TreeMap();
        book.put("java7", 100);
        book.put("java8", 200);
        book.put("aweb", 100);

        System.out.println(book);

        Set<String> k = book.keySet();
        Collection<Integer> v = book.values();

        for (String o : k) {
            System.out.print(o + " ");
        }

        System.out.println("\n===================");
        for (Integer o : v) {
            System.out.print(o + " ");
        }
    }
}
