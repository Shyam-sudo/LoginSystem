package phase1;
import java.util.Scanner;
public class e1UserPass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String user, pass;
		
		System.out.print("Enter your username:  ");
		user = input.nextLine();
		
		System.out.print("Enter your password:  ");
		pass = input.nextLine();
		
		if(user.equals("admin")  &&  (pass.equals("admin"))) {
			System.out.println("Welcome to MindMaster.");
		}else {
			System.out.println("Incorrect username or Password");
		}
	}

}
