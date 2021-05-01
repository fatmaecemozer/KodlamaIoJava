package inheritance2;

public class FileLogger extends Logger {

	@Override
	public void log() { //Method Overriding kendime ait olan fonku yazýyorum
		System.out.println("File loglandý");
	}
}
