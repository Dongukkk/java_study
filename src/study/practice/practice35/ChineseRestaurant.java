package study.practice.practice35;

import java.util.ArrayList;

//Base코드
public class ChineseRestaurant {
	public static void main(String[] args) {
//주문을 위한 메뉴 선정
		Menu jjajang = new Menu("짜장", 4900);
		Menu jjambbong = new Menu("짬뽕", 5900);
		Menu tangsook = new Menu("탕수육", 13900);
//메뉴를 조합하여 주문을 생성
		//Menu[] menuArr = { jjajang, jjambbong, tangsook };
		ArrayList<Menu> menuList = new ArrayList<Menu>();
		menuList.add(jjajang);
		menuList.add(jjambbong);
		menuList.add(tangsook);
		//Order order = new Order(123, menuArr);
		Order order = new Order(123, menuList);
//주문 결과 출력
		System.out.printf("주문 합계: %d원\n", order.totalPrice());
	}
}

class Order {
	// 필드(인스턴스 필드)
	int orderNum;
	//Menu[] menus;
	ArrayList<Menu> menuList;

	// 생성자
//	public Order(int i, Menu[] arr) {
//		orderNum = i;
//		menus = arr;
//	}
	public Order(int i, ArrayList<Menu> menuList) {
		orderNum = i;
		this.menuList = menuList;
	}

	// 메소드(인스턴스 메소드)
//	public int totalPrice() {
//		/* 1. 모든 주문 메뉴의 총합을 반환하세요. */
//		int total=0;
//		for(int i=0;i<menus.length;i++)
//			total+=menus[i].price;
//		return total;
//	}
	public int totalPrice() {
		/* 1. 모든 주문 메뉴의 총합을 반환하세요. */
		int total=0;
//		for(int i=0;i<menus.size();i++)
//			total+=menus.get(i).price;
		for(Menu menu : menuList) {
			total+=menu.price;
		}
		return total;
	}
}

class Menu {
	// 필드
	String name;
	int price;

	// 생성자
	public Menu(String str, int i) {
		name = str;
		price = i;
	}
}