import java.lang.*;
class main1 extends Thread
{
	public static void main(String x[])
	{
		
		
		//Thread t1=new Thread();
		//Thread t2=new Thread();
		//Thread t3=new Thread();
		
		//Thread.sleep(500);
		
		int a=0;
		System.out.print("Enter name("+getName()+") :");
		InputStreamReader i1=new InputStreamReader(System.in);
		BufferedReader b=new BufferedReader(i1);
		String s4=b.readLine();
		
		String s5 = b.readLine();
		
		String s6 = b.readLine();
			
			a=1;
			
		while(a==1){
		main2 t1=new thrd(s4);
		main2 t2=new thrd(s5);
		main2 t3=new thrd(s6);
		}
		
	}
}