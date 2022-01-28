package testing_batch;
class calc
{
	int a ;int b;
	
	int d;
	calc (int d){
	//	this.d=d;
	}
	int  add(int a,int b)
	{
		int c=a+b+d;
		
		System.out.println("additon of two no is "+c);
		return 0;
	}
	int sub(int a,int b)
	{
		
		int c=a-b;
		System.out.println("subtraction of two no is "+c);
		return 0;
	}
	//int x= sub(10,20);
	int  mul(int a,int b)
	{
		
		int c=a*b;
		System.out.println("multiplication of two no is "+c);
		return 0;
	}
	int div(int a,int b)
	{
	
		int c=a/b;
		System.out.println("division of two no is "+c);
		return 0;
	}
}
public class calc_example 
{
	//public static void main(String args[])
	{
		calc obj=new calc(10);
		obj.add(2, 3);
		obj.sub(15,20);
		obj.mul(10, 3);
		obj.div(100,5);
		
	}

}
