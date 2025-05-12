package study.practice.practice41;

public class Stove {
	int fire;
	String brand;
	int price;
	boolean[] turnOn = new boolean[fire];
	int[] heatRate = new int[fire];

	Stove(int fire) {
		this.fire = fire;
	}

	void powerSwitch(int n) {
		if (n <= fire) {
			turnOn[n] = !turnOn[n];
			if (turnOn[n]) {
				System.out.println(n + "번째 화구 power On");
				heatRate[n] = 10;
			} else {
				System.out.println(n + "번째 화구 power Off");
				heatRate[n] = 0;
			}
		}
	}

	void heatControl(int n, int heat) {
		if (turnOn[n] && n <= fire && heat <= 10) {
			heatRate[n] = heat;
		}
	}
}