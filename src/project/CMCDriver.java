package project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class CMCDriver {
	private Student s;
	private String username;


	public static void main(String[] args) {

		SearchController searchCh = new SearchController();
		University tech = new University("Kanye West TECHNOLOGY ","Kanye City","BIG-CITY","PRIVATE",
				5000,50.0,800,800,800,22000.0,50,1000.5,25.0,70,4,4,null);
		ArrayList<University>uni= searchCh.search(null,null,null,null,10000,15000,40, 80, 300, 600, 200, 500, 20000, 50000, 40, 80, 4000, 6000, 40 , 80 , 20, 40, 1,2,1,2,1,2,null);
		
				
		//ADELPHI 	NEW YORK 	-1 	PRIVATE 	15000 	70 	500 	475 	37437 	60 	5500 	70 	40 	2 	2 	2



	//School 	State 	Location 	Control 	NumberOfStudents 	PercentFemales 	SATVerbal 	SATMath 	Expenses 	PercentFinancialAid 	NumberOfApplicants 	PercentAdmitted 	PercentEnrolled 	AcademicsScale 	SocialScale 	QualityOfLifeScale
		
				
				
				
				
				
				
				
				
		for(University u : uni)
		{
			System.out.println(u);
		}
		
		StudentUI  studentUI= new StudentUI();
		AdminUI   adminUI= new AdminUI();
		System.out.println(studentUI.logOn("nicoleK", "imad1234"));
		System.out.print(studentUI.getStudentInfo());
		//ArrayList<University>uni = studentUI.getSavedUniversity();
		for(University u: uni)
		{
			System.out.println(u);
		}
		studentUI.removeUniversity("BOSTON COLLEGE");
		//studentUI.editProfile("ashley", "loyola", "imad1234");
		studentUI.logOff();
		System.out.println(adminUI.logOn("Rahal", "Imad"));
		 Student s = new Student("Mimi", "Kardashian23", "MimiLuv33", "mi1234", 'u', 'Y');
		adminUI.addStudent(s);
		Student editS = new Student("MimiN", "Kallya44", "MimiLuv33", "mi1234", 'u', 'N');
		adminUI.editStudent(editS);
		adminUI.activateUser(editS);
		adminUI.deactivateUser(editS);
		adminUI.getStudents();
		adminUI.getAdmins();
		adminUI.logOff();


















	}




















	}

