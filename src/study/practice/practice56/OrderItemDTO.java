package study.practice.practice56;

public class OrderItemDTO {

	int id;
	String name;
	int quantity;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "orderItemDTO [id=" + id + ", name=" + name + ", quantity=" + quantity + "]";
	}
	
	
}
