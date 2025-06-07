package studentmarks;

public class ConditionalStatements
{
	public static void main(String[] args)
	{
		int Math = 100;
		int Science = 80;
		int English = 25 ;
		
		int total = (Math+Science+English);
		float avg = total/3.0f;
		
		System.out.println("Total Marks of three sub's= " + total);
		System.out.println("Total average marks [float]= " + avg );
		
		if(avg>=90)
		{
			System.out.println("Garde = A+");
			System.out.println("Excellent performence!");
		}
		else if(avg>=75)
		{
			System.out.println("Grade = A");
			System.out.println("Keep improving");
		}
		else if(avg>=60)
		{
			System.out.println("Grade = B");
		}
		else if(avg>=40)
		{
			System.out.println("Grade = C");
		}
		else 
		{
			System.out.println("Fail");
			System.out.println("Please work harder next time");
		}
		
		
		if(Math<35 || Science<35 || English<35)
		{
			System.out.println("Result = Failed due to low score in at least one subject");
		}
		
	}
	
}
