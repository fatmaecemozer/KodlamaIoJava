package classes;

public class Main {

	public static void main(String[] args) {

		//classlar ile operasyonlarý(metotlarý) grupluyoruz
		//classlar referans tiptir
		CustomerManager customerManager = new CustomerManager();
		//instance'ýný oluþturdum nesnesi üretildi
		CustomerManager customerManager2 = new CustomerManager();
		customerManager =  customerManager2;

		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();
		
		DortIslem dortIslem = new DortIslem();
		int sonuc = dortIslem.Topla(3, 4);
		System.out.println(sonuc);
		
	}

}
