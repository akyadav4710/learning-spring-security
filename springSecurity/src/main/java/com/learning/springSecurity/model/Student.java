package com.learning.springSecurity.model;

public class Student {
	private int id;
	private String name;
	private String schoolName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public Student(int id, String name, String schoolName) {
		super();
		this.id = id;
		this.name = name;
		this.schoolName = schoolName;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", schoolName=" + schoolName + "]";
	}
	
	

}
