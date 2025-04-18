package study.practice;

import java.util.Scanner;

public class Practice11 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("년도 입력 : ");
		int year = scanner.nextInt();
		
		if (year%400==0) {
			System.out.println("윤년입니다.");
			
		} else if (year%100==0) {
			System.out.println("윤년이 아닙니다.");
		} else if (year%4==0) {
			System.out.println("윤년입니다.");
		} else {
			System.out.println("윤년이 아닙니다.");
		}
	}

}
