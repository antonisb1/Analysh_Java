import java.util.Scanner;

public class Secretariat {

	
 	Scanner s = new Scanner(System.in);

	Secretariat(int number,Applicant app){
		if (number==3) {
		System.out.println("Please if you would like to Accept this application enter : Accepted ");
		System.out.println("If you would like to dismiss this application enter : Failed ");
		System.out.print("Enter your final answer : ");
		String failPass;
		failPass=s.nextLine();
		app.approved=failPass;
		System.out.print("If you want to return to the Menu press yes, otherwise press no :");

		String menu;
		menu = s.next();
		if(menu.equals("yes")) {
			TextMenu m =new TextMenu(null);
		}
		}
	}
	
	
}
