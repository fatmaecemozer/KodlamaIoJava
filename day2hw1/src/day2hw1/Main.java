package day2hw1;

public class Main {

	public static void main(String[] args) {

		Course course = new Course();
		course.id = 1;
		course.name = "Java React";
		course.instructor = "Engin Demiroğ";
		
		CourseManager cManager = new CourseManager();
		cManager.add(course);
		
		Student student = new Student();
		student.setId(1);
		student.setMail("email");
		
		System.out.println(student.getMail());
		System.out.println(student.getId());

	}

}
