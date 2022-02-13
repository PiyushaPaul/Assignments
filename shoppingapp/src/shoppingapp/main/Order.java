package shoppingapp.main;

import java.time.LocalDate;
import java.util.List;

public class Order {
	private Long orderId;
	private String status;
	private LocalDate orderDate;
	private LocalDate deliveryDate;
	private Customer customer;
	private List<Product> products;
	
	public Order() {
		
	}

	public Order(Long orderId, String status, LocalDate orderDate, LocalDate deliveryDate, Customer customer,
			List<Product> products) {
		this.orderId = orderId;
		this.status = status;
		this.orderDate = orderDate;
		this.deliveryDate = deliveryDate;
		this.customer = customer;
		this.products = products;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public LocalDate getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(LocalDate deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	

}
