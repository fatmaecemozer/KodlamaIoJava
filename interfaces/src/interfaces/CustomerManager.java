package interfaces;

public class CustomerManager {

	private Logger[] loggers; //referans atamas� var referanslar hep ayn�� o y�zden performans problemi yok
	
	public CustomerManager(Logger[] loggers) {
		//super(); gerek yok
		this.loggers = loggers;
	}
	
	public void add(Customer customer) {
		System.out.println("M��teri eklendi " + customer.getFirstName());
		
		//customer manager loglamaya ba��ml� 
		//loosly-tightly coupled 
		//�uan kat� �ekilde ba�l� tightly coupled 
		//DatabaseLogger logger = new DatabaseLogger();
		//logger.log(customer.getFirstName() + " veri taban�na logland�");
	
		//loosly coupled'a �eviriyoruz DEPENDENCY INJECTION �LE
		//this.logger.log(customer.getFirstName()); tek logger
		/*for(Logger logger : loggers) {
			logger.log(customer.getFirstName()); //birden fazla logger tipi i�in
		}*/
		
		//Utils utils = new Utils(); //static hale getirdik
		Utils.runLoggers(loggers, customer.getFirstName());
	}
	public void delete(Customer customer) {
		System.out.println("M��teri silindi " + customer.getFirstName());
		
		//DatabaseLogger logger = new DatabaseLogger();
		//logger.log(customer.getFirstName() + " veri taban�na logland�");
		
		//this.logger.log(customer.getFirstName());
		/*for(Logger logger : loggers) {
			logger.log(customer.getFirstName());
		}*/
		
		Utils.runLoggers(loggers, customer.getLastName());

	}
	
}
