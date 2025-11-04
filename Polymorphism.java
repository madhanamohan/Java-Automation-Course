package UnderstandingOops;

/*
//1]. Compile time PolyMorphism
class A
{
	void sum(int a,int b)
	{
		System.out.println("a= "+a+ " b= "+ b);
	}
	void sum(int a,int b,int c)
	{
		System.out.println("a= "+ a+ " b= "+ b+" c= "+ c);
	}
}
public class Polymorphism 
{
	public static void main(String[] args) 
	{
			A a1= new A();
			a1.sum(10,20);
			
			A a2= new A();
			a2.sum(10,20,30);
	}
}	
*/

//2]. Run-time PolyMorphism

class car1
{
	void drive()
	{
		System.out.println("driver drive speedly");
	}
}
class car2 extends car1
{
	void drive()
	{
		System.out.println("driver drive slowly");
	}	
	void man()
	{
		System.out.println("man can drive the car");
	}
}
class car3 extends car1
{
	void drive()
	{
		System.out.println("driver drive with medium speed ");
	}	
}
public class Polymorphism 
{
	public static void main(String[] args) 
	{
			car1 c1 = new car1();
			c1.drive();
			
			car2 c2= new car2();
			c2.drive();
			c2.man();
			
/*			car1 c5= new car2();
			c5.drive();
			c5.man();		*/ // Here we cant call the man() because we are creating obj to car2 but Referecing to the Car1
			
			
			car3 c3= new car3();
			c3.drive();
	}
}	
