package package_assignments;
import java.util.*;
public class ScannerClass_ASMD_Single_object 
{
	static int a;
	static int b;
	
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
	a=s1.nextInt();
	b=s1.nextInt();
	add(); 
	System.out.println("Addition of 2 numbers");
	a=s1.nextInt();
	b=s1.nextInt();
	sub();
	System.out.println("Subtraction of 2 numbers");
	ScannerClass_ASMD_Single_object s2=new ScannerClass_ASMD_Single_object();
	a=s1.nextInt();
	b=s1.nextInt();
	s2.mul();
	System.out.println("Multiplication of 2 numbers");
	a=s1.nextInt();
	b=s1.nextInt();
	s2.div();
	System.out.println("division of 2 numbers");
	s1.close();
	}
	static void add()
	{
		int sum=a+b;
		System.out.println(sum);
	}
	static void sub()
	{
		int sub=a-b;
		System.out.println(sub);
	}
	void mul()
	{
		int mul=a*b;
		System.out.println(mul);
	}
	void div()
	{
		int div=a/b;
		System.out.println(div);
	}
}
