package abstractClasses;

public abstract class GameCalculator {

	public abstract void hesapla();
		//override artýk zorundalýk
	
	public final void gameOver() {
		System.out.println("Oyun bitti");
	}
	//final o yüzden override edilemez
}
