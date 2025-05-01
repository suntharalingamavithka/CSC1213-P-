public class Ex03{
	static int findmax(int a,int b,int c)
	{
		if(a>=b && a>=c)
		{
			return a;
		}
		if(b>=a && b>=c)
		{
			return b;
		}
		else
		{
			return c;
		}
	}
	public static void main(String[]args)
	{
		int max=findmax(10,25,15);
		System.out.println("max: "+max);
	}
}