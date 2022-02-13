package shoppingapp.main;

public class Customer {
	private Long customerId;
	private String customerName;
	private Integer tier;
	
	public Customer() {
		
	}
	public Customer(Long customerId, String customerName, Integer tier) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.tier = tier;
	}
	
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Integer getTier() {
		return tier;
	}
	public void setTier(Integer tier) {
		this.tier = tier;
	}
	
	

}
