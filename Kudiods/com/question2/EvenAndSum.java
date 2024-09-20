package com.question2;

import java.util.Scanner;

public class EvenAndSum {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int num=sc.nextInt();
	int sumOfEven=0;
for(int i=num;num/10==0;i/=10)
{
	System.out.println(num);
	if(num%2==0)
	{
		sumOfEven=sumOfEven+num;
	
	}
}
System.out.println(sumOfEven);
}
}
