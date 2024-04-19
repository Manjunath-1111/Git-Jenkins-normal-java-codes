package package_assignments;
import java.util.*;
public class ScannerClass_AreaOfCircle {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter radius of circle" );
		int r= s1.nextInt();
		double pi=3.142;
		double Area=pi*r*r;
		System.out.println("Area of circle= "+Area);
		s1.close();
	}
}
