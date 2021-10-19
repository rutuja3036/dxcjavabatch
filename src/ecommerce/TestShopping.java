package ecommerce;

public class TestShopping {
	public static void main(String[] args) {
		
	Customer customerAbdul = new Customer();
	customerAbdul.walkin();
	Securtity maxSecurtity = new Securtity();
	maxSecurtity.scan(customerAbdul);
		
	}

}
