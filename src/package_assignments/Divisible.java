package package_assignments;

public class Divisible {

	public static void main(String[] args) 
	{
		for(int i=1; i<=500; i++)
		{	
		if (i%3==0 && i%5==0)
			System.out.println(i+" computer and Mouse");	
			
		else if(i%3==0)
			System.out.println(i+" computer");
			
		else if(i%5==0)
			System.out.println(i+" Mouse");
			}
			}
	}


