package com.study.day12.collectionEx;
public class add1 {
    public static void main(String[] args) {
		student[] s=new student[4];
		s[0]=new student("a",45,65);
		s[1]=new student("b",45,65);
		s[2]=new student("c",45,65);
		s[3]=new student("d",45,65);
		for(student o:s)
		{
			System.out.println(o.show());
		}
	}
}
