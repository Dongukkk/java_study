package term_exam.exam1;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		//basic();
		//level1();
		//level2();
		level3();
	}

	public static void basic() {
//		야구 게임 (스크린 야구, 공격만)
//
//		스크린 야구 게임을 제작하려고 합니다.
//		해당 게임은 항상 공격만 하는 게임으로, 투수가 공을 던지는 것을 치기만 하면 됩니다.
//		투수의 공은 컴퓨터이며, 타자는 사용자 입니다.
//		(반복문, 조건문, 배열을 최대한 사용하시면 됩니다.)
//
//		- 기본 문제
//		투수가 매번 던지는 공은 1 ~ 10의 난수로 설정합니다.
//		사용자의 입력도 1 ~10까지 이며,
//		투수의 공과 사용자의 입력과 동일하면 안타로, 동일하지 않으면 아웃으로 간주합니다.
//		해당 게임은 3아웃이면 종료됩니다.

		Scanner scanner = new Scanner(System.in);

		int outCount = 0;
		while (true) {
			int pitcher = (int) (Math.random() * 10) + 1;

			System.out.print("랜덤 숫자(1~10) 입력 : ");
			int batter = scanner.nextInt();

			System.out.println("투수 : " + pitcher);

			if (pitcher == batter) {	// 투수와 사용자의 입력이 같다면 안타
				System.out.println("안타!!");
			} else {					// 다르면 아웃
				System.out.println("아웃");
				outCount += 1;
			}

			if (outCount == 3) {
				System.out.println("==========");
				System.out.println("3아웃 종료");
				System.out.println("==========");
				break;
			}
		}
	}

	public static void level1() {

//		-레벨 1
//		1회부터 3회까지만 진행합니다.
//		각 회는 3아웃마다 회가 넘어가며, 회가 시작할 때마다 0아웃으로 시작합니다.

		Scanner scanner = new Scanner(System.in);

		int outCount = 0;

		for (int i = 1; i <= 3; i++) {	//1회부터 3회까지 진행
			outCount = 0;				//아웃카운트 0으로 초기화
			System.out.println(i + "회 시작");
			while (true) {
				int pitcher = (int) (Math.random() * 10) + 1;

				System.out.print("랜덤 숫자(1~10) 입력 : ");
				int batter = scanner.nextInt();

				System.out.println("투수 : " + pitcher);

				if (pitcher == batter) {
					System.out.println("안타!!");
				} else {
					System.out.println("아웃");
					outCount += 1;
				}

				if (outCount == 3) {
					System.out.println("==========");
					System.out.println("3아웃 종료");
					System.out.println("==========");
					break;
				}
			}
		}
	}
	
	public static void level2() {
//		-레벨 2
//		9명의 타자를 등록합니다.
//		각 타자가 타격하기 위해 타석에 등장시, 타순 및 타자명이 출력됩니다.
//		9번 타자 다음 순서는 1번 타자로 9명이 로테이션 됩니다.
//		
//		1회차가 끝나는 기준이 3아웃입니다.
//		타자는 1아웃이면 다음 선수로 넘어갑니다.
//		타자가 안타를 쳐도, 출루 했다고 가정하고 다음 선수로 넘어갑니다.
	
		Scanner scanner = new Scanner(System.in);
		
		String[] batterArr = {"a","b","c","d","e","f","g","h","i"};	//9명의 타자 등록
		
		int outCount = 0;
		int batterIndex = 0;	//각 타자를 호출할 인덱스(타순)

		for (int i = 1; i <= 3; i++) {	//1회부터 3회까지 진행
			outCount = 0;				//아웃카운트 0으로 초기화
			System.out.println(i + "회 시작");
			while (true) {
				int pitcher = (int) (Math.random() * 10) + 1;

				System.out.printf("타석 : %d번 타자 %s\n",batterIndex+1,batterArr[batterIndex]);
				System.out.print("랜덤 숫자(1~10) 입력 : ");
				int batter = scanner.nextInt();

				System.out.println("투수 : " + pitcher);

				if (pitcher == batter) {
					System.out.println("안타!!");
				} else {
					System.out.println("아웃");
					outCount += 1;
				}
				batterIndex++;	//다음 타순으로
				if(batterIndex>=9)		//9번 이후는 다시 1번 타자로
					batterIndex=0;
				
				if (outCount == 3) {
					System.out.println("==========");
					System.out.println("3아웃 종료");
					System.out.println("==========");
					break;
				}
				
			}
		}
		
	}
	
	public static void level3() {
//		-레벨 3
//		각 타자의 전체 타석 및 안타수를 기록합니다.
//		타석에 등장시, 타순 및 타자명 뿐만 아니라 타율도 출력됩니다. (타율 = 안타수 / 타석수)
//		참고로, 첫 타석의 타율은 0입니다.
//		
//		*한번 휘두를때를 기준으로 타석수가 증가합니다
//		현재는 안타, 아웃뿐이지만, 이후 스타라이크, 볼 등에 대해서 타석수는 증가합니다.
		
		Scanner scanner = new Scanner(System.in);
		
		String[] batterArr = {"a","b","c","d","e","f","g","h","i"};	//9명의 타자 등록
		int[] onHit = new int[9];				//9 타자 안타수 저장
		int[] onBat = new int[9];				//9 타자 타석수 저장
		double[] hitRateArr = new double[9];	//9 타자 타율 저장
		
		int outCount = 0;
		int batterIndex = 0;	//각 타자를 호출할 인덱스(타순)

		for (int i = 1; i <= 3; i++) {	//1회부터 3회까지 진행
			outCount = 0;				//아웃카운트 0으로 초기화
			System.out.println("-------" + i + "회 시작-------");
			while (true) {
				int pitcher = (int) (Math.random() * 10) + 1;
				// n번 타자 이름 출력
				System.out.printf("타석 : %d번 타자 %s\n",batterIndex+1,batterArr[batterIndex]);
				// 타자 타율 출력
				System.out.printf("타율 : %.3f\n",hitRateArr[batterIndex]);
				System.out.print("랜덤 숫자(1~10) 입력 : ");
				int batter = scanner.nextInt();
				
				onBat[batterIndex] += 1; 	//타석수 +1
				
				System.out.println("투수 : " + pitcher);

				if (pitcher == batter) {
					System.out.println("=> 안타!!");
					onHit[batterIndex] += 1; 	//안타수 +1
				} else {
					System.out.println("=> 아웃");
					outCount += 1;
				}
				// 타율 계산
				hitRateArr[batterIndex] = ((double)(onHit[batterIndex]))/onBat[batterIndex];
				batterIndex++;	//다음 타순으로
				
				if(batterIndex>=9)		//9번 이후는 다시 1번 타자로
					batterIndex=0;
				
				if (outCount == 3) {	//3아웃시 다음 회차로
					System.out.println("==========");
					System.out.println("3아웃 종료");
					System.out.println("==========");
					break;
				}
				
			}
		}
		
	}
}
