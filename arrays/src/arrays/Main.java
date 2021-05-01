package arrays;

public class Main {

	public static void main(String[] args) {

		String[] ogrenciler = new String[4];
		ogrenciler[0] = "Engin";
		ogrenciler[1] = "Derin";
		ogrenciler[2] = "Salih";
		ogrenciler[3] = "Ecem";
		
		for(int i=0;i<ogrenciler.length;i++) {
			System.out.println(ogrenciler[i]);
		}
		
		for(String ogrenci :ogrenciler) {
			System.out.println(ogrenci);
		}
		
		double[] myList = {1.2, 1.3, 1.4, 1.5};
		double total = 0;
		double max = myList[0];
		for(double number :myList) {
			if(max<number) {
				max = number;
			}
			total = total + number;
			System.out.println(number);
		}
		System.out.println("Toplam: "+total);
		System.out.println("Max: "+max);
		
		//multi-dimensional arrays 
		String[][] sehirler = new String[3][3];
		
		sehirler[0][0] = "Ýstanbul";
		sehirler[0][1] = "Bursa";
		sehirler[0][2] = "Bilecik";
		sehirler[1][0] = "Ankara";
		sehirler[1][1] = "Konya";
		sehirler[1][2] = "Kayseri";
		sehirler[2][0] = "Diyarbakýr";
		sehirler[2][1] = "Þanlýurfa";
		sehirler[2][2] = "Gaziantep";

		for(int i=0;i<=2;i++) {
			System.out.println("*****");
			for(int j=0;j<=2;j++) {
				System.out.println(sehirler[i][j]);
			}
		}
		
	}

}
