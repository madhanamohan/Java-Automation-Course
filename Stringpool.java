package strings;

public class Stringpool 
{

	public static void main(String[] args)
	{
		String str1="Sandesh";
//		str="Hello Sandesh";
		String str2="Sandesh";
		String str3=new String("Sandesh");
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));


	}
	/* : 1.Here str1 and str2 points to the same memory address because in java [String literals are stored in the String pool.]
		2.Both str1 and str2 point to the same object in the String pool because the literal "Sandesh" is reused.
		3.If both return the same value, str1 and str2 point to the same object.
	
		If you use new String("Sandesh"), then a new object is created in heap, and its identity hash code will be different.
*/
}
