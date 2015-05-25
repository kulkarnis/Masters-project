package com.project.careloop;

public class CARE_Loop {

	public void issue_Identification (){
		System.out.println("Identification phase..");
		directive();
		fact();
		perception();
		hypothesis();
		issue_verification();
	}
	
	public void issue_verification (){
		System.out.println("Verification phase..");
		directive();
		fact();
		perception();
		hypothesis();
		boolean isIssueVerified = true;
		if (isIssueVerified){
			issue_cause_determination ();
		}else
			issue_Identification();
			
	}
	
	public void issue_cause_determination (){
		System.out.println("Cause determination phase..");
		directive();
		fact();
		perception();
		hypothesis();
		boolean highConfidence = true;
		if(highConfidence){
			issue_solution_plan();
		}else
			issue_cause_determination();
	}
	
	public void issue_solution_plan(){
		System.out.println("Issue solution phase..");
		directive();
		fact();
		perception();
		hypothesis();
		boolean verifiedSolution = true;
		if (verifiedSolution){
			System.out.println("Results:");
		}else{
			// If we need to determine cause again
			issue_cause_determination();
			
			//Need solution to recalculate
			issue_solution_plan ();
		}
	}
	
	public void directive (){
		System.out.println("Find directive");
	}
	
	public void fact(){
		System.out.println("Find Facts");
	}
	
	public void perception(){
		System.out.println("Find perception");
	}
	
	public void hypothesis(){
		System.out.println("Find hypothesis");
	}
}
