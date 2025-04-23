package study.practice;

import java.util.Scanner;

public class Practice23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		String[] menu = { null, "아메리카노", "카페라떼", "바닐라라떼" };
		int[] menuCount = { 0, 0, 0, 0 }; // 1번째: 아메리카노 2번째: 카페라떼 3번째: 바닐라라떼
		int[] menuPrice = { 0, 3500, 4100, 4300 };
		int total = 0;

		while (true) { // 메뉴판 출력
			System.out.println("======== 메뉴 ========");
			System.out.println("1. 아메리카노	3500원");
			System.out.println("2. 카페라떼	4100원");
			System.out.println("3. 바닐라라떼	4300원");
			System.out.println("=====================");

			System.out.print("메뉴 선택 : ");
			int menuNum = scanner.nextInt(); // 메뉴 입력

			if (menuNum < 1 || menuNum > 3) { // 잘못된 메뉴 선택시 문구 출력 후 처음으로
				System.out.println("잘못 선택하셨습니다. 다시 선택해주세요.");
				System.out.println();
				continue; // while 처음으로
			}

			System.out.print("수량 선택 : ");
			int cupNum = scanner.nextInt(); // 수량 입력
			scanner.nextLine(); // clear 효과(nextLine)

			menuCount[menuNum] += cupNum; // 누적 개수 저장

			String order;

			while (true) {
				System.out.print("추가 주문하시겠습니까?(y/n) : "); // 추가 주문 여부 입력
				order = scanner.nextLine();

				if (!(order.equals("y") || order.equals("n"))) { // 추가 주문이 y 나 n 이 아닐 때
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
					System.out.println();
				} else {
					break;
				}
			}
			if (order.equals("n")) { // 추가 주문 안함(n) 선택 시
				System.out.println();
				System.out.println("====================="); // 주문 정보 출력
				for (int i = 1; i <= menu.length - 1; i++) {
					if (menuCount[i] != 0) {				// 주문 개수가 0이 아닌 메뉴만 출력
						System.out.printf("%5s %2d잔 : %6d원\n", menu[i], menuCount[i], menuCount[i] * menuPrice[i]);
					}
				}
				System.out.println("=====================");
				for (int i = 1; i <= menu.length - 1; i++) { // 총액 계산
					total += menuCount[i] * menuPrice[i];
				}
				System.out.println("총액 : " + total + "원"); // 총액 출력
				break; // 반복문 종료

			} else if (order.equals("y")) { // 추가 주문(y) 선택 시
				System.out.println();

			}

		}

	}
}
