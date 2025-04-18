package study.practice;

import java.util.Scanner;

public class Practice10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("국어점수 : ");
		int lanScore = scanner.nextInt();
		System.out.print("수학점수 : ");
		int mathScore = scanner.nextInt();
		System.out.print("영어점수 : ");
		int engScore = scanner.nextInt();
		
		int total =lanScore+mathScore+engScore;
		double avg = (lanScore+mathScore+engScore)/3.0;
		
		if (lanScore>=40 && mathScore>=40 && engScore>=40 && avg>=60.0) {
			System.out.println("국어 : " + lanScore);
			System.out.println("수학 : " + mathScore);
			System.out.println("영어 : " + engScore);
			System.out.println("합계 : " + total);
			System.out.printf("평균 : %.1f\n", avg);
			System.out.println("축하합니다, 합격입니다!");
		} else {
			System.out.println("불합격입니다.");
		}
		
		// case2.
		
		if (lanScore<40 || mathScore<40 || engScore<40 || avg <60) {
			//불합격
		} else {
			//합격
		}
	}

}
