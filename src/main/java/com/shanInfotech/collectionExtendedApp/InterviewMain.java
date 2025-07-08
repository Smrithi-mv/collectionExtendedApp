package com.shanInfotech.collectionExtendedApp;

public class InterviewMain {
	public static void main(String args[]) {
		InterviewScheduler scheduler = new InterviewScheduler();
		
		scheduler.scheduledInterview(new Interview(1, "Smrithi Mv", 93,"10:00 AM"));
		scheduler.scheduledInterview(new Interview(2, "Sharanya Bk", 84,"10:30 AM"));
		scheduler.scheduledInterview(new Interview(3, "adithya", 71,"11:00 AM"));
		
		scheduler.walkInCandidate(new Interview(4, "Deepak", 91,"NOW"));
		
		System.out.println("\nFull SCHEDULE");
		scheduler.displaySchedule();
		
		System.out.println("\nWALK-IN");
		scheduler.displayWalkIns();
		
		System.out.println("\nTOP PERFORMERS (Score >70)");
		scheduler.displayTopScorers(70);

	}

}
