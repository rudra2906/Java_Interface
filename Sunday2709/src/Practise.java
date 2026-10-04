
public interface Practise {
	
	double PI_value = 3.14;
	void attendance();
	
	default void print() {
		System.out.println("this is default method");
		System.out.println("pi value: " + this.PI_value);
	}
	
}
interface Performance extends Practise
{
	int value = 199;
	void result();
}
class EngineeringStudent implements Performance
{
	@Override
	public void attendance() 
	{
		System.out.println("You are present");
	}
	@Override
	public void result() {
		System.out.println("this is result");
	}
}
