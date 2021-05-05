package staticDemo;

public class ProductManager {

	public void add(Product product) {
		
		//ProductValidator validator = new ProductValidator();
		
		//product validator'�n is valid metodunu static yap�nca 
		//isvalid direk ProductValidator'dan class ismiyle �a��r�labildi new demeden
		//static bellekte kal�yor bu y�zden pahal� bir i�lem !! hep kullan�lmaz
		//new kullan�lmad���� i�in normal yap�c� blok da �al��mad� 
		// C# da yine de �al���rd�
		if(ProductValidator.isValid(product)) {
			System.out.println("Eklendi " + product.name);
		}else {
			System.out.println("Eklenemedi, bilgiler ge�ersizdir");
		}
	}
}
