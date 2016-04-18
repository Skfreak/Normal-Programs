import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;


public class AccountClass {

	Print p=new Print();
	public String accNo;
	public String accName; 
	private String pin;
	private float amount;
	private String mobileNo;
	
	
	//protected void dispalyPin()
	//{
	//	p.pln(""+pin);
	//}
	protected void displayAmount()
	{
		p.pln(""+amount);
	}
	protected void displayMobile()
	{
		p.pln(""+mobileNo);
	}
	
	public void displayAccInfo()
	{
		p.pln("Account No : "+accNo);
		p.pln("Account Name : "+accName);
		p.pln("Available Balance : "+amount);
		p.pln("Mobile No : "+mobileNo);
	}
	
	protected void setAmount(String s)
	{
		int index1=0;
		index1=s.indexOf('.', 0);
		String a;
		String a2=new String();
		if(index1>=0)
		{
			a=s.substring(0,index1);
			a2=s.substring(index1+1);
		}
		else
		{
			a=s;
			a2="0000";
		}
		int n1[]={0,0,0,0,0,0,0,0,0,0,0,0,0};
		int n2[]={0,0,0,0};
		int final1=0;
		float final3=0;
		for(int x=a.length()-1,power=0;x>=0;x--)
		{
			n1[x]=a.codePointAt(x)-48;
			//p.pln(""+n1[x]);
			final1=final1+(n1[x]*(int)Math.pow(10, power));
			power++;
			//p.pln(""+final1);
		}
	
		for(int x=0,power=1; x<a2.length();x++)
		{
			n2[x]=s.codePointAt(x+index1+1)-48;
			//p.pln(""+n2[x]);
			final3=(float)(final3+n2[x]*Math.pow(10,-power));
			power++;
			//p.pln(""+final3);
		}
		amount=final1+final3;
		//p.pln(""+amount);
		
	}
	
	protected void setMobile(String s)
	{
		mobileNo=s;
	}
	
//	private String getPin()
	//{
		//return pin;
	//}
	
	protected void setPin(String s)
	{
		pin=s;
	}
	
	protected void useAmount(float w) throws WithdrawalException 
	{
		if(w<0)
		{
			throw new WithdrawalException("Amount can not be Negetive.");
		}
		if(amount<=1000)
		{
			throw new WithdrawalException("You can Not WithDraw...\nYour Balance is Low");
		}
		if(amount-w<1000)
		{
			p.pln("Min. 1000.00 Rs. Required...");
			
			throw new WithdrawalException("You can Not WithDraw "+w+" Rs.");
		}
		else
		{
			String s1='`'+accNo+'!'+accName+'@'+pin+'#'+amount+'$'+mobileNo+'|';
			amount-=w;
			String s2='`'+accNo+'!'+accName+'@'+pin+'#'+amount+'$'+mobileNo+'|';
			p.pln("\n\nNew Current Balance is : "+amount+" Rs.");
		//	p.pln(s1);
		//	p.pln(s2);
			
		//	goBack(s1,s2);
			try
			{
				File f1=new File("AccountInfo.txt");
				File f2=new File("AccountInfoTemp.txt");
				String s=new String();

				BufferedReader br4=new BufferedReader(new FileReader(f1));
				BufferedWriter br3=new BufferedWriter(new FileWriter(f2));
		
				while(br4.ready())
				{	
					s=br4.readLine();
				//	p.pln(""+s);
					if(s.contains(s1))
					{	
						br3.write(s2);
						//p.pln(s2);
					}
					else
					{
						br3.write(s);
					}
					br3.newLine();
				}
				
				br4.close();
				br3.close();
				f1.delete();
				f2.renameTo(f1);
				
			}
			catch(Exception e)
			{
				
			}
		}
	}
	protected void useAmountToAdd(float w) throws WithdrawalException 
	{
		if(w<0)
		{
			throw new WithdrawalException("Amount can not be Negetive.");
		}
		if(w<100)
		{
			throw new WithdrawalException("Atleast 100 Rs. Should be Deposited Through ATM.");
		}
		else if(w>5*Math.pow(10, 7))
		{
			throw new WithdrawalException("It is Advised Not to Deposite This much Amount in ATM Directly  .");
		}
		else
		{
			String s1='`'+accNo+'!'+accName+'@'+pin+'#'+amount+'$'+mobileNo+'|';
			amount+=w;
			String s2='`'+accNo+'!'+accName+'@'+pin+'#'+amount+'$'+mobileNo+'|';
			p.pln("\n\nNew Current Balance is : "+amount+" Rs.");
		//	p.pln(s1);
		//	p.pln(s2);
			
		//	goBack(s1,s2);
			try
			{
				File f1=new File("AccountInfo.txt");
				File f2=new File("AccountInfoTemp.txt");
				String s=new String();

				BufferedReader br4=new BufferedReader(new FileReader(f1));
				BufferedWriter br3=new BufferedWriter(new FileWriter(f2));
		
				while(br4.ready())
				{	
					s=br4.readLine();
				//	p.pln(""+s);
					if(s.contains(s1))
					{	
						br3.write(s2);
						//p.pln(s2);
					}
					else
					{
						br3.write(s);
					}
					br3.newLine();
				}
				
				br4.close();
				br3.close();
				f1.delete();
				f2.renameTo(f1);
				
			}
			catch(Exception e)
			{
				
			}
		}
	}
	
}