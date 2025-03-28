import java.util.Scanner;
class Ex01{
	public static void main(String[] args)
	{
		Scanner ob=new Scanner (System.in);
		System.out.print("Enter the first number: ");
		int num1=ob.nextInt();
		System.out.print("Enter the second number: ");
		int num2=ob.nextInt();
		if(num1>num2)
		{
			System.out.print(num1+" is maximum number");
		}
		else
		{
			System.out.print(num2+" is maximum number");
		}
	}
}
