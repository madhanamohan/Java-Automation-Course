package Scanner;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		
	/*	System.out.print("enter the age=");
		int age =sc.nextInt();
		sc.nextLine();
		String name = sc.nextLine();
		System.out.println("age is="+age + " name is=" + name);   */
		
		System.out.print("enter the name=");
		String name =sc.nextLine();
		float age = sc.nextFloat();
		
		int sub1 = sc.nextInt();
		int sub2 = sc.nextInt();
		double avg = sub1+sub2;
		System.out.println("name is="+ name+"\nage is="+ age+"\nsub1="+ sub1+"\nsub2="+ sub2+"\navg="+ avg);
		sc.close();			
	}

}
