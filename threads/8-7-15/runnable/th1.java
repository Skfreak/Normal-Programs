class th1 implements Runnable,x 
{	
	Thread t11,t12,t13;
	th1()
	{	
		t11=new Thread(this);
		t12=new Thread(this);
		t13=new Thread(this);
		t11.start();
		t12.start();
		t13.start();
	}
	public void run()
	{
		try
		{
		int i;
		System.out.println( Thread.currentThread().getThreadGroup());
		
		if(Thread.currentThread().getName().equals("Thread-0"))
		{
			for(i=0;i<5;i++)
			{
				System.out.println("Child thread : "+(i+1)+Thread.currentThread());
				//t11.sleep(1000);
			}
		}
		else
		for(i=0;i<5;i++)
		{
			System.out.println("Child thread : "+(i+1)+Thread.currentThread().getName());
			//t11.sleep(1000);
		}
		
		}
		catch(Exception e)
		{
			System.out.println("Child thread Exception :");
		}
	}
}