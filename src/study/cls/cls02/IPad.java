package study.cls.cls02;

public class IPad {
	String owner;	//주인 소유자
	static String brand = "Apple";	//어디회사 브랜드
	
	void powerOn() {
		System.out.println("아이패드 전원 켜짐");
		System.out.println(owner + "의 아이패드~");
		this.owner = "주인이름";
		
//		System.out.println(brand + "에서 만든 아이패드");
//		check();
	}
	
	static void check() {
		System.out.println(brand + "에서 만든 아이패드");
		//this.owner = "소유주";	static은 주체 기준이 없이 호출 -> this 특정 주체를 나타낼 수 없다.
		//System.out.println(owner + "의 아이패드~");	//static -> 인스턴스 접근 X
		//System.out.println(IPad.brand + "에서 만든 아이패드");
		//powerOn();
	}
}


