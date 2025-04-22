package study.practice;

import java.util.Scanner;

public class Practice18 {

public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
//		System.out.println("1. 입력");
//		System.out.println("2. 수정");
//		System.out.println("3. 조회");
//		System.out.println("4. 삭제");
//		System.out.println("5. 종료");
		
		String[] menu = {"입력", "수정", "조회", "삭제", "종료"};
		
		for(int i=0; i<menu.length; i++) {	//i: 0 1 2 3 4
			System.out.println((i+1)+ ". " + menu[i]);
		}
		
		System.out.print("메뉴 번호를 입력하세요 : ");
		int menuNum = scanner.nextInt();
		/*
		switch(menuNum) {
		case 1:
			System.out.println("입력 메뉴입니다.");
			break;
		case 2:
			System.out.println("수정 메뉴입니다.");
			break;
		case 3:
			System.out.println("조회 메뉴입니다.");
			break;
		case 4:
			System.out.println("삭제 메뉴입니다.");
			break;
		case 5:
			System.out.println("프로그램이 종료됩니다.");
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
		
		}
		*/

		if(menuNum>= 1 && menuNum <=4) {
		System.out.println(menu[menuNum-1] + " 메뉴입니다.");
		} else if(menuNum == 5) {
			System.out.println("프로그램이 종료됩니다.");
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}

}
