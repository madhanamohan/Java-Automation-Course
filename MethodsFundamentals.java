package methodsbasics;

public class MethodsFundamentals
{

	public static void main(String[] args) 
	{
		
/*  1] //---------- Multiplication table 1 - 5  ------//
 
		int i,j;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=10;j++)
			{
				System.out.println(i + "*" + j + "=" +(i*j) );
			}
			System.out.print("\n");
		}  */
	
/*  2] //---------- Divisible by 3 & 5  ------//
		
		int i,count1=0,count2=0;
		for(i=1;i<=100;i++)
		{
			if(i%3==0)
			{
				count1++;
				System.out.println("Div by 3 ="+i);
			}
			if(i%5==0)
			{
				count2++;
				System.out.println("Div by 5 ="+i);
			}
		}
		System.out.print("\n");
		System.out.println("count1 = "+count1);	
		System.out.println("count2 = "+count2);	   */

/* 3]   //------  prime numbers from 1 to 100    ------//
		
		int i,j,num=100,Count=0;
		
		for(i=2;i<=num;i++)
		{
			for(j=2;j<i;j++)
			{
				if(i%j==0)
				{
					break;
				}
			}
			if(j==i)
			{
				Count++;
				System.out.println("Prime num's are = " + i);
			}
		}
		System.out.println("Count ="+ Count);    */
		
/*	4]	//--- Rectangle pattern  ---//

		int i,j;
		for(i=0;i<4;i++)
		{
			for(j=0;j<8;j++)
				System.out.print("*");
			System.out.print("\n");
		}												*/		
		
/*	5]	//--- Right angle Triangle pattern  ---//
 
		int i,j;
		for(i=0;i<10;i++)
		{
			for(j=0;j<i;j++)
				System.out.print("*");
			System.out.print("\n");
		}							 		*/	
		
/* =====================================================================================================================*/
		
		
/*  //----- Addition of Two numbers -------//
		
		static int DoAddition()
		{
			int a=10;
			int b=20;
			int sum=a+b;
			return sum;
		}											
		public static void main(String[] args)
		{
			int totalsum= DoAddition();	
			System.out.println("Total sum="+totalsum);
		}														*/
				
	}

}
