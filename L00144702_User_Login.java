import java.util.Scanner;
 
public class L00144702_User_Login
{
	public static void main(String args[])
	{
		String User1="Admin", Pwd1="Admin123", User2="Guest1", Pwd2="Guest111", User3='Guest2", Pwd3="Guest222";
		String User, Pwd;
			
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
			System.out.println("Welcome Guest2");
		}
		else if(User.equals(user3) && (Pwd.equals(Pwd3)))
		{
			System.out.println("Welcome Guest3");
		}
		else
		{
			System.out.println("Wrong Username and Password");
		}
	}
}
