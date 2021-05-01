package intro;

public class Main {

	public static void main(String[] args) {
		
		//case sensitive
		//camelCase
		//Don't Repeat Yourself!!
		
		String internetSubeButonu = "internet þubeye gir";
		double dolarDun = 8.15;
		double dolarBugun = 8.18;
		int vade = 36;
		boolean dustuMu = false;
		
		System.out.println(internetSubeButonu);
		
		if(dolarBugun<dolarDun) {
			System.out.println("Dolar düþtü resmi");
		}else if(dolarBugun>dolarDun) {
			System.out.println("Dolar yükseldi resmi");
		}else {
			System.out.println("Dolar eþit resmi");
		}
		
		String kredi1 = "Hýzlý Kredi";
		String kredi2 = "Emekli Kredi";
		String kredi3 = "Konut Kredi";
		String kredi4 = "Çiftçi Kredi";
		String kredi5 = "Msb Kredi";
		String kredi6 = "Meb Kredi";

		String[] krediler=
			{
					"Hýzlý Kredi",
					"Emekli Kredi",
					"Konut Kredi",
					"Çiftçi Kredi",
					"Msb Kredi",
					"Meb Kredi"	
			};
		
		//foreach
		for(String kredi : krediler) {
			System.out.println(kredi);
		}

		for(int i=0;i<krediler.length;i++) {
			System.out.println(krediler[i]);
		}
		
		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi2 = 100;
		System.out.println(sayi1);
		
		int[] sayilar1 = {1,2,3,4,5};
		int[] sayilar2 = {10,20,30,40,50};
		sayilar1 = sayilar2;
		sayilar2[0] = 100;
		System.out.println(sayilar1[0]);
		
		//istisnai durum, metinsel arka planda char array tutuyor
		//ref tip olsa da sonuç deðer tip 
		String sehir1 = "Ankara";
		String sehir2 = "Ýstanbul";
		sehir1 = sehir2;
		sehir2 = "Ýzmir";
		System.out.println(sehir1);
	}

}
