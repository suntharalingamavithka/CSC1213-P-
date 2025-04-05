import java.util.Scanner;
class Ex01{
	public static void main(String[] args)
	{
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter the number to find the summation: ");
		int num=ob.nextInt();
		int sum=0;
		
		for(int i=1;i<=num;i++)
		{
			sum=sum+i;
		}
		
		System.out.println();
		System.out.print("Summation of number from 0 to 1: "+sum);
		
		System.out.println();
	}
}