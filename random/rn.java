import java.util.Random;
class rn //extends Random
{
	public static void main(String z[])
	{
		Random r=new Random();
		float n=(float)r.nextGaussian();
		System.out.println("Generating a random no : "+n);
	}
}