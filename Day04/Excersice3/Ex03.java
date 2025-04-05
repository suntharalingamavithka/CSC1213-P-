import java.util.Scanner;
class Ex03{
	public static void main(String[]args)
	{
		Scanner ob=new Scanner(System.in);
		
	int i=0;
	int sum=0;
	int sum1=0;
	int sum2=0;
	int Ecount=0;
	int Ocount=0;
	char control=' ';
		do
		{
			System.out.print("Enter the number to find the summation: ");
	          int num=ob.nextInt();
			  
			  if(num%2==0)
			  {
				   sum1=sum1+num;
				  Ecount++;
			  }
			  else
			  {
				  sum2=sum2+num;
				  Ocount++;
			  }
				  
		 sum=sum+num;
		 System.out.print ("Do you want to continue (Y/N) : ");
		 control=ob.next().charAt(0);
		}
		while(control=='Y');
		{
			
			System.out.println("The summation of the even numbers: "+sum1);
			System.out.println("The summation of the odd numbers: "+sum2);
			
		}
		System.out.println("count the even numbers ot user has Enterd is :"+Ecount);
		System.out.print("count the odd numbers ot user has Enterd is :"+Ocount);
		
		
	}
}