package study.cls.cls01;

public class Car {

	//필드 (속성)
	String model;
	String color;
	int price;
	
	
	//기본 생성자
	//생성자를 작성하지 않아도, 자동으로 만들어지는 생성자
//	Car() {
//		
//	}
	Car() {
		System.out.println("Car() 생성자 호출됨");
		color = "회색";
	}
	
	//매개변수가 존재하는 생성자
	Car(String c){
		System.out.println("Car(String c) 생성자 호출됨");
		color = c;
	}
	
	//String c = "파랑" int p = 1000000
	Car(String c, int p){
		System.out.println("Car(String c, int p) 생성자 호출됨");
		color = c;
		price = p;
	}
	
	Car(String model, String color, int price){
		System.out.println("Car(String model, String color, int price) 생성자 호출됨");
		this.model = model;
		this.color = color;
		this.price = price;
	}
	
	/*
	Car(String _model, String _color, int _price){
		System.out.println("Car(String _model, String _color, int _price) 생성자 호출됨");
		model = _model;
		color = _color;
		price = _price;
	}
	*/
	//메소드
}
