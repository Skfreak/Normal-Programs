class main1
{
	public static void main(String z[])
	{
		th1 t1=new th1();
		th1 t2=new th1();
		th1 t3=new th1();
		
		try
		{	int i=0;
			for(i=0;i<5;i++)
			{
				System.out.println("Main thread : "+(i+1));
				Thread.sleep(500);
				//Thread.currentThread().join();
			}
			
			//t1.t11.join();
			System.out.println("Main thread finished :");
		}
		catch(Exception e)
		{
			
		}
	}
}