package package_assignments;
import java.util.*;
public class ScannerClass_1to100 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter numer 1 manually");
		s1.nextInt();
		for(int i=2; i<=99; i++)
		System.out.println(i);
		System.out.println("Enter numer 100 manually");
		s1.nextInt();
		s1.close();
		
	}
}
