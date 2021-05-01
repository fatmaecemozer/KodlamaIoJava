package interfaces;

public class CustomerManager {

	private Logger[] loggers; //referans atamasý var referanslar hep aynýý o yüzden performans problemi yok
	
	public CustomerManager(Logger[] loggers) {
		//super(); gerek yok
		this.loggers = loggers;
	}
	
	public void add(Customer customer) {
		System.out.println("Müþteri eklendi " + customer.getFirstName());
		
		//customer manager loglamaya baðýmlý 
		//loosly-tightly coupled 
		//þuan katý þekilde baðlý tightly coupled 
		//DatabaseLogger logger = new DatabaseLogger();
		//logger.log(customer.getFirstName() + " veri tabanýna loglandý");
	
		//loosly coupled'a çeviriyoruz DEPENDENCY INJECTION ÝLE
		//this.logger.log(customer.getFirstName()); tek logger
		/*for(Logger logger : loggers) {
			logger.log(customer.getFirstName()); //birden fazla logger tipi için
		}*/
		
		//Utils utils = new Utils(); //static hale getirdik
		Utils.runLoggers(loggers, customer.getFirstName());
	}
	public void delete(Customer customer) {
		System.out.println("Müþteri silindi " + customer.getFirstName());
		
		//DatabaseLogger logger = new DatabaseLogger();
		//logger.log(customer.getFirstName() + " veri tabanýna loglandý");
		
		//this.logger.log(customer.getFirstName());
		/*for(Logger logger : loggers) {
			logger.log(customer.getFirstName());
		}*/
		
		Utils.runLoggers(loggers, customer.getLastName());

	}
	
}
