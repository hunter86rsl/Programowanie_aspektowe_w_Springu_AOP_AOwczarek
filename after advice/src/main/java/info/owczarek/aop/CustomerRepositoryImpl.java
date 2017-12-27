package info.owczarek.aop;

public class CustomerRepositoryImpl implements CustomerRepository {

	public Customer getCustomer(long customerID) {
		return null;
	}

	public String getCustomerName(long customerID) {
		return "Janek";
	}
	
	public void addCustomer(Customer customer) {
		if (customer.getName() == null) {
			throw new RuntimeException("Customer name can't be null");
		}
		
		System.out.println("Customer saved");
	}

}
