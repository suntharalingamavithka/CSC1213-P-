import java.util.Scanner;
class Ex06{
	public static void main(String[] args)
	{
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter the letter: ");
		char letter=ob.next().charAt(0);
		switch (letter)
		{
			case 'a':case 'e':case 'i':case 'o':case 'u':
			case 'A':case 'E':case 'I':case 'O':case 'U':
			{
			
			System.out.print("The letter "+letter+" is vowel");
			break;
			}
			
			default:
			{
				System.out.print("The letter "+letter+" is not vowel");
			}
		}
	}
}
		