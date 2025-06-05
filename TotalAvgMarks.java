package datatypeshomework;

public class TotalAvgMarks {

	public static void main(String[] args)
	{
		int Math = 10;
		int Science = 9 ;
		int English = 9 ;
		
		int total = (Math+Science+English);
		
		float avg = total/3.0f;
		double Avg =total/3;
		int average = total/3;
		
		System.out.println("Total Marks of three sub's= " + total);
		System.out.println("Total average marks [float]= " + avg );
		System.out.println("Total average marks [Double]= " + Avg );
		System.out.println("Total average marks [int]= " + average );
	}

}
