class complex
{
	int re;
	int im;
	complex(int a,int b)
	{
		re=a;
		im=b;
	}
	void put()
	{
		System.out.println(re+"+i"+im);
	}
	void add(complex c1,complex c2)
	{
		re=c1.re+c2.re;
		im=c1.im+c2.im;
		
	}
}