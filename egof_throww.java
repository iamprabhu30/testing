package testing_batch;
import java.util.*;
public class egof_throww 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your age");
		int a=sc.nextInt();
		if(a>18)
		{
			System.out.println("Eligible");
		}
		else
		{
			throw new ArrayIndexOutOfBoundsException("not eligible");
			
		}
	}
}
