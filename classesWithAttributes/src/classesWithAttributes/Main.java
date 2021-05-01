package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product product2 = new Product(2, "Laptop", "Asus", 3000, 2, "Siyah");
		
		Product product = new Product();
		product.setName("Telefon");
		product.setId(1);
		product.setDescription("iphone");
		product.setPrice(5000);
		product.setStockAmount(3);
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		productManager.Add(product2);
		
		System.out.println(product2.getDescription());
		System.out.println(product2.getKod());
		System.out.println(product.getKod());
		
		
	}

}
