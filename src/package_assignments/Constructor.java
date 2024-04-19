package package_assignments;
public class Constructor
{
	public static void main(String[] args) 
	{
		new Constructor();
		new Constructor(100);
		new Constructor(true);
		new Constructor("hello");
		new Constructor("M");
		Constructor c1=new Constructor();
	}	
		Constructor()
		{
			System.out.println("1");
		}
		Constructor(int a)
		{
			int sum=a+1;
			System.out.println(sum);
		}
		Constructor(boolean a)
		{
				a= false;
			System.out.println(a);	
		}
		Constructor(String a)
		{
			System.out.println(a);	
		}
		Constructor(char a)
		{
			System.out.println(a);	
		}
}
