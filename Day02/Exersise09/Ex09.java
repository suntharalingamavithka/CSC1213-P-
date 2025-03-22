import java.util.Scanner;
class Ex09{
	public static void main(String[] args)
	{
		Scanner ob=new Scanner(System.in);
		System.out.println();
		System.out.print("Enter the value: ");
		int val=ob.nextInt();
		
		
		if(val%2==0)
		{
			System.out.print("The "+val+" is even");
		}
		else
		{
			System.out.print("The "+val+" is odd");
		}
	}
}
		