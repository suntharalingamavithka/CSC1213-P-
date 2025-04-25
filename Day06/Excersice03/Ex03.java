class Ex03{
	public static void main(String[]args)
	{
		int values[][]={{98,12,34,32},{45,54,67,45},{13,14,89,87}};
		
		int sum=0;
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(values[i][j]+" ");
				
				sum=sum+values[i][j];
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.print("The total is "+sum);
		
		System.out.println();
	}
}