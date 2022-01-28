package testing_batch;

import java.util.Scanner;

class conn
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the 1st no");
		int a=sc.nextInt();
		System.out.println("enter the 2nd no");
		int b=sc.nextInt();
		car_model obj =new car_model();
		obj.arithmatic(a, b);
		
	}
}
