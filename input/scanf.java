import java.io.*;
class scanf
{
	public static void main(String zz[])
	{
		try
		{
		InputStreamReader i=new InputStreamReader(System.in);
		BufferedReader f=new BufferedReader(i);
		System.out.print("Input line : ");
		String s1=new String(f.readLine());
		System.out.println("Line is : "+s1);
		
			System.out.println("Enter a number : ");
		//char a=(char)f.read();
		//int a=f.read();
//System.out.println("A="+a);	

	//	System.out.println("Enter a number : ");
		//char b=(char)f.read();
		//int b=f.read();
//System.out.println("b="+b);	


		//char c=(char)((int)a+(int)b);
		//System.out.println("C = "+c);
		}
		catch(Exception e)
		{}
	}
}