class Ex02{
	public static void main(String[] arg)
	{
		String Name,Address,DOB,Sex;
		int Age;
		Name=arg[0];
		Address=arg[1];
	    DOB=arg[2];
		Sex=arg[3];
		Age=Integer.parseInt(arg[4]);
		
		int a=10;
		int b=a+Age;
		
		System.out.println("Name:"+Name+"\n"+"Address:"+Address+"\n"+"DOB:"+DOB+"\n"+"Sex:"+Sex+"\n"+"Age:"+Age);
		
		System.out.println();
		
		System.out.println("Age is:"+b);
	}
}
		
		