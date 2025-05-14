package term_exam.exam2;

import java.util.Scanner;

public class RouletteMachine {

	// 필드
	String id; // 기기아이디
	String spot; // 지점명
	int totalPoint; // 총합포인트
	int successCnt; // 성공횟수
	int failCnt; // 실패횟수
	int remainCnt; // 잔여횟수
	int revenue; // 매출액
	boolean isOpened; // 영업시작여부

	// 생성자 (아이디와 지점명을 가지고 생성, 나머지 0으로 초기화)
	RouletteMachine(String id, String spot) {
		this.id = id;
		this.spot = spot;
		totalPoint = 0;
		successCnt = 0;
		failCnt = 0;
		remainCnt = 0;
		revenue = 0;

	}

	// 메소드
	// 룰렛 게임 영업 시작
	public void open() { 
		isOpened = true; // 영업 시작
		System.out.printf("<<<%s %s 영업시작>>>\n", id, spot);

		while (isOpened) { // 마감되기 전까지 계속 진행
			int menuNum = selectMenu(); // 사용자가 고르는 메뉴 번호

			switch (menuNum) {
			case 1: // 충전
				recharge();
				break;
			case 2: // 게임시작
				run();
				break;
			case 3: // 마감
				close();
				break;
			}
		}
	}

	public int selectMenu() { // 사용자가 고르는 메뉴 번호
		Scanner scanner = new Scanner(System.in);

		System.out.println("==========[메뉴]==========");
		System.out.println("1. 충전 2. 게임시작 3. 마감");
		System.out.println("=========================");

		System.out.print("메뉴 선택 : ");
		int menuNum = scanner.nextInt();
		if (menuNum < 1 || menuNum > 3) { // 1,2,3 이외의 값이 입력될 경우 다시 입력
			System.out.println("=>잘못된 입력입니다. 메뉴를 다시 선택해주세요.");
			return 0;
		}
		return menuNum;
	}

	public void recharge() { // 1. 충전
		Scanner scanner = new Scanner(System.in);

		if (remainCnt != 0) { // 충전된 횟수가 있으면 추가 충전 불가
			System.out.println("=>잔여횟수가 남아있습니다. 게임 시작을 선택해주세요.");
			return;
		}
		int cost;

		while (true) {
			System.out.print("충전할 금액을 입력해주세요 : ");
			cost = scanner.nextInt();
			if (cost % 1000 != 0) { // 충전은 1000원 단위로만 입력 가능, 500원 단위 X -> 제대로 입력받을 때까지
				System.out.println("1000원 단위로만 충전이 가능합니다. 다시 입력해주세요.");
			} else {
				break;
			}
		}

		remainCnt = cost / 500; // 잔여횟수 금액에 따라 추가
		revenue += cost; // 매출액 증가
	}

	public void run() { // 2. 게임 시작
		if (remainCnt == 0) { // 충전된 횟수가 없으면 게임시작 불가
			System.out.println("=>잔여횟수가 남아있지 않습니다. 충전을 진행해주세요.");
			return;
		}
		while (remainCnt > 0) { // 충전된 횟수가 0이 될때까지 자동 진행
			int randomNum = (int) (Math.random() * 6) + 1; // 1~6 랜덤 값 출력
			remainCnt--;

			if (randomNum <= 4) { // 1~4 인 경우 성공 및 점수 획득
				successCnt++;
				totalPoint += randomNum;
				System.out.printf("룰렛 성공!! (%d점 획득!)			---(%d)\n", randomNum,randomNum);
			} else { // 5~6 인 경우 실패
				failCnt++;
				System.out.printf("룰렛 실패...				---(%d)\n", randomNum);
			}
		}
		// 게임 종료
		System.out.println(); // 성공횟수 실패횟수 총합점수 출력
		System.out.println("==============[게임 결과]==============");
		System.out.printf("성공횟수 : %d	실패횟수 : %d	총합점수 : %d\n", successCnt, failCnt, totalPoint);
		System.out.println("=====================================");
		successCnt = 0; // 한 게임이 끝난 후 데이터 초기화
		failCnt = 0;
		totalPoint = 0;
	}

	public void close() { // 3. 마감
		if (remainCnt != 0) { // 충전된 횟수가 있으면 마감 불가
			System.out.println("=>잔여횟수가 남아있습니다. 게임 시작을 선택해주세요.");
			return;
		}
		System.out.println(); // 마감 후 그날의 매출액 출력
		System.out.println("========<오늘의 룰렛 게임 마감>========");
		System.out.printf("오늘의 매출액 : %d원\n", revenue);
		System.out.println("=================================");
		revenue = 0;
		isOpened = false;
	}

}
