import java.util.Scanner;
class Ex02{
	public static void main(String[] args)
	{
		Scanner ob=new Scanner(System.in);
		
		int i=0;
		int sum=0;
		char control=' ';
		do
		{
			System.out.print("Enter the number to find the summation: ");
			int num=ob.nextInt();
			sum=sum+num;
			System.out.print("Do you want to continue (Y/N): ");
			control=ob.next().charAt(0);
		}
		while(control=='Y');
		{
			System.out.print("The summation of the number: "+sum);
		}
	}
}
			