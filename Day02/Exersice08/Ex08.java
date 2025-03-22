import java.util.Scanner;
class Ex08{
	public static void main(String[] args)
	{
		Scanner ob = new Scanner(System.in);
		System.out.print("Input the side length values: ");
		double val=ob.nextDouble();
		System.out.printf("Squre: %.2f\n",val*val);
		System.out.printf("Cube: %.2f\n",val*val*val);
		System.out.printf("Fourth power: %.2f\n",Math.pow(val,4));
	}
}