package study.practice;

import java.util.Scanner;

public class Practice25 {

	public static void main(String[] args) {

//		엘리베이터
//
//		스마트 엘리베이터 시스템을 제작하려고 합니다.
//		해당 시스템이 적용되는 빌딩은 100층 짜리 빌딩이며, 사람들을 원하는 층으로 스마트하게 이동시켜 줍니다.
//		해당 시스템은 사람들을 원하는 층으로 스마트하게 데려다 줍니다.
//		(반복문, 조건문, 배열, 메소드를 최대한 사용하시면 됩니다. )
//
//		- 기본 문제
//		1층에서 사람들이 탑승하며, 각자 내릴 층에 버튼을 누릅니다.
//		(2 ~ 100 이외의 수는 입력이 없을 거라고 가정)
//		엘리베이터는 100층까지 올라가는 와중에 탑승 인원을 모두 내려주고 1층으로 내려오며,
//		엘리베이터의 층수가 변경될 때마다 현재 층수를 출력합니다.
//		참고로, 엘리베이터는 10층에서 5층으로 갔다가 11층으로 가지 않습니다. (오로지 한번에 100층까지 쭉)
//
//		+ 탑승 인원을 입력받습니다.
//		+ 탑승 인원 만큼, 사람들이 내릴 층(2층부터 100층까지)를 각각 입력 받습니다.

		Scanner scanner = new Scanner(System.in);
		// 탑승 인원 입력
		System.out.print("탑승 인원 : ");
		int passenger = scanner.nextInt();

		// 승객들이 내릴 층수 기록
		int[] floors = new int[passenger];
		// 내린 승객의 수
		int index = 0;
		// 엘리베이터 방향 : 1 상승 -1하강
		int dir = 1;

		System.out.print("내릴 층 입력 : ");
		for (int i = 0; i < passenger; i++) {
			floors[i] = scanner.nextInt();
		}

		int floor = 1;
		while (true) { // 모든 승객이 내릴 때까지 엘리베이터 운행
			System.out.printf("%d층 ", floor);
			// 정해진 층에 승객이 내린 경우
			if (index < passenger) {
				for (int i = 0; i < passenger; i++) { // 내릴 사람이 있는지 탐색
					if (floor == floors[i]) { // 있으면
						System.out.print("(하차)");
						index++; // 내린 승객의 수 (+1)
					}
				}
			}
			System.out.println();

			// 모든 승객을 내린 후 정지
//			if (index == passenger && floor == 1)
//				break;

			// 모든 승객을 내린 후 하강, 1층에서 정지
			if (index == passenger) {
				if (floor <= 1)
					break;
				else {

					dir = -1;
				}
			}

			// 100층 이후 하강
			if (floor >= 101) {
				dir = -1;
			} else if (floor < 1) { // 1층 도달시 다시 상승
				dir = 1;
			}

			floor = floor + dir;
		}

	}

	public static void basicV1() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("탑승 인원 수 입력 : ");
		int personCount = scanner.nextInt();

		int[] destFloorArr = new int[personCount];

		System.out.print("목적지 층수 입력(2~100) : ");
		for (int i = 0; i < destFloorArr.length; i++) {
			destFloorArr[i] = scanner.nextInt();
			// 입력한 값이 2~100 이 아니면? -> 다시 입력해라
		}

		// 1층 ~ 100층 -> 목적지 층수에 멈추기

		// v1 : 100층까지 올라가서 내려오기

		for (int i = 1; i <= 100; i++) {
			System.out.println(i + "층");

			// 내리는 층인지 확인
			for (int j = 0; j < destFloorArr.length; j++) {
				if (i == destFloorArr[j]) {
					System.out.println("****도착****");
				}
			}
		}

		// 100층 ~ 1층

		for (int i = 100; i <= 1; i--) {
			System.out.println(i + "층");
		}

	}

	public static void basicV2() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("탑승 인원 수 입력 : ");
		int personCount = scanner.nextInt();

		int[] destFloorArr = new int[personCount];

		System.out.print("목적지 층수 입력(2~100) : ");
		for (int i = 0; i < destFloorArr.length; i++) {
			destFloorArr[i] = scanner.nextInt();
			// 입력한 값이 2~100 이 아니면? -> 다시 입력해라
		}

		// 1층 ~ 100층 -> 목적지 층수에 멈추기

		// v2 : 입력층 중에서 최대층까지만 가고 내려오기

		int maxFloor = destFloorArr[0];
		for (int i = 0; i < destFloorArr.length; i++) {
			if (maxFloor < destFloorArr[i])
				maxFloor = destFloorArr[i];
		}

		System.out.println("====올라갑니다====");
		for (int i = 1; i <= maxFloor; i++) {
			System.out.println(i + "층");

			// 내리는 층인지 확인
			for (int j = 0; j < destFloorArr.length; j++) {
				if (i == destFloorArr[j]) {
					System.out.println("****도착****");
				}
			}
		}

		// 100층 ~ 1층

		System.out.println("====내려갑니다====");
		for (int i = maxFloor; i <= 1; i--) {
			System.out.println(i + "층");
		}
	}

	public static void basicV3() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("탑승 인원 수 입력 : ");
		int personCount = scanner.nextInt();

		int[] destFloorArr = new int[personCount];

		System.out.print("목적지 층수 입력(2~100) : ");
		for (int i = 0; i < destFloorArr.length; i++) {
			destFloorArr[i] = scanner.nextInt();
			// 입력한 값이 2~100 이 아니면? -> 다시 입력해라
		}

		// 1층 ~ 100층 -> 목적지 층수에 멈추기

		// v3 : 반복문으로 입력층 중에서 최대층까지만 가고 내려오기

		int maxFloor = destFloorArr[0];
		for (int i = 0; i < destFloorArr.length; i++) {
			if (maxFloor < destFloorArr[i])
				maxFloor = destFloorArr[i];
		}

		/*
		 * int floor = 1; boolean isUp = true; //isUp true 올라가는 중 false 내려가는 중 // flag
		 * while(true) {
		 * 
		 * System.out.println(floor + "층");
		 * 
		 * // 100층까지 다 올라갔으면? 내려가는 방향으로 설정 if(floor >= 100) isUp=false;
		 * 
		 * if(floor <= 1 && isUp == false) break;
		 * 
		 * // isUp 값에 의해 +1 -1 결정 if(isUp) floor++; else floor--;
		 * 
		 * // if(floor <= 0) // break; }
		 */

		int floor = 1;
		int flow = 1; // flow 1 올라가는 중 -1 내려가는 중
		// flag
		while (true) {

			System.out.println(floor + "층");

			if (flow == 1) {
				// 내리는 층인지 확인
				for (int j = 0; j < destFloorArr.length; j++) {
					if (floor == destFloorArr[j]) {
						System.out.println("****도착****");
					}
				}
			}
			// 100층까지 다 올라갔으면? 내려가는 방향으로 설정
			//if (floor >= 100)
			if(floor >= maxFloor)	
				flow = -1;

			if (floor <= 1 && flow == -1)
				break;

			floor += flow;
		}

	}
}
