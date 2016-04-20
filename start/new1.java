class new1{
	
	public static void main(String s[])
	{	
		String str=new String();
		str="  Shashikant";
		String str2=new String();
		str2="Shashi";
		char c=str.charAt(0);
		
		String str3=new String();
		str3="SHASHI";
		System.out.println("Char at 0 is "+c+"\n");
		
		System.out.println("Conactenation : "+str.concat(" Chaudhary"));
	
		System.out.println("Substring : " +str.substring(2,6));

		System.out.println("Replace 'a' with 'o' :"+str.replace('a','o'));

		System.out.println("Length of "+str+"is : "+str.length());
		
		System.out.println("Compare str with str2 : "+str.equals("  Shashikant"));


		System.out.println("Compare str with Shashi : "+str.compareTo(str2));
		System.out.println("Compare str with Shashi : "+str.compareTo("  Shashikant"));		
		System.out.println("To lower 'SHASHI' :"+str3.toLowerCase());								
		System.out.println("To upper 'Shashikant' :"+str.toUpperCase());

		System.out.println("Trim 'Shashi k a n t:"+str.trim());		
	}
}
