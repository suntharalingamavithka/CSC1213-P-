import java.util.Scanner;
class Ex08{
	public static void main(String[] args)
	{
		Scanner ob=new Scanner (System.in);
		System.out.print("Enter the value for counter 01: ");
		int counter1=ob.nextInt();
		System.out.print("Enetr the value for counter 02: ");
		int counter2=ob.nextInt();
		for(int i=0;i<counter1;i++)
		{
			System.out.print("The value i is: "+i+"\t");
		for(int j=0;j<counter2;j++)
		{
			System.out.print("The value j is: "+j+" "+"\t");
		}
		System.out.println();
		
		}
	}
}

		
		