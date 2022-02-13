package shoppingapp.main;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingAppMain {

	public static void main(String[] args) {
		
		Customer customer =new Customer(1L,"Piyusha",1);
		Product product= new Product(1L,"redmi","Mobile Phone",15999.00);
		Product productOne = new Product(2L,"redmi","Mobile Phone",32000.00);
		List<Product> productList= new ArrayList<>();
		productList.add(product);
		productList.add(productOne);
		
		
		Order order = new Order();
		order.setCustomer(customer);
		order.setDeliveryDate(LocalDate.now());
		order.setOrderId(1L);
		order.setStatus("In Transit");
		order.setProducts(productList);
		
		
		Order orderOne = new Order();
		orderOne.setCustomer(customer);
		orderOne.setDeliveryDate(LocalDate.now());
		orderOne.setOrderId(1L);
		orderOne.setStatus("Out For Delivery");
		orderOne.setProducts(productList);
		
		List<Order> orders= new ArrayList<>();
		orders.add(orderOne);
		orders.add(order);
		
		//String[] allorders=orders.toArray(new String[orders.size()]);
		//System.out.println(Arrays.toString(allorders));
		System.out.println(orders);
		
		List<Order> all=new ArrayList<>();
		all.add((Order) orders);
		System.out.println(all);
		
		
		
		
			
		
		
		

	}

}
