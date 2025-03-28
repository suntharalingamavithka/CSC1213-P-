import java.util.Scanner;
class Ex02{
	public static void main(String[] args)
	{
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num=ob.nextInt();
		if(num%5==0 && num%11==0)
		{
			System.out.print("The number "+num+" is devisible by 5 and 11 ");
		}
		else
		{
			System.out.print("The number "+num+" is not devisible by 5 and 11 ");
		}
	}
}