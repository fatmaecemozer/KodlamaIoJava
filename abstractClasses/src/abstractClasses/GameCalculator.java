package abstractClasses;

public abstract class GameCalculator {

	public abstract void hesapla();
		//override art�k zorundal�k
	
	public final void gameOver() {
		System.out.println("Oyun bitti");
	}
	//final o y�zden override edilemez
}
