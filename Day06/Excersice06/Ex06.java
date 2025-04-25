import java.util.Scanner;
class Ex06{
	public static void main(String[]args)
	{
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter the row size: ");
		int row=ob.nextInt();
		System.out.print("Enter the column size: ");
		int column=ob.nextInt();
		
		int Array[][]=new int[row][column];
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print("Enter the element"+(i+1)+ ": ");
				Array[i][j]=ob.nextInt();
				System.out.println("Array["+i+"]"+"["+j+"]"+"="+Array[i][j]+"  ");
				
			}
			System.out.println();
			
				
		}
		int sum=0;
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				sum=sum+Array[i][j];
				System.out.print(Array[i][j]+"  ");
			}
			System.out.println();
		}
		System.out.println("The sum of total elements: "+sum);
		
		int min=Array[0][0];
		int max=Array[0][0];
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				if(max<Array[i][j])
				{
					max=Array[i][j];
				}
				if(min>Array[i][j])
				{
					min=Array[i][j];
				}
			}
			
		}
		System.out.println("The maximum element is "+max);
		System.out.print("The minimum element is "+min);
	}
}
			
	

				