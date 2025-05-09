package study.inherit.inherit03;


//모든 자바 클래스(객체)는 Object 클래스를 상속받는다
public class Mike {
			// extends Object
	
	String model;
	int price;
	String type;	//마이크 유형
	
	public void volumeUp() {
		System.out.println("Mike volumeUp");
	}
	public void check() {
		System.out.println("Mike 기능 check");
	}
	
}
