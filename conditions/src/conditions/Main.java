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
		
		System.out.println("En büyük:"+enBuyuk);
		
		char grade = 'A';
		
		switch(grade) {
			case 'A':
				System.out.println("Mükemmel, geçtiniz");
				break;
			case 'B':
				System.out.println("Güzel, geçtiniz");
				break;
			case 'C':
				System.out.println("Geçtiniz");
				break;
			case 'F':
				System.out.println("Kaldýnýz");
				break;
			default:
				System.out.println("Geçersiz not");
		}
	}

}
