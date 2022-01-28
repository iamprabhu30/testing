package testing_batch;
import java.util.*;
public class egof_throwss 
{
	public static void main(String args[])throws ArithmeticException,NullPointerException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age");
		int age=sc.nextInt();
		if(age<18)
		{
			System.out.println("not eligible");
		}
		else
		{
			System.out.println("eligible");
		}
				
	}
}
