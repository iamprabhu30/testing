package testing_batch;

import java.util.Scanner;

public class formulas 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		
		
		System.out.println("enter the choice \t1. area of circle \t2.area of square \t3.area of rectangle \t4.area of triangle");
		int choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:
			System.out.println("enter the radius");
			int r=sc.nextInt();
			double ans=3.14*r*r;
			System.out.println(ans);
			break;
		case 2:
			System.out.println("enter the area");
			int a=sc.nextInt();
			int answ=a*a;
			System.out.println(answ);
			break;
		case 3:
			System.out.println("enter the length");
			int l=sc.nextInt();
			System.out.println("enter the breadth");
			int b=sc.nextInt();
			int answer=l*b;
			System.out.println(answer);
			break;
		case 4:
			System.out.println("enter the length");
			int ln=sc.nextInt();
			System.out.println("enter the breadth");
			int bt=sc.nextInt();
			double answer1=0.5*ln*bt;
			System.out.println(answer1);
			break;
			
			
		}
		
	}

}
