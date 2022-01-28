package testing_batch;
class mark10
{
	int mark(int tam,int eng,int mat,int sci,int soc)
	{	
		int tot=tam+eng+mat+sci+soc;
		System.out.println("total mark is "+tot);
		return 0;
	}
}
public class deepa 
{
	public static void main(String args[])
	{
		int tam=98;
		int eng=100;
		int mat=89;
		int sci=100;
		int soc=90;
		mark10	thivya=new mark10();
		thivya.mark(tam,eng,mat,sci,soc);
		
	}
}
