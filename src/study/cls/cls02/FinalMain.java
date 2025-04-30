package study.cls.cls02;

public class FinalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 10;
		
		n = 20;
		n = 30;
		
		//상수화
		final int a = 30;
		//a = 50;
	
		System.out.println(ConstantNumber.TIMEOUT_LIMIT_SECONDS);
		
		int myState = 3;	//1~3
		
		if(myState == 3) {
			System.out.println("건강하다");
		}
		
		myState = ConstantNumber.HEALTH_STATE_GOOD;
		
		if(myState == ConstantNumber.HEALTH_STATE_GOOD) {
			
		}
		
		if(myState == ConstantNumber.HEALTH_STATE_BAD) {
			
		}
	}
	

}
