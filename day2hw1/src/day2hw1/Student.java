package day2hw1;

public class Student {

	private int id;
	private String mail;
	
	public Student() {
		System.out.println("Student constructor");
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
}
