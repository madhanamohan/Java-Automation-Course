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
		
		
/*   6]   //--- pallindrom number ---//	
		
		 int i,r,sum=0,num=1221,num1;
		 num1=num;
			for(i=1;i<=num1;num1=num1/10)
			{
					r=num1 % 10;
					sum=sum * 10 + r;
			}
				if(num==sum)
				{
					System.out.println("Yes pallindrom number =" + num);
				}
				else
				{
					System.out.println("Not a pallindrom number=" + num);	
				}						*/
		
/*   7]   //--- Factorial of a number ---//	
		
		int num =5,sum=1;
		while(num>0)
		{
		sum=sum*num;
		num--;
		} 	
		System.out.println("fact="+ sum);  */
		
		
/*   8]   //--- Multiplication  ---//	
 
		int i,j,num;
		for(num=7,i=1;i<=10;i++)
		{
			// System.out.println("7 * i = "+ num*i);
			System.out.println(num + " * " + i + " = " + (num * i));
		}																 */
		
		
	}
}
