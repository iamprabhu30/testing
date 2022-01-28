package testing_batch;
import java.util.*;
public class dividentvalue 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int value=sc.nextInt();
		int a=value%3;
		int b=value%7;
		int c=value%17;
		int d=value%25;
		int e=a+b+c+d;
		System.out.println("The summation value is "+e);
		if(e%2==0)
		{
			System.out.println("This is even number");
		}
		else
		{
			System.out.println("This is odd number");
		}
		
				
	}
	

}
