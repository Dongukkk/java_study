package study.practice;

import java.util.Scanner;

public class Practice20 {

	public static void main(String[] args) {

		//prac1();
		//prac2();
		//prac3();
		prac4();
	}

	public static void prac1() {
//		1.
//		2x + 4y = 10 이 만족하는
//		모든 x, y 쌍을 구하시오.
//		(x와 y는 자연수 1~10)
//
		for (int x = 1; x <= 10; x++) {
			for (int y = 1; y <= 10; y++) {
				if (2 * x + 4 * y == 10) {
					System.out.println("x : " + x + " y : " + y);
				}
			}
		}
	}

	public static void prac2() {
//		2.
//		정수 2개를 입력 받아서,
//		아래 계산 결과를 출력하시오.
//		큰수 - 작은수
//
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 2개 입력 : ");
		
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		
		if(num1 >= num2) {
			System.out.println("큰수 - 작은수 : " + (num1-num2));
		} else {
			System.out.println("큰수 - 작은수 : " + (num2-num1));
		}
	}

	public static void prac3() {
//		3.
//		윷놀이 게임
//		4개의 윷을 입력받고 결과를 출력하시오.
//		(뒷도는 없습니다!)
//		0 : 안 뒤집어진 상태
//		1 : 뒤집어진 상태
//		ex) 입력 0 0 1 0
//		결과 도
//		입력 0 1 0 1
//		결과 개
//
		Scanner scanner = new Scanner(System.in);
		System.out.print("4개의 윷 입력 : ");
		
		int[] numArr = new int[4];
		int total = 0;
		
		for(int i=0;i<4;i++) {
			numArr[i] = scanner.nextInt();
		}
		for(int i=0;i<4;i++) {
			total = total + numArr[i];
		}
		
		switch(total) {
		case 0:
			System.out.println("결과 모");
			break;
		case 1:
			System.out.println("결과 도");
			break;
		case 2:
			System.out.println("결과 개");
			break;
		case 3:
			System.out.println("결과 걸");
			break;
		case 4:
			System.out.println("결과 윷");
			break;
		}
		
	}

	public static void prac4() {
//		4. 입력받은 수 만큼 별 출력하기
//		ex) 4
//		****
//		5
//		*****
		Scanner scanner = new Scanner(System.in);
		System.out.print("별의 개수 입력 : ");
		int num = scanner.nextInt();
		for(int i=0; i<num;i++) {
			System.out.print("*");
		}
		System.out.println();
	}
}

