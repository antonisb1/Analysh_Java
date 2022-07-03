import java.util.ArrayList;
import java.util.Scanner;

public class FindApplication {

	Scanner s = new Scanner(System.in);
	int code;
	int number;
	//TA STOIXEIA TWN HDH YPARXOUSWN MELWN(AITOUNTWN)
	String menu;

	 ArrayList<Applicant> applicants= new ArrayList<Applicant>();

	public void addApplicant(Applicant anApplicant) {
		applicants.add(anApplicant);
	}
	
	ArrayListApplicants ala;
	FindApplication(int number,ArrayListApplicants ala) {
			this.ala=ala;
			Applicant ap1;
 
		if (number==2) {
			System.out.print("Enter your unique application code (for example 11111) : ");// p.x 11111,22222,33333,44444 h 55555
			code=s.nextInt(); 
		
			ap1= ala.getApCode(code);
			ap1.printData();
			System.out.print("If you want to return to the Menu press yes, otherwise press no :");
 			menu = s.next();
			if(menu.equals("yes")) {
				TextMenu m =new TextMenu(null);
			}
 			
			
		}
		
 
		}
	}

	
	

