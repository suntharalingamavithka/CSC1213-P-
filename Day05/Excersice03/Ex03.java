import java.util.Scanner;
public class Ex03{
	public static void main(String[]args)
	{
		int number[]=new int[5];
		Scanner ob=new Scanner (System.in);
		
		for(int i=0;i<5;i++)
		{
			System.out.print("Enter the number "+(i+1)+": ");
			number[i]=ob.nextInt();
		}
		
		int max=number[0];
		int mini=number[0];
		for(int i=0;i<5;i++)
		{
			if(number[i]>max)
			{
				max=number[i];
			}
			if(number[i]<mini)
			{
				mini=number[i];
			}
		}
		System.out.println("The maximum number is "+max);
		System.out.println("The minimum number is "+mini);
	}
}
		