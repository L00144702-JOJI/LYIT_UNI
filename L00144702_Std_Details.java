import java.util.Scanner;

public class L00144702_Std_Details
{
	public static void main(String args[])
	{
		String Std_Name, Std_DOB, Std_LNo, Std_Address, Std_Place, Std_County, Std_Country, Std_Course;
		Integer Std_PNo;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Student Name:");
		Std_Name=sc.nextLine();
		System.out.println("Student Date of Birth:");
		Std_DOB=sc.nextLine();
		System.out.println("Student Lnumber:");
		Std_LNo=sc.nextLine();
		System.out.println("Student Address:");
		Std_Address=sc.nextLine();
		System.out.println("Student Place:");
		Std_Place=sc.nextLine();
		System.out.println("Student County:");
		Std_County=sc.nextLine();
		System.out.println("Student Country:");
		Std_Country=sc.nextLine();
		System.out.println("Student Phone No.:");
		Std_PNo=sc.nextInt();
		System.out.println("Student Course:");
		Std_Course=sc.nextLine();
		System.out.println("\nStudent Name:"+Std_Name);
		System.out.println("Student DOB:"+Std_DOB);
		System.out.println("Student LNumber:"+Std_LNo);
		System.out.println("Student Phone No.:"+Std_PNo);
		System.out.println("Student Address:"+Std_Address);
		System.out.println("Student Place:"+Std_Place);
		System.out.println("Student County:"+Std_County);
		System.out.println("Student Country:"+Std_Country);
		System.out.println("Student Course:"+Std_Course);
	}
}
