package com.question1;

import java.util.ArrayList;
import java.util.Arrays;

public class Students {
private int roll;
private String name;
private  int marks;

public Students(int roll, String name, int marks) {
	super();
	this.roll = roll;
	this.name = name;
	this.marks = marks;
}

public static void main(String[] args) {
	Students s1=new Students(1,"Akash",60);
	Students s2=new Students(2,"Vishal",50);
	Students s3=new Students(3,"Sham",40);
	
	ArrayList<Students> array=new ArrayList<Students>();
	array.add(s1);
	array.add(s2);
	array.add(s3);
	//System.out.println(array.size());
	for(int i=array.size()-1;i>=0;i--)
	{
		Students s=array.get(i);
		System.out.println("Roll no:"+s.roll);
		System.out.println("Name:"+s.name);
		System.out.println("Marks:"+s.marks);
		System.out.println();
	}
}
}
