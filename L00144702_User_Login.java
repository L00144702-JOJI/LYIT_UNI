import java.util.Scanner;
 
public class L00144702_User_Login
{
	public static void main(String args[])
	{
		String User1="Admin";
		String Pwd1="Admin123";
		String User2="Guest";
		String Pwd2="Guest2";
		String User;
		String Pwd;
			
		Scanner s=new Scanner(System.in);
			
		System.out.println("\nEnter User Name:");
		User=s.nextLine();
		System.out.println("Ener Password:");
		Pwd=s.nextLine();
		
		//Checking the condition for user login
		if(User.equals(User1) && (Pwd.equals(Pwd1)))
		{
			System.out.println("Welcome Admin");
		}
		else if(User.equals(User2) && (Pwd.equals(Pwd2)))
		{
			System.out.println("Welcome Guest");
		}
		else
		{
			System.out.println("Wrong Username and Password");
		}
	}
}
