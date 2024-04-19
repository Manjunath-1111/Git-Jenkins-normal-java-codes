package package_assignments;
public class OR_NOT_Operator {
		public static void main(String[] args) 
		{
			int a=100;
			int b=200;
			int c=300;
			int d=400;
		if (!(a<b||c<d))
		{
			System.out.println("T+T=F");
		}	
		if (!(a<b||c>d))
		{
			System.out.println("T+F=F");
		}
		if (!(a>b||c<d))	
		{
			System.out.println("F+T=F");
		}	
		if (!(a>b||c>d))	
		{
			System.out.println("F+F=T");
		}	
		
		}

	}

