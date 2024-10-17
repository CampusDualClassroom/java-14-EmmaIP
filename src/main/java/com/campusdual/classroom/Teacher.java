package com.campusdual.classroom;

public class Teacher extends Person {

	protected String area;

	public Teacher(String name, String surname, String area) {
		super(name, surname);
		this.area = area;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Override
	public void getDetails() {
		StringBuilder sb = new StringBuilder();
		sb.append("Teacher: ");
		sb.append(this.getName());
		sb.append(" ");
		sb.append(this.getSurname());
		sb.append("\n\tArea: ");
		sb.append(this.getArea());
		System.out.println(sb.toString());
	}
}
