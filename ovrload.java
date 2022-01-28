package testing_batch;

public class ovrload {
	int per(String name)
	{
		String d=name;
		return 0;
		
	}
	int add(int a,int b)
	{
		int c=a+b;
		return c;
	}
	int sub(int a,int b,int d)
	{
		int c=a-b-d;
		return c;
	}


}
class acc
{
	public static void main(String args[])
	{
		ovrload sc=new ovrload();
		sc.per("sp");
		sc.add(20 ,30);
		sc.sub(10, 20, 30);
	}
}
