package OvwelsAssignment;

public class StringsOvwelsCount
{

	public static void main(String[] args)
	{
		
		String s1="AEIOUaeiou";
		String s2 = "Hello how are you doing today";
	
		
		int i,j,count=0;
		for(i=0;i<s1.length();i++)
		{
			for(j=0;j<s2.length();j++)
			{
				if (s1.charAt(i) == s2.charAt(j))
				{
				System.out.println("vowels="+s2.charAt(j));
				count++;
				}
			}
			
		}
		System.out.println("\nTotal vowels count="+count);
	}

}
