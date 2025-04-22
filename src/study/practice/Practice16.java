package study.practice;

import java.util.Scanner;

public class Practice16 {

	public static void main(String[] args) {
		
		//prac1();
		//prac2();
		prac3();
		 
		

	}

	public static void prac1() {
//		1.
//		+자연수 (정수) 5개의 수를 차례대로 입력 받는다.
//		몇번째 수인가요? : 그에 해당하는 수를 출력
//		ex) 10 20 30 50 90
//		몇번째 수인가요? 5
//		결과 : 90
//
		Scanner scanner = new Scanner(System.in);
		int[] intArr = new int[5];
		
		System.out.print("5개 수 입력 : ");
		for(int i=0;i<intArr.length;i++) {
			intArr[i] = scanner.nextInt();
		}
		
		System.out.print("몇번째 수인가요? ");
		int num = scanner.nextInt();
		
		System.out.println("결과 : " + intArr[num-1]);
		
	}
	
	public static void prac2() {
//		2.
//		+자연수 (정수) 5개의 수를 차례대로 입력 받는다.
//		받은후에 순서를 거꾸로 출력하세요.
//		ex) 1 2 3 4 5
//		결과 : 5 4 3 2 1
		
		Scanner scanner = new Scanner(System.in);
		int[] intArr = new int[5];
		
		System.out.print("5개 수 입력 : ");
//		for(int i=0;i<5;i++) {
//			intArr[i] = scanner.nextInt();
//		}
//		
//		System.out.print("결과 : ");
//		for(int i=intArr.length-1;i>=0;i--) {
//			System.out.print(intArr[i] + " ");
//		}
//		System.out.println();
		
		
		for(int i=intArr.length-1;i>=0;i--) {
			intArr[i] = scanner.nextInt();
		}
		
		System.out.print("결과 : ");
		for(int i=0;i<5;i++) {
			System.out.print(intArr[i] + " ");
		}
		System.out.println();
		
		
		
	}
	
	public static void prac3() {
//		3. 4x4 배열을 생성하여, 값을 아래와 같이 저장후 출력 하시오.
//		(*반복문을 사용하면 좀 더 편하게 저장이 가능합니다.)
//		1   2   3   4
//		5   6   7   8
//		9  	10 	11 	12
//		13 	14 	15 	16
		
		int[][] intArrs = new int[4][4];
		
		for(int i=0; i<intArrs.length; i++) {
			for(int j=0; j<intArrs[i].length; j++) {
				intArrs[i][j] = j + 4*i +1;
			}
		}
		for(int i=0; i<intArrs.length; i++) {
			for(int j=0; j<intArrs[i].length; j++) {
				//System.out.printf(intArrs[i][j] + " ");
				System.out.printf("%3d", intArrs[i][j]);	// 공간을 일정하게 차지하여 정렬 (3자리)
			}
			System.out.println();
		}
		
	}
}
