import java.io.*;
class uniqueline
{
public static void main(String z[]) 
{	
	try 
	{		FileReader i2=new FileReader("communities.data.txt");
			BufferedReader f2=new BufferedReader(i2);
			
		int count=0,c=1;
		int i=0,k=0;
		String s1;
		while(f2.ready())
		{
			s1=f2.readLine();
			c++;
		}
		f2.close();
		FileReader i1=new FileReader("communities.data.txt");
		BufferedReader f1=new BufferedReader(i1);
			
		String[] s=new String[c];
		int p=0;
		while(f1.ready())
		{
			s[p]=f1.readLine();
			p++;
		}
		int w=p;
		System.out.println(w);
		int m,n;
		String s4,s5;
		for(m=0;m<p;m++)
		{
			for(n=m+1;n<p;n++)
			{	
				if(s[m].compareTo(s[n])==0)
				{
						count++;
						s[n]="aijsda"+count;
				}
				
			}
				
		}
		w=w-count;
		
		
		System.out.println("Total no. of different lines are "+w);
		f1.close();
		FileReader i5=new FileReader("communities.data.txt");
		BufferedReader f3=new BufferedReader(i5);
		
		String[] s6=new String(c);
		p=0;
		int index,index2;
		while(f3.ready())
		{	
			s[p]=f3.readLine();
			index=s[p].indexOf(",",0);
			index=s[p].indexOf(",",index+1);
			index=s[p].indexOf(",",index+1);
			index2=s[p].indexOf(",",index+1);
			s6[p]=s[p].substring(index+1,index2);
			p++;
		}
		int co=0;
		int w2=c;
			for(m=0;m<p;m++)
		{
			for(n=m+1;n<p;n++)
			{	
				if(s6[m].compareTo(s6[n])==0)
				{
						co++;
						s6[n]="aijsda"+count;
				}
				
			}
			w2=w2-c;
		}
		System.out.println("diff cities"+w2);				
		
	}
	catch(Exception e)
	{
		
	}
}
}