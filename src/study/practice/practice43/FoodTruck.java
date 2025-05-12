package study.practice.practice43;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FoodTruck {
	
	String truckBrandName;
	String owner;
	List<Food> foodList;	//판매하는 음식 리스트
	
	int totalSales;	//총 매출액
	boolean isOpened;	// 영업중 여부 true 열었다
	
	//일자별 매출이력 관리용 리스트
	List<SalesInfo> salesInfoList;
	
	public FoodTruck() {
		totalSales = 0;
		isOpened = false;
		foodList = new ArrayList<Food>();
		salesInfoList = new ArrayList<SalesInfo>();
	}
	
	public FoodTruck(String truckBrandName, String owner) {
		this.truckBrandName = truckBrandName;
		this.owner = owner;
		totalSales = 0;
		isOpened = false;
		foodList = new ArrayList<Food>();
		salesInfoList = new ArrayList<SalesInfo>();
	}
	
	public void addMenu(Food food) {
		foodList.add(food);
	}
	
	public void addMenu(String name, int price) {
//		Food food = new Food(name,price);
//		foodList.add(food);
		foodList.add(new Food(name, price));
	}
	
	
	public void doSales() {	//푸드트럭 장사 메소드
		
		//전체 실행 로직 조율
		
		Scanner scanner = new Scanner(System.in);
		isOpened = true;	//영업중 표시
		
		System.out.printf("===[%s %s 푸드트럭 영업시작]===\n", owner, truckBrandName);
		
		while(isOpened) {
			
			int menu = getMainMenu();
			
			switch(menu) {		
			case 1:		//메뉴보기				
				showFoodList();	//보유하고 있는 음식 리스트 메뉴로 보여주기
				break;
			case 2:		//주문하기
				orderMenu();
				break;
			case 3:		//재고관리
				manageStock();
				break;
			case 4:		//마감하기
				finishSales();
				break;
			
			}
			
		}
	}
	
	//메인메뉴 번호선택 처리
	public int getMainMenu() {
		
		//1~4 번 정상 메뉴 입력 시에만 진행
		
		Scanner scanner = new Scanner(System.in);
		int menu = 0;
		while(true) {
			
			//시스템 메뉴
			System.out.println();
			System.out.println("[메뉴선택]");
			System.out.println("1.메뉴보기 2.주문하기 3.재고관리 4.마감하기");
			System.out.print(">>> 입력 : ");
			menu = scanner.nextInt();
			
			if(menu >=1 && menu <=4) {
				break;
			} else {
				System.out.println("잘못 입력");
			}
		
		}
		return menu;
	}
	
	
	//메뉴 보여주기 메소드
	public void showFoodList() {
		System.out.println("[---재고관리자---]");
		System.out.println("[---메뉴리스트---]");
		
		for(int i=0; i<foodList.size(); i++) {
			System.out.println((i+1) + "." + foodList.get(i).getFoodInfo());
		}
	}
	
	//주문하기 기능 메소드
	public void orderMenu() {
		
		showFoodList();
		Scanner scanner = new Scanner(System.in);
		System.out.print(">>> 주문 메뉴를 선택 : ");
		int order = scanner.nextInt();
		
		//order 메뉴 범위안에 있는가?
		Food orderFood = foodList.get(order-1);
		
		//재고가 없으면 주문 불가
		if(orderFood.stock < 1) {
			System.out.println("> 해당 메뉴는 품절입니다.");
			return;
		}

		//주문하면 메뉴 금액만큼 매출 증가
		totalSales += orderFood.price;
		
		//주문 개수 만큼 재고 감소
		orderFood.modifyStock(-1); 	//재고 -1 조절
		System.out.println(">>> 주문완료 : "+ orderFood.name);
	}
	
	public void manageStock() {
		System.out.println("[---재고관리자---]");
		
		showFoodList();
		Scanner scanner = new Scanner(System.in);
		System.out.print(">>> 재고 관리할 메뉴를 선택 : ");
		int order = scanner.nextInt();
		
		System.out.print(">>> 재고 조정할 개수를 입력 : ");
		int changeStockCount = scanner.nextInt();
		
		Food stockFood = foodList.get(order-1);
		stockFood.modifyStock(changeStockCount);
		
		// modifyStock이 아니라, 증가/감소 메소드를 각각 나누어 구현한 상태라면?
		// if(changeStockCount > 0) -> 증가 메소드
		// if(changeStockCount < 0) -> 감소 메소드
		
		System.out.println(">>> 재고 조정 완료");
		System.out.println(stockFood.getFoodInfo());
		System.out.println("[---------------------]");
		
	}
	
	//마감 /종료
	public void finishSales() {
		
		int lossSales = 0; //폐기 손해금액
		for(Food food : foodList) {
			lossSales += (food.price*0.3) * food.stock;
		}
		
		System.out.println("===[마감 정산 내역]===");
		System.out.println(">> 총 매출액 : " + totalSales);
		System.out.println(">> 폐기 손해 : " + lossSales);
		System.out.println(">> 최종 수익 : " + (totalSales - lossSales) );
		
		SalesInfo si = new SalesInfo();
		si.totalSales = totalSales;
		si.lossSales = lossSales;
		si.income = (totalSales - lossSales);
		
		salesInfoList.add(si);
		
		isOpened = false;
		System.out.printf("===[%s %s 푸드트럭 영업종료]===\n", owner, truckBrandName);
	}
}
















