package study.inherit.inherit01;

public class Parent extends GrandParent {
	//public private default
	//public int money;
	protected int money;	//같은 패키지 + 자식 접근가능한 접근제한자 protected
	
//	public Parent() {
//		System.out.println("Parent() 생성자");
//	}
	
	public Parent(int money) {
		this.money = money;
	}
	
	public void say() {
		System.out.println("부모님 말씀");
	}
	
	public final void donate() {
		System.out.println("한달에 100만원 기부");
	}
	
	private void nightMeal() {
		System.out.println("야식먹기");
	}
}
