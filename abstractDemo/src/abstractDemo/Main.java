package abstractDemo;

public class Main {

	public static void main(String[] args) {

		CustomerManager customerManager = new CustomerManager();
		customerManager.databaseManager = new MySqlDatabaseManager();
		//databaseManager t�r�n� vermeden �al��m�yor getCustomer !!
		customerManager.getCustomers();
		
	}

}
