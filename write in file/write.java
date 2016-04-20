import java.io.*;
class write
{
	public static void main(String z[])
	{
		try{
		FileWriter i=new FileWriter("write.txt");
		BufferedWriter f=new BufferedWriter(i);
		int a=(char)'a';
		String s=new String();
		s="SHASHI";
		f.write("SHASHI");
		f.newLine();
		f.write("wwe");
		f.newLine();
		f.write(a);
		f.newLine();
		f.write(s,1,3);
		f.close();
		}
		catch(Exception e)
		{
			
		}
	}
}