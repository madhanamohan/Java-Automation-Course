package UnderstandingOops;

// Interface : An interface is a fully abstract contract — it contains only abstract methods (and from Java 8 onwards, also default and static methods).
//It’s like a rulebook — any class that implements it must follow those rules.

interface pay
{
	void credit();
	void debit();
}

class payment implements pay
{
	public void credit()
	{
		System.out.println("send money through credit card");
	}
	public void debit()
	{
		System.out.println("send money through debit card");
	}
}

public class Interface
{

	public static void main(String[] args)
	{
		pay p1=new payment();
		p1.credit();
		p1.debit();

	}

}
