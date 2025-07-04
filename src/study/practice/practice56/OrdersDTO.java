package study.practice.practice56;

import java.util.List;

public class OrdersDTO {

	String orderId;
	String date;
	List<OrderItemDTO> itemList;
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public List<OrderItemDTO> getItemList() {
		return itemList;
	}
	public void setItemList(List<OrderItemDTO> itemList) {
		this.itemList = itemList;
	}
	@Override
	public String toString() {
		return "OrdersDTO [orderId=" + orderId + ", date=" + date + ", itemList=" + itemList + "]";
	}
	
	
}
