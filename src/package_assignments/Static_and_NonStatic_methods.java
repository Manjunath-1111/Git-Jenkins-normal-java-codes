package package_assignments;
public class Static_and_NonStatic_methods {
	public static void main(String[] args) 
	{
		addition();
		subtraction();
		Static_and_NonStatic_methods n1=new Static_and_NonStatic_methods();
		n1.multiplication();
		n1.division();
	}
	static void addition()
	{
		int a=20;
		int b=50;
		int add=a+b;
		System.out.println(add);
	}
	static void subtraction()
	{
		int a=50;
		int b=30;
		int sub=a-b;
		System.out.println(sub);
	}
	void multiplication()
	{
		int a=10;
		int b=10;
		int mlt=a*b;
		System.out.println(mlt);
	}
	void division()
	{
		int a=100;
		int b=10;
		int div=a/b;
		System.out.println(div);
	}	
}
