import java.lang.*;
import java.io.*;
class main2 extends Thread
{	public String s,s4;
	static int count;
	main2()
	{
		//start();
			try
		{count+=5000;
		
		
		System.out.print("Enter name("+getName()+") :");
		InputStreamReader i1=new InputStreamReader(System.in);
		BufferedReader b=new BufferedReader(i1);
		s4=b.readLine();
		this.setName(s4);
		//if(count==3)
			//start();
	//	sleep(15000-count);
		}
		catch(Exception e)
		{
			
		}
		
	
	}
	public void run()
	{
		try
		{
			int i;
			for(i=0;i<5;i++)
			{
				System.out.println("Super : "+(i+1));
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}