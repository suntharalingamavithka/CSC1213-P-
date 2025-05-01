public class Ex04{
	static int sum(int a,int b)
	{
		return a+b;
	}
	
	
	
	static double sum(double x,double y)
	{
		return x+y;
	}

  public static void main(String[]args)
{
	int add1=sum(5,10);
	
	double add3=sum(3.5,2.5);
	
	System.out.println("a+b: "+add1);
	
	System.out.println("x+y: "+add3);
}
}
	
	