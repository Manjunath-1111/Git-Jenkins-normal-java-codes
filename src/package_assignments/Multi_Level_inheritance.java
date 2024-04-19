package package_assignments;

class One
{
	static void add()
	{
		System.out.println("Addition");
	}
	void sub()
	{
		System.out.println("Subtraction");
	}
}
class Two extends One
{
	static void div()
	{
		System.out.println("Division");
	}
	void mul()
	{
		System.out.println("Multiplication");
	}
}
public class Multi_Level_inheritance extends Two
{
	public static void main(String[] args) 
	{
		Multi_Level_inheritance m1=new Multi_Level_inheritance();
		m1.sub();
		m1.mul();
		m1.pri();
		add();
		div();
		man();
	}
	static void man()
	{
		System.out.println("Manjunath");
	}
	void pri()
	{
		System.out.println("Priyanka");
	}

}
