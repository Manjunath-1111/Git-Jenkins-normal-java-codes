package package_assignments;
public class Method_Overloading {
	void add(int a, int b, double c)
	{
		double sum=a+b+c;
		System.out.println(sum);
	}
	void add(double a, int b, int c)
	{

		double mul=a*b*c;
		System.out.println(mul);
	}
	void add(int a, double b, int c)
	{
		System.out.println(a);
	}
	static void add(String a, char b)
	{	
		System.out.println("Manju123");
	}
	static void add(char a, String b)
	{
		System.out.println("Manju");
	}
	public static void main(String[] args) 
	{
		Method_Overloading m1=new Method_Overloading();
		m1.add(10.5, 2, 2);
		m1.add(10, 1.5, 5);
		m1.add(10, 10, 1.5);
		add("Manju12",'M');
		add('n',"Manju");	
	}
}
