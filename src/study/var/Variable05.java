package study.var;

public class Variable05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "text";
		
		System.out.println("출력 1");
		System.out.println(s);
		System.out.println("출력 2");
		//				line 줄바꿈 포함
		
		System.out.print("출력 1");
		System.out.print(s);
		System.out.print("출력 2");
		
		System.out.println();
		
		int hour = 12;
		int minute = 36;
		//현재 12시 36분 입니다.
		
		
		//	\"	\'	\\
		System.out.println("현재 " + hour +"시 " + minute + "분 입니다.");
		System.out.printf("현재 %d시 %d분 입니다.\n", hour, minute);
		
		System.out.printf("이자는 3.5%% 입니다.\n");
		//System.out.printf("현재 %d시 %d분 입니다.", minute, hour);
		
		String menu = "햄버거";
		minute = 48;
		double rate = 4.1515;
		
		System.out.printf("오늘 %-4d분에 점심으로 %10s를 먹고 은행 이자는 %6.2f%%더라~\n", minute, menu, rate);
		
	}

}
