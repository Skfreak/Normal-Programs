import java.lang.*;
class shashit extends Thread
{	public int a;
	public int j,i;
	shashit()
	{	i=6;
		j=0;
		//start();
	}
	public void run()
	{
		try
		{
			String s2,s3;
			Thread t1=new Thread();
		while(i>0)
		{
			a=i*i;
			System.out.println("Square of "+i+" = "+a );
			Thread.sleep(20);
			i--;
			
			s2="shashi";
			t1.setName(s2);
			s3=t1.getName();
			System.out.println("Current thread's name : "+s3);
			
		}
		String s4;
		Thread t2=new Thread();
		while(j<=5)
		{
			a=i*i;
			System.out.println("Sqr of "+j+" = "+a );
			j++;
			Thread.sleep(10);
			
			t2.setName("sk");
			s4=t2.getName();
			System.out.println("Current thread's name : "+s4);
			
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
}