package ecommerce;

public class TestShopping {
	public static void main(String[] args) {
		
	Customer customerAbdul = new Customer();
	customerAbdul.walkin();
	Securtity maxSecurtity = new Securtity();
	
	 boolean isCustomer = maxSecurtity.scan(customerAbdul);
	 if(isCustomer) {
		 customerAbdul.shop();
	 }
		
	 customerAbdul.checkout();
	}

}
