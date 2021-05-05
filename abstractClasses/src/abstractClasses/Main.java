package abstractClasses;

public class Main {

	public static void main(String[] args) {

		WomanGamerCalculator womanGamerCalculator = new WomanGamerCalculator();
		womanGamerCalculator.hesapla();
		womanGamerCalculator.gameOver();
		
		GameCalculator gameCalculator = new ManGamerCalculator();
		gameCalculator.hesapla();
		gameCalculator.gameOver();
	}

}
