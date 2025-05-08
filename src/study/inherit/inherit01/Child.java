package study.inherit.inherit01;

public class Child extends Parent {
	int grade;	//학번
	String school;	//어디학교
		
	//생성자
	//기본생성자
	//public Child(){}
	public Child() {
		//상속받은 부모클래스 생성자
		//super();	부모생성자
		super(0);
		
		//자식에서 해야할 일
		//this(10, "매개변수");	//자기자신의 다른 생성자
	}
	public Child(int money) {
		super(money);
		//this.money = money;
	}
	public Child(int grade, String school) {
		super(0);
		this.grade= grade;
		this.school = school;
	}
	public Child(int money, int grade, String school) {
		super(money);
		this.grade= grade;
		this.school = school;
	}
	public void play() {
		System.out.println("아이들 뛰어놀기");
	}
	
	public void printInfo() {
		System.out.println(grade + "학년 " + school +"다님 돈:"+money);
		System.out.println(age + "나이");
	}
	public void say() {
		System.out.println("어린이 하는 말");
	}
//	public void donate() {
//		System.out.println("한달에 10만원 기부");
//	}
}
