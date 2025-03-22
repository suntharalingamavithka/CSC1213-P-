import java.util.Scanner;
class Ex03{
	public static void main(String[] args)
	{
		String fname,lname,Regno;
		char Sex;
		Long moblieno;
		Double GPA;
		int Age;
		
		Scanner Sc=new Scanner(System.in);
		System.out.print("Enter the first name:");
		fname=Sc.nextLine();
		System.out.print("Enter the last name:");
		lname=Sc.next();
		System.out.print("Enter the Registration number:");
		Regno=Sc.next();
		System.out.print("Enter the Age:");
		Age=Sc.nextInt();
		System.out.print("Enter the Sex:");
		Sex=Sc.next().charAt(0);
		System.out.print("Enter the mobile number:");
		moblieno=Sc.nextLong();
		System.out.print("Enter the GPA:");
		GPA=Sc.nextDouble();
		
		System.out.println();
		
		System.out.println("Full name:"+fname+" "+lname+"\n"+"Registration is:"+Regno+"\n"+"Age is:"+Age+"\n"+"Sex is:"+Sex+"\n"+"moblie number is:"+moblieno+"\n"+"GPA is:"+GPA);
		
		
	}
}
		