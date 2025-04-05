class Ex04{
public static void main(String[] args)
{
	int number[]=new int[10];
	number[0]=24;
	number[1]=67;
	number[2]=89;
	number[3]=78;
	number[4]=55;
	number[5]=34;
	number[6]=89;
	number[7]=32;
	number[8]=12;
	number[9]=39;
	for(int i=0;i<number.length;i++)
	{
		System.out.println(number[i]+"\t");
	}
	System.out.println("************************************************");
	int number2[]={1,2,3,4,5,6,7,8,9,10};
	for(int i=0;i<number.length;i++)
	{
		System.out.println(number2[i]+"\t");
	}
	System.out.println("************************************************");
	String days[]={"Monday","Tuesday","Wednessday","Thursday","Friday","Saturday","Sunday"};
	for(String day:days)
	{
		System.out.println(day+"\t");
	}
}
}

