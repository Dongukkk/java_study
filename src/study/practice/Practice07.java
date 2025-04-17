package study.practice;

import java.util.Scanner;

public class Practice07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("출생년도를 입력하세요 : ");
		int year = scanner.nextInt();
		
		System.out.print("주민번호 뒷자리 첫번째 숫자를 입력하세요 : ");
		int id = scanner.nextInt();
		
		// int age = 2026 - year;	// 2025년도 기준 나이계산
		int age = 2025 - year + 1;	// 2025년도 기준 한국나이계산(+1)
		
		if (year <= 2025) {
			if ((id == 1 && year<2000) || (id == 3 && year>=2000)) {
				System.out.printf("결과 : %d살 남자입니다.\n",age);
			} else if ((id == 2 && year<2000) || (id == 4 && year>=2000)) {
				System.out.printf("결과 : %d살 여자입니다.\n",age);
			} else {
				System.out.println("잘못된 입력입니다.");
			}
		} else {
			System.out.println("잘못된 입력입니다.");
		}
	}

}
