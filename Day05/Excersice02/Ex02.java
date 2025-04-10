import java.util.Scanner;
public class Ex02{
public static void main(String[]args)
{
	int value[]=new int[10];
	Scanner ob=new Scanner(System.in);
	
	for(int i=0;i<10;i++)
	{
		System.out.print("Enter the number "+(i+1)+":");
		value[i]=ob.nextInt();
	}
	for(int i=0;i<10;i++)
	{
		System.out.print(value[i]+" "+"\t");
	}
	System.out.println();
	
	String days[]={"Monday","Tuesday","Wednessday","Thursday","Friday","Saturdsy","Sunday"};
	
	for(String day:days)
	{
		System.out.println(day);
	}
}
}
	