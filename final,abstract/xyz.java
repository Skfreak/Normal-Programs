class xyz extends abc
{
	int b=20;
	void calc()
	{
		super.calc();
		int c=b*2-5+10;
		System.out.println("After Calculation \nYour Result is : "+c);
	}
}