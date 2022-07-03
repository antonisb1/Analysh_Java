
public class Main {

	public static void main(String[] args) {

		//HDH YPARXOUSES AITHSEIS//
		
		Applicant a1 = new Applicant("Antonis","Benardis","iis11111@uom.edu.gr",11111,"Not that good",4,"Failed");//YPOTHETOUME OTI HMASTE KATHIGITES POY KANOYN AITHSH
		Applicant a2 = new Applicant("Eua","Koulisidou","iis22222@uom.edu.gr",22222,"Excellent",10,"Accepted");
		Applicant a3 = new Applicant("Xristiana","Gioti","iis33333@uom.edu.gr",33333,"Great",9,"Accepted");
		Applicant a4 = new Applicant("Dimitris","Politis","iis44444@uom.edu.gr",44444,"Good",7,"Accepted");
		Applicant a5 = new Applicant("Katerina","Kelepouri","iis55555@uom.edu.gr",55555,"Very good",8,"Accepted");
				
		
		ArrayListApplicants ala = new ArrayListApplicants();
		ala.addApplicant(a1);
		ala.addApplicant(a2);
		ala.addApplicant(a3);
		ala.addApplicant(a4);
		ala.addApplicant(a5);
		new TextMenu(ala);
 		
 		
		
		
		
	}

}
