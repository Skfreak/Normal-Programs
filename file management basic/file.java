import java.io.*;
class file
{
	public static void main(String z[])
	{	String c=new String();
		String c2=new String();
		boolean c3,c4,mk,del;
		int n;
		long n2;
		try
		{
		File f=new File("C:\\Users\\Shashi Kant\\Desktop\\file management basic\\file\\second");
		f.createNewFile();
		c=f.getName();
		c2=f.getPath();
		System.out.println("The name of your file is : "+c);
		System.out.println("The path of your file is : "+c2);
		c3=f.isHidden();
		n=(int)f.length();
		c4=f.canWrite();
		System.out.println("Is file hidden : "+c3);
		System.out.println("The length of your file is : "+n);
		System.out.println("Can u write in file : "+c4);
		n2=f.lastModified();
		System.out.println("Last modified date : "+n2);
				File f8=new File("C:\\Users\\Shashi Kant\\Desktop\\file management basic\\file\\second2");
		
		boolean ren=f.renameTo(f8);
		System.out.println("New name is : "+f.getName());
		//del=f.delete();
		//System.out.println("File deleted : "+del);
		//c=f.getName();
		
		//System.out.println("The name of your file is : "+c);
		//Now for directories
		File f2=new File("C:\\Users\\Shashi Kant\\Desktop\\file management basic\\file\\fifth");
		mk=f2.mkdir();
		File f3=new File("C:\\Users\\Shashi Kant\\Desktop\\file management basic\\file\\sixth");
		boolean mk2=f3.mkdir();
		System.out.println("Directory created or not :"+mk);
		System.out.println("Directory created or not :"+mk2);
		
		//System.out.println("Mkdirs :"+f2.mkdirs());
		boolean b =f2.renameTo(f3);
		System.out.println("Renamed : "+b);
		File f4=new File("C:\\Users\\Shashi Kant\\Desktop\\file management basic\\file2\\file3\\seventh");
		boolean mk3=f4.mkdirs();
		File f5=new File("C:\\Users\\Shashi Kant\\Desktop\\file management basic\\file5\\file3\\seventh");
		boolean mk4=f5.mkdir();
		
		
		}
		catch(Exception e)
		{
			
		}
		
		
		//f.ishidden();
		//f.length();
	}
}