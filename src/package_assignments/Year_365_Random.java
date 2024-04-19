package package_assignments;

public class Year_365_Random 
{
	static int i=60;
	public static void main(String[] args) 
	{
		if (i>=1 && i<=365) 
		{
			if (i>=1 && i<=31) 
				System.out.println(i+" January");
			if (i>=32 && i<=(31+28))
				System.out.println(i+" February");
			if (i>=60 && i<=(59+31))
				System.out.println(i+" March");
			if (i>=91 && i<=(90+30))
				System.out.println(i+" April");
			if (i>=121 && i<=(120+31))
				System.out.println(i+" May");
			if (i>=152 && i<=(151+30))
				System.out.println(i+" June");
			if (i>=182 && i<=(181+31))
				System.out.println(i+" July");
			if (i>=213 && i<=(212+31))
				System.out.println(i+" August");
			if (i>=244 && i<=(243+30))
				System.out.println(i+" September");
			if (i>=274 && i<=(273+31))
				System.out.println(i+" October");
			if (i>=305 && i<=(304+30))
				System.out.println(i+" November");
			if (i>=335 && i<=(334+31))
				System.out.println(i+" December");
		}
	
			else
			
				System.out.println("Invalid day");
		}}
	
