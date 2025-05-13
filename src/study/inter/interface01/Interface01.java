package study.inter.interface01;

public interface Interface01 {
	
	//필드XX -> 변수 선언 (상수)
	static final int TYPE = 500;
	/* static final */ int CODE = 10;
	
	//붕어빵 속 토핑 종류
	int FISHBREAD_TOPPING_PPAT = 11;
	int FISHBREAD_TOPPING_SUCREAM = 12;
	int FISHBREAD_TOPPING_PIZZA = 13;
	int FISHBREAD_TOPPING_KIMCHI = 14;
	
	//생성자 -> XXX
	
	//메소드 -> 추상 메소드 (선언부분만...)
	
	public abstract void method1();	//추상메소드
	public void method2();	//추상메소드
}
