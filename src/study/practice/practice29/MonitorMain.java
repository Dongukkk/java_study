package study.practice.practice29;

public class MonitorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Monitor m1 = new Monitor("삼성", 27, 150000, "검은색");
		m1.setXY(1080, 780);
		
		Monitor m2 = new Monitor("LG", 32, 330000);
		m2.setColor("흰색");
		m2.setXY(4096, 2048);
		
		m1.printInfo();
		m2.printInfo();
		
		m2.raisePrice(70000);
		System.out.println("인상된 가격 : "+m2.price);
		
		m1.printInfo();
		m2.printInfo();
		
	}

}
