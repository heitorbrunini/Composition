package entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class order {
	private OrderStatus status;
	private Date data;
	private Client client;
	private List<OrderItem> orderitem = new ArrayList<>();

	
	public order(OrderStatus status, Date data, Client client) {

		this.status = status;
		this.data = data;
		this.client = client;
	}

	public void addItem(OrderItem item) {
		orderitem.add(item);		
	}
	
	public void RemoveItem(OrderItem item) {
		orderitem.remove(item);		
	}
	
	public Double total() {
		double tot=0;
		for (OrderItem item : orderitem) {
			tot+=item.subTotal();
		}
		return tot;
	}
	
	public String toString() {
		String dataFormat = new SimpleDateFormat("dd/MM/yyyy").format(client.getData()) ;
		
		StringBuilder sb = new StringBuilder();
		sb.append("ORDER SUMMARY:\n");
		sb.append("Order moment: " + data +"\n");
		sb.append("Order status: " + status +"\n");
		sb.append("Client: "
		+ client.getName() +" ("
		+ dataFormat  +") " +"-" +" " 
		+ client.getEmail() +"\n" );
		sb.append("Order Items: " + "\n");
		for (OrderItem item : orderitem) {
			Product product = item.getProduct();
			sb.append(
					product.getName() +
					", $" + product.getPrice()  +
					" Quantity: "+item.getQuantity()+
					" Subtotal: $"+item.subTotal()
					+"\n"
					);
			
		}
		return sb.toString();		
	}

}
