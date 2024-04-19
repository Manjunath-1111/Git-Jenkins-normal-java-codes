package package_assignments;
import java.util.*;
public class ScannerClass_ASMD {
	public static void main(String[] args) 
	{
		add();
		System.out.println("Addition of 2 numbers");
		sub();
		System.out.println("Subtraction of 2 numbers");
		ScannerClass_ASMD s1=new ScannerClass_ASMD();
		s1.mul();
		System.out.println("Multiplication of 2 numbers");
		s1.div();
		System.out.println("Division of 2 numbers");
	}
	static void add()
	{
	Scanner s1=new Scanner(System.in);
	int a=s1.nextInt();
	int b=s1.nextInt();
	int sum=a+b;
	System.out.println(sum);
	s1.close();
	}
	static void sub()
	{
	Scanner s1=new Scanner(System.in);
	int a=s1.nextInt();
	int b=s1.nextInt();
	int sub=a-b;
	System.out.println(sub);
	s1.close();
	}
	void mul()
	{
	Scanner s1=new Scanner(System.in);
	int a=s1.nextInt();
	int b=s1.nextInt();
	int mul=a*b;
	System.out.println(mul);
	s1.close();
	}
	void div()
	{
	Scanner s1=new Scanner(System.in);
	int a=s1.nextInt();
	int b=s1.nextInt();
	int div=a/b;
	System.out.println(div);
	s1.close();
	}
}
