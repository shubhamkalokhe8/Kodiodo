package com.question3;

import java.util.Scanner;

public class User {
private int age;
private double weight;
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public double getWeight() {
	return weight;
}
public void setWeight(double weight) {
	this.weight = weight;
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the age of user");
	double age = sc.nextInt();
	System.out.println("Enter the weight of User");
	double weight = sc.nextDouble();
	
	if(age>=21 && age<=60)
	{
		System.out.println("Age is valid");
	}
	else {
		throw new InvalidDonarException("Age must be between 21 to 60");
	}
	if(weight>=40 && weight<=70)
	{
		System.out.println("Weight is valid");
	}
	else {
		throw new InvalidDonarException("Weight must be between 40 and 70");
		
	}
}
}
