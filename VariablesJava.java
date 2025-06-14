package varaibles;

class A
{
	int in=10;			//instance Variable
	static int stat=20;	//Static Variable
}


public class VariablesJava 
{

	public static void main(String[] args)
	{
		int local=30;
		System.out.println("Local var="+local);	 // Local Variable
		
		A obj1= new A();
		System.out.println("stat var="+obj1.stat);
		System.out.println("instance var="+obj1.in);
		
		A obj2= new A();
		obj2.in =50;
		obj2.stat =100;
		System.out.println("stat var="+obj2.stat);
		System.out.println("instance var="+obj2.in);

		NewMethod();
		
	}
//	System.out.println("Local var="+local);	 // Local Variable  =====>>>>>> error Local Variable can't use the outside the main <<<<<<================

	public static void NewMethod()
	{
		int local = 20;                //local variable
		System.out.println(local);
		A obj1 = new A();
		System.out.println("instance var="+obj1.in);    //....[10]  Inside class [outside method]
		System.out.println("stat var="+ A.stat);	    // .. [100] object changes the static variable, the change is seen by all
		
	}

}

/*===============================================	imp notes		==================================================================================================== */
/*

=> What is a static variable? 

	1.A static variable belongs to the class, not to individual objects.
	
	2.This means only one copy of the variable exists, and all objects share it.
	
	3.If one object changes the static variable, the change is seen by all.


Variable Type				 Scope							Lifetime							Accessed With
-------------				---------					-------------						------------------------

1.Local					Inside method/block			During method execution					Directly in method
2.Instance				Per object					As long as object exists				objectName.variableName
3.Static (Class)		Shared among objects		Entire program							ClassName.variableName        */

/*=================================================================================================================================================== */


