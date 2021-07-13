package entidades;

public class OrderItem {
	private Integer quantity;
	private Product product;
	
	
	public Double subTotal() {
		Double price = product.getPrice();
		Double total = price * quantity;
		return total;
	}

	public OrderItem(Integer quantity, Product product) {
		this.quantity = quantity;
		this.product = product;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}


}
