package classes;

public class Main {

	public static void main(String[] args) {

		//classlar ile operasyonlar�(metotlar�) grupluyoruz
		//classlar referans tiptir
		CustomerManager customerManager = new CustomerManager();
		//instance'�n� olu�turdum nesnesi �retildi
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
