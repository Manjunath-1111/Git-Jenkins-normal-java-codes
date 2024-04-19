package package_assignments;
public class SIB_IIB_paraconstructor_and_mainMethod {
	public static void main(String[] args) 
	{
		System.out.println("Main Method");
		new SIB_IIB_paraconstructor_and_mainMethod (10);	
	}
	static 
	{
		System.out.println("SIB");
		//new SIB_IIB_paraconstructor_and_mainMethod (10);
		//main(null);
	}
	{
		System.out.println("IIB");
		
	}
	SIB_IIB_paraconstructor_and_mainMethod(int a)
	{
		System.out.println("constructor");
	}		
}
