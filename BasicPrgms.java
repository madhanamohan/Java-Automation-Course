package practice;

public class BasicPrgms
{

	public static void main(String[] args)
	{
		
/* 1] //-----  SUM of the Digits  ----// 
		 
		  int i,r,sum=0,num=1235;
			for(i=1;i<num;num=num/10)
			{
				r=num % 10;
				sum=sum+r;
			}
		System.out.println("Sum of the Digits =" + sum);   */
		
		
/*	2]	//---  SUM of the Digits  ---//
		 
		
		 int i,count=1,num=1235;
			for(i=1;i<num;num=num/10)
			{
				count++;
			}
		System.out.println("No.of Digits =" + count);    */	
		
	
/*   3]   //---  Sum of 1st 100 num's  ---//

			int i,sum=0;
			for(i=1;i<=100;i++)
			{
				sum=sum+i;
			}
			System.out.println("Sum of 1st 100 num's =" + sum);  */
		
/*    4]  //---  Rev the number  ---//
		
		int i,num=145,r,rev=0;
		
		for(i=1;i<=num;num=num/10)
		{
			r=num%10;
			rev=rev*10+r;
		}
		System.out.println("Rev the number =" + rev);  */
		
		
/*   5]   //--- Skip the number which is divisible by 5 from 1 to 100 ---//
		
		int i,count=0;
		for(i=1;i<=100;i++)
		{
			if(i%5==0)
			{
				count++;
				continue;
			}
			System.out.println("number = " + i);
		}	
		System.out.println("\nTotal Count for divisible of Five = " + count); */
	}
}
