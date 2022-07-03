import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class Application {
		ArrayListApplicants alp2= new ArrayListApplicants();//KANEI ENA ARRAYLIST STO OPOIO MPAINOYN OI NEOI APPLICANTS OPOU KANOUN AITHSH
	//SE AYTHN THN KLASH DHMIOURGOUNTAI NEES AITHSEIS
	public Applicant newApplicant = new Applicant("","","",1,"",1,"");
//	Scanner s = new Scanner(System.in);
	//File file1 = new File("analyshee.txt");				KWDIKAS GIA NA BEI ARXEIO APO XRHSTH ALLA EMFANIZEI ERROR
	//Scanner fileScanner = new Scanner(file1);
	Scanner input = new Scanner(System.in);
	String fileName = "";

	Random r = new Random();
	Application(int number){
		if (number==1) {
 
		System.out.print("Enter your first name : ");
		newApplicant.name=input.nextLine();
		System.out.print("Enter your last name : ");
		newApplicant.lastName=input.nextLine();
		System.out.print("Enter your email : ");
		newApplicant.email=input.nextLine();
		System.out.println("A random generator will provide you with your unique application code");
 		newApplicant.applicationCode=r.nextInt(100000); 
		System.out.println("Your application code is : "+newApplicant.applicationCode);
		System.out.print("Now enter your application text here (must end with .txt) : ");
		
		while (!fileName.contains(".txt")) {
 		fileName = input.nextLine();
 		System.out.print("Your file must end in .txt, please re-enter your application name : ");
		}
		
 		System.out.println("\nYour application with the name "+ fileName + " has been sent!");

  		alp2.addApplicant(newApplicant);
 		 new FindApplication(number,alp2);
		System.out.print("If you want to return to the Menu press yes, otherwise press no :");
		String menu;	
		menu = input.next();
		if(menu.equals("yes")) {
			TextMenu m =new TextMenu(null);
		}
		}
		
		
		
		
		
	
 		if(number==3) {
  		int number1;
 		System.out.println("		     MENU FOR CHECKING THE APPLICATION");

 		System.out.println("If you want to comment on an application press : 1");//regular members
		System.out.println("If you want to grade the application press : 2"); //President
		System.out.println("If you want to accept an application press : 3"); //Secretariat
		System.out.println("If you want to see an application press : 4");
 		System.out.println("If you want to quit press : 5");
		System.out.print("Enter a number : ");
		number1 = input.nextInt();
		if (number1 == 5) {
			System.exit(0);
		}
 
  		new President(number1,newApplicant);
  		new Secretariat(number1,newApplicant);
  		new ReguralMembers(number1,newApplicant);

  			if (number1==4) {
  				
  				System.out.println("This is "+ newApplicant.name +" "  + newApplicant.lastName +" application"); //DEN EMFANIZONTAI TA ONOMATA TWN NEWN AITOUNTWN.
  				System.out.println("Email : "+newApplicant.email);
  				System.out.println("Application Code : "+newApplicant.applicationCode);
  				System.out.println("Comments made by the regural members : "+newApplicant.comments);
			
		}
		
	}
	
	}
	
}
