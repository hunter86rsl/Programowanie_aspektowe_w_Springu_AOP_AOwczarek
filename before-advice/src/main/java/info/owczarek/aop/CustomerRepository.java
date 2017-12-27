package info.owczarek.aop;

public interface CustomerRepository {
	Customer getCustomer(long customerID);
	String getCustomerName(long customerID);
}
