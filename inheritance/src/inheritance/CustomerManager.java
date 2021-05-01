package inheritance;

public class CustomerManager {

	public void add(Customer customer) {
		System.out.println(customer.customerNumber + " kaydedildi");
		//polymorphism!!
	}
	//BURDAKÝ CUSTOMER ONU EXTEND EDEN SINIFLARIN REFERANSINI TUTABÝLÝYOR!!
	
	//ayný anda bir çok tipte customer eklemek = bulk insert
	public void addMultiple(Customer[] customers) {
		for(Customer customer : customers) {
			add(customer);
		}
	}
	
	
	/*public void add(IndividualCustomer customer) { //metotlar reusability saðlar
		System.out.println(customer.customerNumber + " kaydedildi");
	}*/
	
	/*public void add(CorporateCustomer customer) {
		System.out.println(customer.customerNumber + " kaydedildi");
	}*/
	
}
