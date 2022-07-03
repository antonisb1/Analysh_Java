import java.util.Scanner;

public class President {
	
	
 	Scanner s = new Scanner(System.in);
 	President(int number,Applicant app){
		
 
	 if (number==2) {
		 int grade;
 		 System.out.print("Please enter a grade for the application : ");
 		 grade=s.nextInt();
		 app.grade=grade;
			System.out.print("If you want to return to the Menu press yes, otherwise press no :");

			String menu;
			menu = s.next();
			if(menu.equals("yes")) {
				TextMenu m =new TextMenu(null);
			}
	 }
	}
	
}
