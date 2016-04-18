import java.util.Scanner;
import java.io.*;
/**
 * 
 */

/**
 * @author innoventa
 *
 */
public class AccessAccount extends AccountClass {

	
	public void getInfoByAccNo()
	{
		try
		{
			BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
			
				String s1=new String();
			
			p.pln("********Give Inputs********");
			p.p("Account No : ");
			s1=br1.readLine();
			setData(s1);
		}
		catch(Exception e)
		{
			p.pln("Exception (During Displaying AccInfoByAccNo) :"+e);
		}
	}
	
	void withdraw()
	{
		getInfoByAccNo();
		p.pln("Available Balance : ");
		displayAmount();
		
		try
		{
			Scanner sc=new Scanner(System.in);
			float w=0;
			
		
		//	p.pln("********Give Inputs********");
			p.p("Withdrawal Amount : ");
			w=sc.nextFloat();
		//	sc.remove();
			
			useAmount(w);
			
			sc.close();
		
		}
		catch(Exception e)
		{
			p.pln("Exception While WithDrawal : "+e);
		}
	}
	
	void deposite()
	{
		getInfoByAccNo();
		p.pln("Available Balance : ");
		displayAmount();
		
		try
		{
			Scanner sc=new Scanner(System.in);
			float w=0;
			
		
		//	p.pln("********Give Inputs********");
			p.p("Amount To Be Deposited : ");
			w=sc.nextFloat();
		//	sc.remove();
			
			useAmountToAdd(w);
			
			sc.close();
		
		}
		catch(Exception e)
		{
			p.pln("Exception While Deposite : "+e);					//Remove +e Next Time
		}
	}
	
	void setData(String s1) throws Exception
	{
		try
		{
			File f=new File("AccountInfo.txt");
			BufferedReader br2=new BufferedReader(new FileReader(f));
			int index1=0,index2=0;
			String s2=new String();
			
			while(br2.ready())
			{
				s2=br2.readLine();
				
				if(s2.contains('`'+s1+'!'))
				{
					index1=s2.indexOf('!');
				//	p.pln(""+index1);
					accNo=s2.substring(1,index1);
				//	p.pln(accNo);
					
					index2=s2.indexOf('@', index1);
					accName=s2.substring(index1+1,index2);
				//	p.pln(accName);
					
					index1=s2.indexOf('#', index2);
					setPin(s2.substring(index2+1, index1));
					index2=s2.indexOf('$',index1);
					setAmount(s2.substring(index1+1,index2));
				//	p.pln(""+index1);
				//	p.pln(""+index2);
					index1=s2.indexOf('|',index2);
					setMobile(s2.substring(index2+1,index1));
					
					displayAccInfo();
					break;
					
				}
			}
			p.pln("************************************");
			if(index1>1 && index2>1)
			{
				p.pln("Search Comleted........");
			}
			else
			{
				p.pln("No Data Found....");
			}
			p.pln("_________________________________________");
			
			br2.close();
			
		}
		catch(Exception e)
		{
			throw e;
		}
	}
	
}
