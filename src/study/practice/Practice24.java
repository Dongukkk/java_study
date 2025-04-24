package study.practice;

import java.util.Random;
import java.util.Scanner;

public class Practice24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// prac1();
		//prac2v1();
		//prac2v2();
		// prac3();
		prac4();

	}

	public static void prac1() {
//		1.
//		두 개의 주사위를 던졌을 때, 두 눈의 합이 6이 되는
//		모든 경우의 수를 출력하는 프로그램을 작성하시오.

		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				if (i + j == 6) {
					System.out.printf("%d %d\n", i, j);
				}
			}
		}
	}

	public static void prac2v1() {
//		2.
//		로또 번호 6개 랜덤하게 생성하기. ( 1~45 중 )
//		최종 6개의 번호는 6칸의 배열에 저장되어야 한다.
//		로또 번호는 동일한 번호가 중복되어 들어갈 수 없다.
//		1) Math.random() 활용
//		2) int[] lotto = new int[6]; 활용
//		
		// 랜덤값 생성

		// Random random = new Random();
		// System.out.println(random.nextInt(5)); // 0 1 2 3 4
		// System.out.println(random.nextInt(1, 5)); // 1 2 3 4 1<=랜덤값<5 jdk17~

		// System.out.println(Math.random());

		// 방법 1.
		int[] lotto = new int[6];

		int num;
		int index = 0;

		while (true) {
			num = (int) (45 * Math.random()) + 1;

			boolean isDuplicated = false; // 중복이냐? true -> 중복O false -> 중복X

			for (int i = 0; i < index; i++) {
				if (lotto[i] == num) {

					// true 실행 -> 중복된 값이 있다
					// 기록
					isDuplicated = true;
					break;
				}
			}
			// 1 2 5 6 7
			/*
			 * if(isDuplicated) { //중복이면 pass
			 * 
			 * } else { //중복 아니면 저장하면서 계속 진행
			 * 
			 * }
			 */

			if (isDuplicated)
				continue;

			// 중복 아닐때 수행할 코드
			lotto[index] = num;
			index++; // 다음칸으로 이동

			// 6개 다 채웠으면 끝
			if (index >= lotto.length)
				break;
		}
		for (int i = 0; i < 6; i++) {
			System.out.print(lotto[i] + " ");
		}
		System.out.println();

	}

	public static void prac2v2() {
		// 방법 2.
		int[] lotto = new int[6];
		for (int i = 0; i < 6; i++) {
			// 랜덤 값(1~45) 부여
			int ranNum = (int) (45 * Math.random()) + 1;
			lotto[i] = ranNum;

			// 중복되는 숫자가 나오면 다시뽑기
			for (int j = 0; j < i; j++) {
				if (lotto[j] == ranNum) {
					i--;
					break;
				}
			}
		}
		// 로또 번호 출력
		for (int i = 0; i < 6; i++) {
			System.out.print(lotto[i] + " ");
		}
		System.out.println();
	}

	public static void prac3() {
//		우리 학원은 3개의 반이 있으며, 한 반에 5명씩 공부하고 있다.
//		반 순서별로 5명의 점수를 입력받아서 저장해서 관리하도록 하며,
//		각 반별 점수의 평균과 전체의 평균을 출력할 수 있도록 코드를 작성하시오.
//		(*가능한 효율적인 구조를 생각해보세요)
//
//		ex)
//		1반 : 10 10 10 10 10
//		2반 : 20 20 20 20 20
//		3반 : 30 30 30 30 30
//
//		1반 평균 : 10
//		2반 평균 : 20
//		3반 평균 : 30
//		전체 평균 : 20

		Scanner scanner = new Scanner(System.in);

		int[][] classScore = new int[3][5];
		double[] classAvg = new double[3];
		double allAvg = 0;

		// 각반 점수 입력
		for (int i = 0; i < classScore.length; i++) {
			System.out.printf("%d반 : ", i + 1);
			for (int j = 0; j < classScore[i].length; j++) {
				classScore[i][j] = scanner.nextInt();
			}
		}
		System.out.println();

		// 각 반별 평균 계산
		for (int i = 0; i < classScore.length; i++) {
			System.out.printf("%d반 평균 : ", i + 1);
			for (int j = 0; j < classScore[i].length; j++) {
				classAvg[i] += classScore[i][j];
			}
			classAvg[i] = classAvg[i] / classScore[i].length;
			System.out.println(classAvg[i]);
			allAvg += classAvg[i];
		}

		// 전체 평균 계산
		allAvg = allAvg / classScore.length;
		System.out.println("전체 평균 : " + allAvg);
	}

	public static void prac4() {
//		4. 주어진 2차원 배열보다 행과 열이 1씩 큰 배열을 선언하여,
//		각 행의 합과 각 열의 합, 마지막에는 전체의 합이 출력되도록 프로그램을 작성하시오.
//
//		ex)
//		int[][] arr =
//		{
//		{10, 20, 30},
//		{20, 30, 40},
//		{30, 40, 50}
//		};
//		이 주어지는 경우 최종 결과는
//		10 20 30 60
//		20 30 40 90
//		30 40 50 120
//		60 90 120 270

		int[][] arr = { { 10, 20, 30 }, { 20, 30, 40 }, { 30, 40, 50 } };
		// 주어진 배열보다 1씩 큰 배열 선언
		int[][] sum = new int[arr.length + 1][arr[0].length + 1];

		// 주어진 배열 복사
		// 각 행과 열의 합 계산 및 입력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				sum[i][j] = arr[i][j];
				sum[i][arr.length] += arr[i][j];
				sum[arr.length][i] += arr[j][i];
				sum[arr.length][arr.length] += arr[i][j];
			}
		}

		// 최종 배열 출력
		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < sum[0].length; j++) {
				System.out.print(sum[i][j] + "	");
			}
			System.out.println();
		}
	}
}
