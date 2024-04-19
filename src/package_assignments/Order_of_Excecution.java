package package_assignments;
public class Order_of_Excecution {
	public static void main(String[] args)
	{
		System.out.println("Main Method");
		new Order_of_Excecution();
		new Order_of_Excecution();	
	}
	static 
	{
		System.out.println("SIB");
	}

	{
		System.out.println("IIB");
	}
	
	Order_of_Excecution()
	{
		System.out.println("constructor");
	}
}

