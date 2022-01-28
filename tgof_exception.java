package testing_batch;
public class tgof_exception 
{
	public static void main(String args[])
	{
		try
		{
			int a=10;
			int b=1;
			int c=(a/b);
			System.out.println(c);
			System.exit(2);
		}
		catch(ArithmeticException e)
		{
			System.out.println("invalid");
			
		}
		finally
		{
			System.out.println("i am finally");
		}
	}
}

