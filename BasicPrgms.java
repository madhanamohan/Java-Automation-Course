package practice;

public class BasicPrgms
{

	public static void main(String[] args)
	{
/* //-----  SUM of the Digits  ----// 
		 
		  int i,r,sum=0,num=1235;
			for(i=1;i<num;num=num/10)
			{
				r=num % 10;
				sum=sum+r;
			}
		System.out.println("Sum of the Digits =" + sum);   */
		
		
		//---  SUM of the Digits  ---/////
		 		
		 int i,count=1,num=1235;
			for(i=1;i<num;num=num/10)
			{
				count++;
			}
		System.out.println("No.of Digits =" + count);	
	
	}

}
