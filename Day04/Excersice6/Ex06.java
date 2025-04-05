import java.util.Scanner;
class Ex06{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of the Array:" );
		int size=sc.nextInt();
		int number[]=new int[size];
		
		for(int i=0;i<size;i++)
		{
			System.out.print("Enter the elements"+(i+1)+":");
			number[i]=sc.nextInt();
		}
		System.out.println();
		System.out.println("Elements of the Array:");
		
		for(int num:number)
		{
			System.out.print(num+"\t");
		}
	}
}