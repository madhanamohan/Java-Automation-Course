package UnderstandingOops;

class A {
    private int privateVar = 10;     // Accessible only in class A
            int defaultVar = 20;     // Accessible in same package
    protected int protectedVar = 30; // Accessible in same package & subclasses
    public int publicVar = 40;       // Accessible everywhere
    static int sv=55;
    
    void showA() {
        System.out.println("Inside class A:");
        System.out.println("privateVar = " + privateVar);
        System.out.println("defaultVar = " + defaultVar);
        System.out.println("protectedVar = " + protectedVar);
        System.out.println("publicVar = " + publicVar);
        System.out.println("sv = " + sv);
    }
}

class B {
     static void showB() {
       A obj = new A();
        System.out.println("\nInside class B (same package, not subclass):");
        // System.out.println(obj.privateVar); // ❌ Not accessible
        System.out.println("defaultVar = " + obj.defaultVar);   // ✅ same package
        System.out.println("protectedVar = " + obj.protectedVar); // ✅ same package
        System.out.println("publicVar = " + obj.publicVar);      // ✅ public
        System.out.println("sv = " + A.sv);
    }
}

class C extends A {
    void showC() {
        System.out.println("\nInside class C (subclass of A):");
        // System.out.println(privateVar); // ❌ Not accessible
        System.out.println("defaultVar = " + defaultVar);   // ✅ same package
        System.out.println("protectedVar = " + protectedVar); // ✅ inherited (accessible in subclass)
        System.out.println("publicVar = " + publicVar);      // ✅ public
    }
}


public class Encapsulation 
{

	public static void main(String[] args) 
	{
		A a = new A();
        a.showA();

        B b = new B();
        b.showB();
        System.out.println("static variable= "+A.sv);
        
        C c = new C();
        c.showC();

	}

}

