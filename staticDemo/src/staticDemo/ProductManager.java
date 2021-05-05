package staticDemo;

public class ProductManager {

	public void add(Product product) {
		
		//ProductValidator validator = new ProductValidator();
		
		//product validator'ýn is valid metodunu static yapýnca 
		//isvalid direk ProductValidator'dan class ismiyle çaðýrýlabildi new demeden
		//static bellekte kalýyor bu yüzden pahalý bir iþlem !! hep kullanýlmaz
		//new kullanýlmadýýðý için normal yapýcý blok da çalýþmadý 
		// C# da yine de çalýþýrdý
		if(ProductValidator.isValid(product)) {
			System.out.println("Eklendi " + product.name);
		}else {
			System.out.println("Eklenemedi, bilgiler geçersizdir");
		}
	}
}
