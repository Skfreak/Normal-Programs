class sci1
{
	public static void main(String z[])
	{	int i=-23;
		int a,b,c;
		double d,x,y;
		a=2;
		b=30;
		d=Math.toRadians(b);
		x=0.866;
		y=0.5;
		c=5;	
		double j=234.45;
		float k=-23.4f;
		
		System.out.println("\nAbsolute of i :"+Math.abs(i));
		System.out.println("\nAbsolute of j :"+Math.abs(j));
		System.out.println("\nAbsolute of k :"+Math.abs(k));
		System.out.println("\nMax of 2,5 : "+Math.max(a,c));
		System.out.println("\n2 raised to 3="+Math.pow(2,3) );
		System.out.println("\nA random value"+Math.random());
		System.out.println("\nNatural log of j="+Math.log(j)+"\n\n"+"Base 10 log ="+Math.log10(j));
		System.out.println("\nLog1p of 2 :"+Math.log1p(2.0));		
		System.out.println("\nSin of 30 radians :"+Math.sin(b));	
		System.out.println("\nSin of 30 deg :"+Math.sin(d));
		System.out.println("\nAtan2  :"+Math.atan2(y,x));
		System.out.println("\nCube root of 8 :"+Math.cbrt(8));

	}
}