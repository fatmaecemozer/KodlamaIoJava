package conditions;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sayi1 = 20;
		int sayi2 = 25;
		int sayi3 = 2;
		int enBuyuk = sayi1;
		
		if(enBuyuk<sayi2) {
			enBuyuk = sayi2;
		}
		if(enBuyuk<sayi3) {
			enBuyuk = sayi3;
		}
		
		System.out.println("En b�y�k:"+enBuyuk);
		
		char grade = 'A';
		
		switch(grade) {
			case 'A':
				System.out.println("M�kemmel, ge�tiniz");
				break;
			case 'B':
				System.out.println("G�zel, ge�tiniz");
				break;
			case 'C':
				System.out.println("Ge�tiniz");
				break;
			case 'F':
				System.out.println("Kald�n�z");
				break;
			default:
				System.out.println("Ge�ersiz not");
		}
	}

}
