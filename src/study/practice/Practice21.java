package study.practice;

import java.util.Scanner;

public class Practice21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//prac1();
		//prac2();
		//prac3();
		//prac4();
		//prac5();
		prac6();
	}

	public static void prac1() {
//		1. 중첩반복문을 활용하여 아래와 같이 결과가 나타나도록 출력코드를 작성해주세요.
//		*****
//		****
//		***
//		**
//		*
		
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void prac2() {
//		2. 중첩반복문을 활용하여 아래와 같이 결과가 나타나도록 출력코드를 작성해주세요.
//		*
//		**
//		***
//		****
		
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void prac3() {
//		3. 입력된 수의 약수를 출력하시오.
//		ex) 입력 : 6
//		1 2 3 6
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("입력 : ");
		int num = scanner.nextInt();
		
		//약수 찾기
		for (int i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		
	}

	public static void prac4() {
//		4. 중첩반복문을 활용하여 아래와 같이 결과가 나타나도록 출력코드를 작성해주세요.
//		숫자를 입력받고 아래 문양으로 * 출력하기
//		ex) 입력 : 5
//		*
//		**
//		***
//		****
//		*****
//		****
//		***
//		**
//		*
//
//		입력 : 3
//
//		*
//		**
//		***
//		**
//		*
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("입력 : ");
		int num = scanner.nextInt();
		// *개수 증가
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// *개수 감소
		for(int i=num-1;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void prac5() {
//		5. 1+ (1+2)+ (1+2+3)+(1+2+3+4)+...+(1+2+3+...+10) ..결과 계산 최종결과는?
		int total = 0;
		
		for(int i=1; i<=10;i++) {
			for(int j=1; j<=i; j++) {
				total = total + j;
			}
		}
		System.out.println("최종결과 : " + total);
	}
	
	public static void prac6() {
//		6. 1+(-2)+3+(-4)+... , 과 같은 식으로 계속 더해나갔을 때 몇까지 더해야 총합이
//		100이상인지 찾으시오. 100 이상이된 시점의 누적합이 얼마인지 + 얼마까지 더해서 100이 넘었는지 찾으세요.
		int total = 0;
		int i = 0;
		while(total<100) {
			i++;
			if(i%2==0) {
				total -= i;
			} else {
				total += i;
			}
			
		}
		System.out.println("누적합 : " + total);
		System.out.println("마지막으로 더한 숫자 : " + i);
	}
}
