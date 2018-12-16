import java.util.Scanner;

public class L00144702_Std_Details
{
	public static void main(String args[])
	{
		String Std_Name, Std_DOB;
		String Std_LNo;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Student Name:");
		Std_Name=sc.nextLine();
		System.out.println("Student Date of Birth:");
		Std_DOB=sc.nextLine();
		System.out.println("Student Lnumber:");
		Std_LNo=sc.nextLine();
		System.out.println("\nStudent Name:"+Std_Name);
		System.out.println("Student Name:"+Std_DOB);
		System.out.println("Student Name:"+Std_LNo);
	}
}