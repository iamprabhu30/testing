package testing_batch;
import java.util.*;
public class grade
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the mark");
		
		int mark=sc.nextInt();
		if(mark==100)
		{
			System.out.println("Your Grade was A+");
		}
		else if((mark>95) && (mark<=90))
		{
			System.out.println("Your Grade was A");
			
		}
		else if((mark>85) && (mark<=94))
		{
			System.out.println("Your Grade was B+");
		}
		else if((mark>=70)&&(mark<=84))
		{
			System.out.println("got a pass mark");
		}
		
		else
		{
			System.out.println("fail");
		}
		
	}

}
