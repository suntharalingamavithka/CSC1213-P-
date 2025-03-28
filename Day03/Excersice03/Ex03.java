import java.util.Scanner;
class Ex03{
	public static void main(String[] args)
	{
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num=ob.nextInt();
		
		if(num>0)
		{
			System.out.print("The number "+num+" is positive");
		}
		else if(num<0)
		{
			System.out.print("The number "+num+" is negative");
		}
		else
		{
			System.out.print("The number "+num+" is zero");
		}
	}
}