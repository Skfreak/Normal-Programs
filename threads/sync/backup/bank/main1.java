class main1
{
	public static void main(String z[])
	{
		bank b1=new bank(4000,"Shashi");
		bank b2=new bank(5000,"dhruv");
		//bank b3=new bank(6000,"raj");
		thrd t1=new thrd(b1);
		thrd t2=new thrd(b2);
		//thrd t3=new thrd(b3);
		//b1.withdraw();
		//b2.withdraw();
		//b3.withdraw();
	}
}