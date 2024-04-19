package package_assignments;

interface Logic1
{
	void add();
}
interface Logic2 extends Logic1
{
	void mul();
}
interface Logic3 extends Logic2
{
	void sub();
}
interface Logic4 extends Logic3
{
	void div();
}
interface Logic5 extends Logic4
{
	void rem();
}

public class Interface_5_with_1_Subclass implements Logic5
{
	public static void main(String[] args)
	{
		Interface_5_with_1_Subclass i1=new Interface_5_with_1_Subclass();
		i1.add();
		i1.sub();
		i1.mul();
		i1.div();
		i1.rem();	
	}
	public void div() 
	{
		System.out.println("Division");	
	}
	public void sub() 
	{
		System.out.println("Subtraction");
	}
	public void mul() 
	{
		System.out.println("Multiplication");
	}
	public void add() 
	{
		System.out.println("Addition");
	}
	public void rem() 
	{
		System.out.println("Reminder");	
	}
}
