package study.practice.practice56;

import java.util.List;

public class ReceiptDTO {

	int id;
	String name;
	List<ContactsDTO> contactList;
	
	String street;
	String city;
	String zipcode;
	
	List<OrdersDTO> ordersList;

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

	public List<ContactsDTO> getContactList() {
		return contactList;
	}

	public void setContactList(List<ContactsDTO> contactList) {
		this.contactList = contactList;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public List<OrdersDTO> getOrderList() {
		return ordersList;
	}

	public void setOrderList(List<OrdersDTO> orderList) {
		this.ordersList = orderList;
	}

	@Override
	public String toString() {
		return "RecieptDTO [id=" + id + ", name=" + name + ", contactList=" + contactList + ", street=" + street
				+ ", city=" + city + ", zipcode=" + zipcode + ", ordersList=" + ordersList + "]";
	}
	
	
}
