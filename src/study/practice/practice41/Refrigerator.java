package study.practice.practice41;

public class Refrigerator {

	String brand;
	int size;
	boolean powerOn;
	int temp;
	int doorCnt;
	
	int maxTemp;	//냉장고 설정가능한 최고 온도
	int minTemp;	//냉장고 설정가능한 최저 온도
	
	IceTray icetray = new IceTray(12);
	
	void tempControl(boolean isUp) {
		if(isUp)
			if(temp<maxTemp)
			temp ++;
		else
			if(temp>minTemp)
			temp--;
		System.out.printf("현재 온도 : %d\n", temp);
	}
	
	void powerSwitch() {
		powerOn = !powerOn;
		System.out.println(powerOn ? "Power On" : "Power Off");
	}
}
