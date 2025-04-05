import java.util.Scanner;
class Ex05{
	public static void main(String[]args)
	{
		Scanner Sc=new Scanner(System.in);
		System.out.print("Enter the size of the Array:");
		int size=Sc.nextInt();
		int number1[]=new int[size];
		for (int i=0;i<number1.length;i++)
		{
			System.out.print("Enter the elements "+(i+1)+":");
			number1[i]=Sc.nextInt();
		}
		System.out.println("\nArray Elements: ");
		for(int i=0;i<number1.length;i++)
		{
			System.out.print(number1[i]+"\t");
		}
		int max=number1[0];
		int min=number1[0];
		int sum=0;
		double average;
		
		for(int i=0;i<number1.length;i++)
		{
			if(number1[i]>max)
			{
				max=number1[i];
			}
			if(number1[i]<min)
			{
				min=number1[i];
			}
			sum=sum+number1[i];
		}
		average=(double) sum/number1.length;
		
		System.out.println("\n\nmaximum Element: "+max);
		System.out.println("minimum Element: "+min);
		System.out.println("Summation: "+sum);
		System.out.println("Average: "+average);
		
		System.out.println("\nEnter the element you want to search: ");
		int searchElement=Sc.nextInt();
		
		boolean found=false;
		
		for(int i=0;i<number1.length;i++)
		{
			if(number1[i]==searchElement)
			{
				System.out.println("Element found at position: "+(i+1));
				found=true;
				break;
			}
		}
		if(!found)
		{
			System.out.println("Element not found: ");
		}
		boolean isUnique=true;
		for(int i=0;i<number1.length;i++)
		{
			for(int j=i+1;j<number1.length;j++)
			{
			if(number1[i]==number1[j])
			{
				isUnique=false;
				break;
			}
			}
			if(!isUnique)
			{
				break;
			}
		}
		if(isUnique)
		{
			System.out.println("All elements are unique.");
		}
		else
		{
			System.out.println("Not unique - duplicate elements exist.");
		}
	}
}

			
		
		