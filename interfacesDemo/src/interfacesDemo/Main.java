package interfacesDemo;

public class Main {

	public static void main(String[] args) {

		//ICustomerDal customerDal = new OracleCustomerDal();
		CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
		//customerManager.customerDal = new OracleCustomerDal();
		customerManager.add();
	}

}
