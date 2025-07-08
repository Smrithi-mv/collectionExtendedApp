package com.shanInfotech.collectionExtendedApp.Doctors;

public class DoctorsMain {
	public static void main(String args[]) {
		AppointmentScheduler scheduler=new AppointmentScheduler();
		
		scheduler.scheduleAppoinment(new Appointment(1, "Hema", "Dr.Sristi","10:00 AM"));
		scheduler.scheduleAppoinment(new Appointment(2, "Rani", "Dr.Prithvi","10:30 AM"));
		scheduler.scheduleAppoinment(new Appointment(3, "Vani", "Dr.chaithanya","11:00 AM"));
		
		scheduler.scheduleAppoinment(new Appointment(4, "killu", "Dr.Abhimanyu Birla","NOW"));
		
		System.out.println("/n FULL SCHEDULE");
		scheduler.displaySchedule();
		
		System.out.println("/n EMERGENCY SCHEDULE");
		scheduler.displayEmergency();
		
		System.out.println("/n PRIORITY APPOINTMENT (Before 11:11 AM)");
		scheduler.displayPriorityAppointments("11:11 AM");
	}

}
