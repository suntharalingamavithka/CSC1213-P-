import java.util.Scanner;
class Ex04{
	public static void main(String[] args)
	{
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter the Frist number: ");
		int num1=ob.nextInt();
		System.out.print("Enter the Second number: ");
		int num2=ob.nextInt();
		System.out.print("Enter the Third number: ");
		int num3=ob.nextInt();
		
		if(num1>num2 && num1>num3)
		{
			System.out.print("The number "+num1+" is maximum");
		}
		else if(num2>num1 && num2>num3)
		{
			System.out.print("The number "+num2+" is maximum");
		}
		else
		{
			System.out.print("The number "+num3+" is maximum");
		}
	}
}