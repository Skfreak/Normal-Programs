import java.lang.*;
class maint
{
	public static void main(String z[])
	{
		try
		{
		shashit s1=new shashit();
		
		
		
		int a;
		int i=1,j=1;
		String s3;
		Thread t1=new Thread();
		while(i<=5)
		{
			a=i*i;
			System.out.println("Sq of "+i+" = "+a );
			i++;
			Thread.sleep(100);

			s3=t1.getName();
			System.out.println("Current thread's name : "+s3);
		}

		
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		//shashit s2=new shashit();
	}
	
}