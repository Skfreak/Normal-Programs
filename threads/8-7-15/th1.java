class th1 extends Thread
{
	th1()
	{
		start();	
	}
	public void run()
	{
		try
		{
		int i;
		for(i=0;i<5;i++)
		{
			System.out.println("Child thread : "+(i+1));
			sleep(1000);
		}
		
		}
		catch(Exception e)
		{
			System.out.println("Child thread Exception :");
		}
	}
}