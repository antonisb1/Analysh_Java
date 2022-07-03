import java.util.Scanner;

public class ReguralMembers {

	
	String comment;
	Scanner s = new Scanner(System.in);
	String answer="no";
	ReguralMembers(int number,Applicant app){
 		
		if(number==1) {
 			while(answer.contains("no")) {
 			System.out.print("Please enter your comment regarding the application here : ");
			comment = s.nextLine();
			System.out.println("If your comment is this : "+ comment +"\nenter yes,otherwise enter no");
			System.out.print("Enter yes/no : ");
			answer = s.nextLine();
			if(answer.contains("no")) {
				System.out.println("Please rewrite your comment\n");
			}
			}
			app.comments=comment;
			System.out.println("Your comment regarding the application has been succesfully sent!");
			
			
			System.out.print("If you want to return to the Menu press yes, otherwise press no :");
			String menu;
			menu = s.nextLine();
			if(menu.equals("yes")) {
				TextMenu m =new TextMenu(null);
			}
		}
		
	}
	
	
	
	
}
