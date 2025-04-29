package study.practice.practice27;

public class Human {
	
	//필드
	String name;
	String gender;
	int age;
	int height;	//--> double
	int weight;	//--> double
	String job;
	String bloodType;
	String healthState;
	boolean isSleeping;
	
	//생성자
	//생성자 선언하지 않으면? 기본생성자 자동 생성
	Human() {
		name = null;
		gender = "남자";		//초기화 값
		age = 0;
		height = 0;
		weight = 0;
		job = "무직";			//null 직업무
		bloodType = null;
		healthState = "건강함";	//초기화 값
		isSleeping = false;
	}
	
	Human (String name, String gender, int age, int height, int weight, String job, String bloodType, String healthState, boolean isSleeping) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.job = job;
		this.bloodType = bloodType;
		this.healthState = healthState;
		this.isSleeping = isSleeping;
	}	
	
	//메소드
	void printPersonInfo() {
		System.out.println("이름 : " + this.name);
		System.out.println("성별 : " + this.gender);
		System.out.println("나이 : " + this.age);
		System.out.println("키 : " + this.height);
		System.out.println("몸무게 : " + this.weight);
		System.out.println("직업 : " + this.job);
		System.out.println("혈액형 : " + this.bloodType);
		System.out.println("건강상태 : " + this.healthState);
		System.out.println("수면중여부 : " + this.isSleeping);
		System.out.println("수면중여부 : " + (this.isSleeping ? "자는중" : "안자는중"));
		System.out.println();
	}
}
