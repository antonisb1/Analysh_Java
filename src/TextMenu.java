import java.util.Scanner;

public class TextMenu {

	public int number;
	ArrayListApplicants ala;
	TextMenu(ArrayListApplicants ala)
	{
		this.ala=ala;
		//MENU ME OLES TIS DIATHESIMES EPILOGES
		Scanner s = new Scanner(System.in);
 		System.out.println("		     MENU FOR APPLICANT");
		System.out.println("If you want to make a new application press : 1");//applicant
		System.out.println("If you want to find an already existing application press : 2");//application
 		System.out.println("If you want to check an application,comment it, grade it or accept it press : 3");
 		System.out.println("If you want to quit press : 4");
 		System.out.print("Enter a number : ");

 
		number = s.nextInt();
		if (number == 4) {
			System.exit(0);
		}
		new Application(number);
		new FindApplication(number,ala);
		
		
	}

	public int getNumber() {
		return number;
	}





	
	
	
	
}
