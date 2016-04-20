import java.util.*;
class bank 
{
	int amount;
	String name;
	/*bank(int a,String s)
	{
		amount=a;
		name=s;
	}*/
	bank()
	{
		
	}
	void withdraw()
	{	
		try
		{
			
		System.out.println("Hello "+name);
		int i;
		//Thread.sleep(2000);
		
		System.out.println("Enter amount to withdraw : ");
		Scanner s=new Scanner(System.in);
		i=s.nextInt();
		amount=amount-i;
		if(amount<1000)
		{
			amount=amount+i;
			throw new excp("Can't perform withdraw");
			
		}
		
		
		}
		catch(Exception e)
		{
			System.out.println("Reverting changes");
		}
		System.out.println("Amount after withdraw :"+amount);
		System.out.println("Thank u for using our service ");
		
		
	}
	//void getData()
	
	
}