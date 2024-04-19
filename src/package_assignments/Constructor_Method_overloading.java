package package_assignments;
public class Constructor_Method_overloading {
	public static void main(String[] args) 
	{
		new Constructor_Method_overloading(2,3);
		new Constructor_Method_overloading(2.5,3);
		new Constructor_Method_overloading(2.5,2.5);
		new Constructor_Method_overloading(20,2);
		Method_Overloading m1=new Method_Overloading();
		m1.add(10.5, 2, 2);
		m1.add(10, 1.5, 5);
		m1.add(10, 10, 1.5);
		add("Manju12",'M');
		add('P',"Priyanka34");
	}
		Constructor_Method_overloading(int a, int b)
		{
			int sum=a+b;
			System.out.println(sum);
		}
		Constructor_Method_overloading(double a, int b)
		{
			double sum=a+b;
			System.out.println(sum);
		}
		Constructor_Method_overloading(double a, double b)
		{
			double sum=a+b;
			System.out.println(sum);
		}
		Constructor_Method_overloading(short a, int b)
		{
			int sum=a+b;
			System.out.println(sum);
		}
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
}
