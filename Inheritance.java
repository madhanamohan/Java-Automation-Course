package UnderstandingOops;

import UnderstandingOops.cir;
import UnderstandingOops.rectangle;

class rectangle
{
	int l;
	int b;
	rectangle()
	{
		l=1;
		b=1;
	}
	rectangle(int l, int b)
	{
		this.l=l;
		this.b=b;
	}
}
class cir extends rectangle
{
	int w;	
	cir()
	{
		w=1;
	}
	cir(int l, int b, int w)
	{
	//	super(l,b);
		this.l=l; this.b=b;
		this.w=w;
	}
}
public class Inheritance
{
	public static void main(String[] args) 
	{
		rectangle r = new rectangle();  
		System.out.println(r.l+" "+r.b); // 1 1
		
		cir c=new cir(5,6,7);
		System.out.println(c.l+" "+c.b+" "+c.w);	// 5 6 7
		
		System.out.println(r.l+" "+r.b); // 1 1	// You are still referring to the original rectangle object that r points to & The rectangle object referenced by r was initialized with l=1 and b=1 and has never been modified since its creation
	//	System.out.println(c.l+" "+c.b);
		
		rectangle r1=new cir(4,5,6);
//		System.out.println(r1.l+" "+r1.b+" "+r1.w); // w is not part of rectangle
		System.out.println(r1.l+" "+r1.b); // 4 5
		System.out.println(((cir)r1).w); // 6  -> after the cast, you are telling the compiler that r1 actually refers to a cir object
		
		
	}
}
