package com.shanInfotech.collectionExtendedApp.Doctors;

public class Appointment {
	private int id;
    private String patientName;
    private String doctorName;
    private String TimeSlot;
 
    public Appointment() {
    	
    }

	public Appointment(int id, String patientName, String doctorName, String timeSlot) {
		this.id = id;
		this.patientName = patientName;
		this.doctorName = doctorName;
		TimeSlot = timeSlot;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getTimeSlot() {
		return TimeSlot;
	}

	public void setTimeSlot(String timeSlot) {
		TimeSlot = timeSlot;
	}

	@Override
	public String toString() {
		return "Appointment [id=" + id + ", patientName=" + patientName + ", doctorName=" + doctorName + ", TimeSlot="
				+ TimeSlot + "]";
	}

}
