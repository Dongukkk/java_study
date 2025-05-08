package study.inherit.inherit03;

public class BluetoothMike extends Mike {
	boolean isConnect;
	
	public void connect() {
		System.out.println("블루투스 연결");
	}
	
	//메소드 재정의 (오버라이딩)
	public void volumeUp() {
		System.out.println("BluetoothMike volumeUp");
	}
	
	//메소드 추가로 정의 (오버로딩)
	public void volumeUp(int num) {
		System.out.println(num + "만큼 volumeUp");
	}
	
	public void check() {
		System.out.println("기능 확인");
	}
}
