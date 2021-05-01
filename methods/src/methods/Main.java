package methods;

public class Main {

	public static void main(String[] args) {

		sayiBulmaca();
		String mesaj = "Bug�n hava �ok g�zel";
		String yeniMesaj = mesaj.substring(0,2);
		System.out.println(yeniMesaj);
		int sayi = topla(5,7);
		System.out.println(sayi);
		int toplamDeger = topla2(2,3,4,5);
		System.out.println(toplamDeger);
	}
	
	public static void sayiBulmaca() {
		int[] sayilar = new int[] {1,2,5,7,9,0};
		int aranacak = 6;
		boolean varMi = false;
		
		for(int sayi :sayilar) {
			if(sayi==aranacak) {
				varMi = true;
				break;
			}
		}
		if(varMi) {
			mesajVer("Sayi mevcuttur:"+aranacak);
		}else {
			mesajVer("Sayi mevcut de�il:" +aranacak);
		}
	}
	
	public static void mesajVer(String aranacak) {
		System.out.println(aranacak);
	}

	public static void ekle() {
		System.out.println("Eklendi");
	}
	public static void sil() {
		System.out.println("Silindi");

	}
	public static void guncelle() {
		System.out.println("G�ncellendi");

	}
	public static int topla(int a,int b) {
		int toplam = a+b;
		return toplam;
	}
	public static int topla2(int... sayilar) {
		//birden fazla int al�yor demek
		int toplam = 0;
		for(int sayi :sayilar) {
			toplam+=sayi;
		}
		return toplam;
	}
}
