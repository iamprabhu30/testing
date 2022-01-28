package testing_batch;
import java.util.*;
public class skipno7
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	//	System.out.println("Enter the value");
		//int val=sc.nextInt();
		for(int i=1;i<100;i++)
		{
			if(i%10==7)
			{
				continue;
			}
			else 
			{
				System.out.println(i);
			}
		}
	}

}
