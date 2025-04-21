package study.practice;

import java.util.Scanner;

public class Practice13 {

	public static void main(String[] args) {
		
		prac1();
		prac2();
		prac3();
		prac4();
		prac5();
		prac6();
		prac7();
		
	}

	public static void prac1() {
//		1. 정수를 입력받고 홀수면 "odd"를 출력, 짝수면 "even"을 출력하기.
//
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num1 = scanner.nextInt();
		
		if (num1%2==1) {
			System.out.println("odd");
		} else {
			System.out.println("even");
		}
		
		System.out.println((num1%2==0) ? "even" : "odd");
	}

	public static void prac2() {
//		2. 정수를 입력받고 7의 배수면 "7의 배수입니다" 출력, 아니면 "아닙니다" 출력하기.
//
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num2 = scanner.nextInt();
		
		if (num2%7==0) {
			System.out.println("7의 배수입니다");
		} else {
			System.out.println("아닙니다");
		}
		
		System.out.println((num2%7==0) ? "7의 배수입니다" : "아닙니다");
	}

	public static void prac3() {
//		3. 1~1000 까지의 수 중에서 5의 배수의 합을 출력하기.
//
		int num3=0;
		for (int i=1;i<=1000;i++) {
			if(i%5==0) {
				num3+=i;
			}
		}
		System.out.println("1~100까지 5의 배수의 합 : " + num3);

		num3 = 0;
		for (int i=5; i<1000; i=i+5) {
			num3 = num3 + i;
		}
		System.out.println("1~100까지 5의 배수의 합 : " + num3);
	}

	public static void prac4() {
//		4. 1~50 까지의 수를 입력받아 해당 갯수만큼 *을 출력하기.
//		ex) 입력 : 10
//		결과 : **********
//
		Scanner scanner = new Scanner(System.in);

		System.out.print("1~50 까지의 수 입력 : ");
		int num4 = scanner.nextInt();
		if (num4 >= 1 && num4 <= 50) {
			for (int i = 1; i <= num4; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void prac5() {
//		5. 1~10 까지의 수에서 홀수면 더하기(+), 짝수면 빼기(-)를 수행해서 최종 결과 출력.
//		ex) 1 - 2 + 3 - 4 .....
//
		int num5=0;
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				num5-=i;
			} else {
				num5+=i;
			}
		}
		System.out.println("계산 결과 : " + num5);
	}

	public static void prac6() {
//		6. 정수를 1부터 계속 누적으로 더한다. 이 더한 값이 1000 보다 작으면 계속 더하고
//		1000이 넘어가면 멈춘다. 멈추는 시점까지 누적으로 더해진 값을 출력하기.
//
		int num6 = 0;
		int k = 1;
		while(num6<1000) {
			num6 += k;
			k++;
		}
		System.out.println("1000이 넘는 누적합 : " + num6);
		
		num6 = 0;
		k = 1;
		while(true) {
			num6 += k;
			k++;
			if(num6>=1000) {
				break;
			}
		}
		System.out.println("1000이 넘는 누적합 : " + num6);
		
	}

	public static void prac7() {				
//		7. 입력 받은 수의 구구단 출력 (1~9까지 입력)
//		ex) 입력 3
//		3 * 1 = 3
//		3 * 2 = 6
//		3 * 3 = 9
//		...
//		3 * 9 = 27
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("구구단(1~9) 몇 단? : ");
		int num7 = scanner.nextInt();
		
		for(int i=1;i<=9;i++) {
			System.out.printf("%d * %d = %d\n",num7, i, num7*i);
		}
	}
}
