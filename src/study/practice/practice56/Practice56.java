package study.practice.practice56;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Practice56 {

	public static void main(String[] args) {
		
//		OrderDTO orderDTO = null;
		
		ReceiptDTO receiptDTO = null;
		ContactsDTO contactDTO = null;
		OrdersDTO ordersDTO = null;
		OrderItemDTO orderItemDTO = null; 
		
		try {
			
			//String jsonText = requestApi_getMinuDustWeek();
			String jsonText = "\r\n"
					+ "{\r\n"
					+ "\"id\": 1,\r\n"
					+ "\"name\": \"John Doe\",\r\n"
					+ "\"contacts\": [\r\n"
					+ "{\r\n"
					+ "\"type\": \"email\",\r\n"
					+ "\"value\": \"john.doe@example.com\"\r\n"
					+ "},\r\n"
					+ "{\r\n"
					+ "\"type\": \"phone\",\r\n"
					+ "\"value\": \"01023456789\"\r\n"
					+ "}\r\n"
					+ "],\r\n"
					+ "\"address\": {\r\n"
					+ "\"street\": \"123 Main Street\",\r\n"
					+ "\"city\": \"Seoul\",\r\n"
					+ "\"zipcode\": \"12345\"\r\n"
					+ "},\r\n"
					+ "\"orders\": [\r\n"
					+ "{\r\n"
					+ "\"orderId\": \"ORD-001\",\r\n"
					+ "\"date\": \"2024-07-09\",\r\n"
					+ "\"items\": [\r\n"
					+ "{\r\n"
					+ "\"id\": 1,\r\n"
					+ "\"name\": \"Smartphone\",\r\n"
					+ "\"quantity\": 2\r\n"
					+ "},\r\n"
					+ "{\r\n"
					+ "\"id\": 2,\r\n"
					+ "\"name\": \"Laptop\",\r\n"
					+ "\"quantity\": 1\r\n"
					+ "}\r\n"
					+ "]\r\n"
					+ "},\r\n"
					+ "{\r\n"
					+ "\"orderId\": \"ORD-002\",\r\n"
					+ "\"date\": \"2024-07-10\",\r\n"
					+ "\"items\": [\r\n"
					+ "{\r\n"
					+ "\"id\": 3,\r\n"
					+ "\"name\": \"Headphones\",\r\n"
					+ "\"quantity\": 1\r\n"
					+ "}\r\n"
					+ "]\r\n"
					+ "}\r\n"
					+ "]\r\n"
					+ "}";
			// 파싱
			JSONParser jsonParser = new JSONParser();
			JSONObject jsonObj = (JSONObject)jsonParser.parse(jsonText);
			JSONArray contacts = (JSONArray)jsonObj.get("contacts");
			
			JSONObject address = (JSONObject)jsonObj.get("address");

			JSONArray orders = (JSONArray)jsonObj.get("orders");
			
			
			
			// DTO 옮겨담고
			receiptDTO = new ReceiptDTO();
			receiptDTO.setId(objectToInt(jsonObj.get("id")));
			receiptDTO.setName(valueToString(jsonObj.get("name")));
			List<ContactsDTO> conList = new ArrayList<ContactsDTO>();
			for(int i=0; i<contacts.size(); i++) {
				contactDTO = new ContactsDTO();
				JSONObject contact = (JSONObject)contacts.get(i);
				contactDTO.setType(valueToString(contact.get("type")));
				contactDTO.setValue(valueToString(contact.get("value")));
				conList.add(contactDTO);
			}
			receiptDTO.setContactList(conList);
			receiptDTO.setStreet(valueToString(address.get("street")));
			receiptDTO.setCity(valueToString(address.get("city")));
			receiptDTO.setZipcode(valueToString(address.get("zipcode")));
			
			List<OrdersDTO> orderList = new ArrayList<OrdersDTO>();
			for(int i=0; i<orders.size(); i++) {
				ordersDTO = new OrdersDTO();
				JSONObject order = (JSONObject)orders.get(i);
				ordersDTO.setOrderId(valueToString(order.get("orderId")));
				ordersDTO.setDate(valueToString(order.get("date")));
				JSONArray items = (JSONArray)order.get("items");
				List<OrderItemDTO> orderItemList = new ArrayList<OrderItemDTO>();
				for(int j=0; j<items.size(); j++) {
					orderItemDTO = new OrderItemDTO();
					JSONObject item = (JSONObject)items.get(j);
					orderItemDTO.setId(objectToInt(item.get("id")));
					orderItemDTO.setName(valueToString(item.get("name")));
					orderItemDTO.setQuantity(objectToInt(item.get("quantity")));
					orderItemList.add(orderItemDTO);
				}
				ordersDTO.setItemList(orderItemList);
				orderList.add(ordersDTO);
			}
			receiptDTO.setOrderList(orderList);
			
			System.out.println(receiptDTO);
			
//			orderDTO = new OrderDTO();
//			orderDTO.setName(valueToString(jsonObj.get("name")));
//			
//			orderDTO.setEmail(email);
//			orderDTO.setPhone(phone);
//			orderDTO.setStreet(valueToString(address.get("street")));
//			orderDTO.setCity(valueToString(address.get("city")));
//			orderDTO.setZipcode(valueToString(address.get("zipcode")));
//			
//			orderDTO.setOrderId(valueToString(order.get("orderId")));
//			orderDTO.setDate(valueToString(order.get("date")));
//			orderDTO.setItem(valueToString(item.get("name")));
//			orderDTO.setQuantity(valueToString(item.get("quantity")));
//			
//			System.out.println(orderDTO);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		

	}
	public static int objectToInt(Object obj) {
		return Integer.parseInt(obj.toString());
	}
	
	public static String valueToString(Object obj) {
		if(obj == null)
			//return "";
			return null;
		else
			return obj.toString();
	}

}
