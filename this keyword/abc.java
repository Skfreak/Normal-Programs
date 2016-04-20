class abc
{
	int a;
	void sum()
	{
		int a;
		a=50;
		int b=a+50;
		System.out.println("Value of b is : "+b);
		b=0;
		b=this.a+50;
		System.out.println("Value of b using this keyword : "+b);
		
	}
}