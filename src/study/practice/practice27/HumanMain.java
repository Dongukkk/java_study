package study.practice.practice27;

public class HumanMain {

	public static void main(String[] args) {
		Human h1 = new Human();
		
		h1.name = "김이름";
		h1.gender = "남자";
		h1.age = 25;
		h1.height = 175;
		h1.weight = 75;
		h1.job = "학생";
		h1.bloodType = "A";
		h1.healthState = "건강함";
		h1.isSleeping = true;
		
//		System.out.println("이름 : " + h1.name);
//		System.out.println("성별 : " + h1.gender);
//		System.out.println("나이 : " + h1.age);
//		System.out.println("키 : " + h1.height);
//		System.out.println("몸무게 : " + h1.weight);
//		System.out.println("직업 : " + h1.job);
//		System.out.println("혈액형 : " + h1.bloodType);
//		System.out.println("건강상태 : " + h1.healthState);
//		System.out.println("수면중여부 : " + h1.isSleeping);
//		System.out.println("수면중여부 : " + (h1.isSleeping ? "자는중" : "안자는중"));
//		System.out.println();
		
		h1.printPersonInfo();
		
		Human h2 = new Human("이름이", "여자", 29, 162, 62, "학생", "O", "건강함", false);
		h2.weight = 55;
		
//		System.out.println("이름 : " + h2.name);
//		System.out.println("성별 : " + h2.gender);
//		System.out.println("나이 : " + h2.age);
//		System.out.println("키 : " + h2.height);
//		System.out.println("몸무게 : " + h2.weight);
//		System.out.println("직업 : " + h2.job);
//		System.out.println("혈액형 : " + h2.bloodType);
//		System.out.println("건강상태 : " + h2.healthState);
//		System.out.println("수면중여부 : " + h2.isSleeping);
//		System.out.println("수면중여부 : " + (h2.isSleeping ? "자는중" : "안자는중"));
//		System.out.println();
		
		h2.printPersonInfo();
		
		
		Human h3 = new Human();
		h3.printPersonInfo();
	}

}
