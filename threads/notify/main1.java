class main1
{
	public static void main(String z[])
	{
		try
		{
		thrd t1=new thrd();
		thrd t2=new thrd();
		Thread.sleep(500);
		t1.sus();
		Thread.sleep(500);
		t1.res();
		Thread.sleep(500);
		t2.sus();
		Thread.sleep(500);
		t2.res();
		}
		catch(Exception e)
		{
			
		}
	}
	
}