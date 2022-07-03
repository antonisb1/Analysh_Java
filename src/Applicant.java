import java.util.ArrayList;

public class Applicant {

	String name;
	String lastName;
	String email;
	int applicationCode;
	String comments;
	int grade;
	String approved;
	//TA STOIXEIA TWN HDH YPARXOUSWN MELWN(AITOUNTWN)
	 
 		
 	
		
	Applicant(String name,String lastName,String email,int applicationCode,String comments,int grade,String approved){
		
		this.name = name;
		this.lastName = lastName;
		this.email = email;
		this.applicationCode = applicationCode;
		this.comments = comments;
		this.grade = grade;
		this.approved = approved;
	}
 
	void printData(){
		System.out.println("This is "+ name +" "  + lastName +" application");
		System.out.println("Email : "+email);
		System.out.println("Application Code : "+applicationCode);
		System.out.println("Comments made by the regural members : "+comments);
		System.out.println("Grade : "+ grade);
		System.out.println("Status :" + approved);
	}
	

}
