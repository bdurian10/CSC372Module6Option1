package csc372Module6Option1;

public class Student {
	
	protected int rollno;		//stores roll number
	protected String name;		//stores student name
	protected String address;	//stores student address
	
	//default constructor
	public Student() {
		rollno = 0;
		name = "";
		address = "";
	}
	
	//parameterized constructor
	public Student(int rollno, String name, String address) {
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}
	
	//getter for rollno
	public int getRollno() {
		return rollno;
	}
	
	//setter for rollno
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	//getter for name
	public String getName() {
		return name;
	}
	
	//setter for name
	public void setName(String name) {
		this.name = name;
	}
	
	//getter for address
	public String getAddress() {
		return address;
	}
	
	//setter for address
	public void setAddress(String address) {
		this.address = address;
	}
	
	//Returns Student attributes as String
	public String toString() {
		return this.rollno + " " + this.name + " " + this.address;
	}

}
