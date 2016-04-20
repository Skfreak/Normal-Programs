import java.lang.*;
import java.io.*;
class thrd extends main2
{	
	public int i;
	//static int count=0;
	
	thrd()
	{	
		start();
	}

	public void run()
	{
		try
		{	
			//count+=5000;
			//sleep(0+count);
			for(i=0;i<8;i++)
			{
				//System.out.println("thrd="+i);
				//t=t.currentThread();
				System.out.println(this.getName()+(i+1));
				//sleep(100);
			}
			//t.sleep(100);
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
}