package inheritance2;

public class CustomerManager {

	public void add(Logger logger) {
		System.out.println("M��teri eklendi");
		
		//s�rd�r�lebilir de�il
		//DatabaseLogger logger = new DatabaseLogger();
		logger.log();

	}
}
