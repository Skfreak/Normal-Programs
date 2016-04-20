import java.io.*;
class write2
{
	public static void main(String z[])
	{
		try{
		FileWriter i=new FileWriter("write.txt");
		BufferedWriter f1=new BufferedWriter(i);
		FileReader j=new FileReader("read.txt");
		BufferedReader f2=new BufferedReader(j);
		String s1=new String();
		char ch='a';
		while((ch=(char)f2.read())!=null)
		{	
		//String s2=new String();
		//String s3=new String();
		//ch=(char)f2.read();
		//s1=f2.readLine();
		//s2=f2.readLine();
		//s3=f2.readLine();
		//f1.write(s1);
		f1.write((int)ch);
		f1.newLine();
		//f1.write(s2);
		//f1.write(s3);

		}
		f1.close();
		f2.close();
		
		
		}
		catch(Exception e)
		{
			
		}
	}
}