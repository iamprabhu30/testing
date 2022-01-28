package testing_batch;
import java.util.*;

import javax.swing.plaf.synth.SynthSpinnerUI;
public class Armstrongno
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		int n=a;
		int arm=0;
		String leng=String.valueOf(a);
		int len=leng.length();
		while(a>0)
		{
			int rem=a%10;
			int cube=rem^len;
			arm=arm+cube;
			a=a/10;
		}
		if(n==arm)
		{
			System.out.println("This is an Armstrong number");
		}
		else
		{
			System.out.println("This is not an Armstrong number");
		}
		
	}
}
