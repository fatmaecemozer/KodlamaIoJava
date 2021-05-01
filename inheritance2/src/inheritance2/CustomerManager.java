package inheritance2;

public class CustomerManager {

	public void add(Logger logger) {
		System.out.println("Müþteri eklendi");
		
		//sürdürülebilir deðil
		//DatabaseLogger logger = new DatabaseLogger();
		logger.log();

	}
}
