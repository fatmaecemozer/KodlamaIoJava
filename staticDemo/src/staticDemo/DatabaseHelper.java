package staticDemo;

public class DatabaseHelper {

	public static class Crud{ //create-read-update-delete
		//inner class
		public static void delete() {
			
		}
		public static void update() {
			
		}
	}
	
	//Solid in single responsibility anlayýþýna aykýrý
	public static class Connection{
		public static void createConnection() {
			
		}
	}
}
