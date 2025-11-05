package UnderstandingOops;

abstract class vehicle
{
	abstract void start();
	
	void stop()
	{
		System.out.println("vehicle should stop");
	}
}
class car extends vehicle
{
	void start()
	{
		System.out.println("car will start smoothly");
	}
}
class bike extends vehicle
{
	void start()
	{
		System.out.println("\nbike will start within 10 sec");
	}
	
}

public class Abstraction
{

	public static void main(String[] args)
	{
		vehicle v1=new car();
		v1.start();
		v1.stop();
		
		vehicle v2=new bike();
		v2.start();
		v2.stop();

	}

}
