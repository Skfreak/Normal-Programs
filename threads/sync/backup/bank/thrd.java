class thrd implements Runnable
{
	Thread t=new Thread(this);
	bank b2=new bank();
	thrd(bank b1)
	{
		b2=b1;
		t.start();
	}
	public void run()
	{
		//synchronized(b2)
		//{
			b2.withdraw();
		//}
	}
}