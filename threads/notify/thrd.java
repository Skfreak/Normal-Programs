class thrd implements Runnable
{
	Thread t;
	boolean b=false;
	thrd()
	{
		t=new Thread(this);
		t.start();
		
	}
	public void run()
	{	
		try
		{
		for(int i=1;i<=20;i++)
		{
			System.out.println(t.currentThread().getName()+" "+i);
			Thread.sleep(100);
			synchronized(this)
			{
			while(b)
			{
				wait();
			}
			}
		
		}
		}
		catch(Exception e)
		{
			
		}
	}
	void sus()
	{
		b=true;
	}
	synchronized void res()
	{
		b=false;
		notifyAll();
	}
}