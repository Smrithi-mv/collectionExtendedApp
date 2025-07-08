package com.shanInfotech.collectionExtendedApp.Doctors;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class AppointmentScheduler {
	private List<Appointment> scheduleAppointment=new LinkedList<>();
	private Deque<Appointment> emergencyAppointment= new ArrayDeque<>();
	private PriorityQueue<Appointment> firstPriorityAppointment=new PriorityQueue<>(
			(a,b)->a.getTimeSlot().compareTo(b.getTimeSlot()));
	
	public void scheduleAppoinment(Appointment a) {
		scheduleAppointment.add(a);
		firstPriorityAppointment.offer(a);
	}
	public void emergencyAppoinment(Appointment a) {
		emergencyAppointment.offer(a);
		firstPriorityAppointment.offer(a);
	}
	public void displaySchedule() {
		System.out.println("Scheduled Appoinmtment(FIFO) :");
		scheduleAppointment.forEach(System.out::println);
	}
	public void  displayEmergency() {
		System.out.println("Emergency Appointment(Dequeue):");
		emergencyAppointment.forEach(System.out::println);
		
	}
	
	public void displayPriorityAppointments(String timeThreshold) {
		System.out.println("Priority Appointments (Before Time Slot: " + timeThreshold + "):");
		firstPriorityAppointment.stream().filter(a -> a.getTimeSlot().compareTo(timeThreshold) < 0)
				.sorted(Comparator.comparing(Appointment::getTimeSlot)).forEach(System.out::println);;

}
}