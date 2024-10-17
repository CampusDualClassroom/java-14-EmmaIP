package com.campusdual.classroom;

public class Doctor extends Person {

	protected String specialization;

	public Doctor(String name, String surname, String specialization) {
		super(name, surname);
		this.specialization = specialization;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	@Override
	public void getDetails() {
		System.out.println("Doctor: " + this.getName() + " " + this.getSurname()
				+ "\n\tSpecialization: " + this.getSpecialization());
	}
}
