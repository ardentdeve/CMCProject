package project;

import java.util.ArrayList;

/**
package project;

import java.util.ArrayList;

/**
 * @author aonneji
 *
 */
public class SearchController{
	DBController dbl;

	public  SearchController(){
		dbl = new DBController();
	}

	public ArrayList<University> search(String name, String state, String location, String control,int numberStudentsMin, int numberStudentsMax, 
			double pctFemaleMin, double pctFemaleMax, double satVerbalMin, double satVerbalMax, double satMathMin, double satMathMax, 
			double expensesMin, double expensesMax, double pctFinancialAidMin, double pctFinancialAidMax, int numberOfApplicantsMin, 
			int numberOfApplicantsMax, double pctAdmittedMin, double pctAdmittedMax, double pctEnrolledMin, double pctEnrolledMax, 
			int AcademicScaleMin, int AcademicScaleMax, int socialScaleMin, int socialScaleMax, int QualityOfLifeScaleMin, int QualityOfLifeScaleMax,ArrayList<String>emphasis) {

		ArrayList<University > universityList = dbl.getUniversities();
		ArrayList<University> searchResult = new ArrayList<University>();
		
		
		
		for(University u: universityList) {
			boolean includeUni = true;

			if(name!=null) {
				if(!(u.getName().equals(name)))
				{
					includeUni = false;
				}

			}

			if(state!=null) {
				String uniN= u.getState();
				if(!(uniN.equals(state)))
				{
					includeUni = false;
				}

			}

			if(location!=null) {
				String uniN= u.getLocation();
				if(!(uniN.equals(location)))
				{
					includeUni = false;
				}

			}

			if(control!=null) {
				String uniN= u.getControl();
				if(!(uniN.equals(control)))
				{
					includeUni = false;
				}

			}
		
			
			if(numberStudentsMin!=-1) {
				int uniN= u.getNumberStudents();
				if(uniN< numberStudentsMin)
				{
					includeUni = false;
				}

			}
			
			if(numberStudentsMax!=-1) {
				int uniN= u.getNumberStudents();
				if(uniN> numberStudentsMax)
				{
					includeUni = false;
				}

			}

			if(pctFemaleMin!=-1.0) {
				double uniN= u.getPctFemale();
				if(uniN< pctFemaleMin )
				{
					includeUni = false;
				}

			}
			if(pctFemaleMax!=-1.0) {
				double uniN= u.getPctFemale();
				if(uniN> pctFemaleMax )
				{
					includeUni = false;
				}

			}

			if(satVerbalMin!=-1.0) {
				double uniN= u.getSatVerbal();
				if(uniN < satVerbalMin)
				{
					includeUni = false;
				}

			}
			
			if(satVerbalMax!=-1.0) {
				double uniN= u.getSatVerbal();
				if(uniN > satVerbalMax)
				{
					includeUni = false;
				}

			}
			
			

			if(satMathMin!=-1) {
				double uniN= u.getSatMath();
				if(uniN < satMathMin)
				{
					includeUni = false;
				}

			}
			
			if(satMathMax!=-1) {
				double uniN= u.getSatMath();
				if(uniN > satMathMax)
				{
					includeUni = false;
				}

			}

			if(expensesMin!=-1.0) {
				double uniN= u.getExpenses();
				if(uniN < expensesMin)
				{
					includeUni = false;
				}

			}
			
			if(expensesMax!=-1.0) {
				double uniN= u.getExpenses();
				if(uniN > expensesMax)
				{
					includeUni = false;
				}

			}

			if(pctFinancialAidMin!=-1.0) {
				double uniN= u.getPctFinancialAid();
				if(uniN < pctFinancialAidMin)
				{
					includeUni = false;
				}

			}
			
			if(pctFinancialAidMax!=-1.0) {
				double uniN= u.getPctFinancialAid();
				if(uniN > pctFinancialAidMax)
				{
					includeUni = false;
				}

			}
			if(pctEnrolledMin!=-1.0) {
				double uniN= u.getPctEnrolled();
				if(uniN < pctEnrolledMin)
				{
					includeUni = false;
				}

			}
			
			if(pctEnrolledMax!=-1.0) {
				double uniN= u.getPctEnrolled();
				if(uniN > pctEnrolledMax)
				{
					includeUni = false;
				}

			}
			
			if(AcademicScaleMin!=-1.0) {
				double uniN= u.getAcademicScale();
				if(uniN < AcademicScaleMin)
				{
					includeUni = false;
				}

			}
			
			if(AcademicScaleMax!=-1.0) {
				double uniN= u.getAcademicScale();
				if(uniN > AcademicScaleMax)
				{
					includeUni = false;
				}

			}
			
			if(socialScaleMin!=-1){
				int uniN= u.getSocialScale();
				if(uniN < socialScaleMin)
				{
					includeUni = false;
				}
			}
			
			if(socialScaleMax!=-1){
				int uniN= u.getSocialScale();
				if(uniN > socialScaleMax)
				{
					includeUni = false;
				}
			}
			
			if(QualityOfLifeScaleMax!=-1) {
				int uniN= u.getQualityOfLifeScale();
				if(uniN > QualityOfLifeScaleMax)
				{
					includeUni = false;
				}
			}
			if(QualityOfLifeScaleMin!=-1){
				int uniN= u.getQualityOfLifeScale();
				if(uniN < QualityOfLifeScaleMin)
				{
					includeUni = false;
				}
			}

			
			if(emphasis !=null)
			{
			  for(String s : emphasis)
			  {
				  if(!(u.getEmphases().contains(s)))
				  {
					 includeUni = false; 
				  }
			  }
			}

			if(includeUni) {
				searchResult.add(u);
			}
			


		}
		return searchResult;
	}
}


