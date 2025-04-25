class Ex05{
	public static void main(String[]args)
	{
		int number[][]={{54,2,45},{67,54,87},{76,46,89},{9,10,65}};
		
		
		for(int i=0;i<4;i++)
		{
			int max=number[i][0];
			for(int j=0;j<3;j++)
			{
				
				System.out.print(number[i][j]+" ");
				  if(max<number[i][j])
				  {
					 max=number[i][j];
				  }
				  
			}
			System.out.println();
			System.out.println((i+1)+" st line maximum is "+max);
			
		}
		System.out.println();
	}
}