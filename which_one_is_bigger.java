package testing_batch;

public class which_one_is_bigger
{
	public static void main(String args[])
	{
		int a=1000;
		int b=7000;
		int c=8001;
		if((a>b)&&(a>c))
		{
			System.out.println("A is bigger");
		}
		else if((b>a)&&(b>c))
		{
			System.out.println("B is bigger");
		}
		else
		{
			System.out.println("C is bigger");
		}
	}

}
