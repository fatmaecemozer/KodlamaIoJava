package day3hw2;

public class Main {

	public static void main(String[] args) {

		User[] user = new User[] {new Student(), new Instructor()};
		UserManager userManager = new UserManager();
		userManager.add(user);
		
		UserManager[] userManagers = new UserManager[] {new StudentManager(), new InstructorManager()};
		
		for(UserManager userManagerNew : userManagers) {
			userManagerNew.assign();
		}	
		
	}

}
