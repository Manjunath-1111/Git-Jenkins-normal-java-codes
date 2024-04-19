package package_assignments;
public class If_else_statement_for_leaf_year {
	public static void main(String[] args) 
	{
		int a;
		a=2050;
		int b;
		b=2052;
		
		if (a%4==0) 
		{
			System.out.println(a+" is leaf year");
		}
		else
		{
			System.out.println(a+" is not leaf year");
		}
		if (b%4!=0)
		{
			System.out.println(b+" is not leaf year");
		}
		else
		{
			System.out.println(b+" is leaf year");
		}
	}
}
