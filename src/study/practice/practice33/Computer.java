package study.practice.practice33;

public class Computer {
	//4.
//	다음을 만족하는 클래스 Computer를 작성하시오.
//	· 다음을 상수 필드로 선언
//	public … String[] osType = {"윈도우10", "애플 OS X", "안드로이드"};
//	· 다음과 같은 클래스 Computer의 객체의 사용 결과에 적합하도록 생성
//	자와 메소드 구현
//	Computer pc = new Computer(0, 16);
//	Computer apple = new Computer(1, 32);
//	Computer galaxy = new Computer(2, 16);
//	pc.print();
//	apple.print();
//	galaxy.print();
//	운영체제: 윈도우10, 메인메모리: 16
//	운영체제: 애플 OS X, 메인메모리: 32
//	운영체제: 안드로이드, 메인메모리: 16
	public final String[] osType = {"윈도우10", "애플 OS X", "안드로이드"};
	public int mainMem;
	public int osTypeNum;
	
	public Computer(int i,int mainMem){
		osTypeNum = i;
		this.mainMem = mainMem;
	}
	public void print() {
		System.out.printf("운영체제: %s, 메인메모리: %d\n",osType[osTypeNum],mainMem);
	}
	
}
