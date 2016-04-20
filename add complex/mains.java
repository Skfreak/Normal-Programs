class mains
{
	public static void main(String s[])
	{
		complex c1=new complex(12,15);
		complex c2=new complex(11,18);
		complex c3=new complex(0,0);
		c3.add(c1,c2);
		System.out.print("First complex no :");
		c1.put();
		System.out.print("Second complex no :");
		c2.put();
		System.out.print("Sum of  complex nos. :");
		c3.put();
	}
}