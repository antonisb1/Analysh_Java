import java.util.ArrayList;

public class ArrayListApplicants {
	
	

	 ArrayList<Applicant> applicants= new ArrayList<Applicant>();

	public void addApplicant(Applicant anApplicant) {
 		applicants.add(anApplicant);
 	}
	
	public Applicant getApCode(int code) {
		Applicant ap= null;
		for(Applicant a :applicants) {
			if(code==a.applicationCode) {
				ap=a;
			}
				
		}return ap;
	}
	
 
 	}