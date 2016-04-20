import java.util.*;
class main
{
	void s1()	
	{
		try
		{
			System.out.println("You are in s1");
			s2();
			System.out.println("Going out of s1()");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	void s2() throws error1,error2
	{
		try
		{
		Random r=new Random();
		int n=r.nextInt(20);
		System.out.println("The random no. is : "+n);
		if(n%2==0)
		{	error1 e1=new error1();
			throw e1;
		}
		else
		{	error2 e2=new error2();		
			throw e2;
		}
		}		
		catch(Exception c)
		{
			System.out.println("catch of s2");
		}
	}
	public static void main(String z[])
	{	main m=new main();
		m.s1();
	}
}