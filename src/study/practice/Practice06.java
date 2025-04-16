package study.practice;

import java.util.Scanner;

public class Practice06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1번. 삼각형의 밑변과 높이를 입력받아서 넓이를 출력하세요. (소수점까지 표현)
		// 삼각형의 넓이 = 밑변 * 높이 / 2 ;
		Scanner scanner = new Scanner(System.in);
		System.out.print("삼각형 밑변 : ");
		int base1 = scanner.nextInt();
		System.out.print("삼각형 높이 : ");
		int height1 = scanner.nextInt();
		double area1 = base1*height1*0.5;
		System.out.println("삼각형의 넓이 : " + area1);

		
		// 2번. 사다리꼴의 윗변과 밑변과 높이를 입력받아서 넓이를 출력하세요. (소수점까지 표현)
		// 사다리꼴의 넓이 = (윗변 길이 + 밑변 길이) * 높이 / 2;
		System.out.print("사다리꼴 윗변 : ");
		int top2 = scanner.nextInt();
		System.out.print("사다리꼴 밑변 : ");
		int base2 = scanner.nextInt();
		System.out.print("사다리꼴 높이 : ");
		int height2 = scanner.nextInt();
		double area2 = (base2 + top2)* height2 * 0.5;
		System.out.println("사디리꼴의 넓이 : " + area2);
		
		// 3번. 우리반은 24명입니다. 과자가 100개 있습니다.
		// 모두에게 공정하게 동일한 숫자의 과자를 나누어주면
		// 한 명당 몇 개의 과자를 받게되는지와 나누어주고 나서 몇개의 과자가 남는지 출력하세요.
		int num_class = 24;
		int cookie = 100;
		System.out.println("한 명당 " + cookie/num_class +"개의 과자를 받고 " + cookie%num_class + "개의 과자가 남는다.");
		
		// 4번. 세자리의 정수를 입력 받아서 백의자리, 십의자리, 일의자리를 각각 출력하세요.
		// 158
		// 백의자리 : 1
		// 십의자리 : 5
		// 일의자리 : 8
		System.out.print("세자리의 정수 : ");
		int num = scanner.nextInt();
		int num1 = num/100;
		int num2 = (num-num1*100)/10;
		int num3 = num%10;
		System.out.println("백의 자리 : " + num1);
		System.out.println("십의 자리 : " + num2);
		System.out.println("일의 자리 : " + num3);
		
		// 5번 x와 y 변수 안에 들어있는 서로의 값을 바꾸기
		int x = 10;
		int y = 20;
		System.out.println("x="+x+ " y="+y);
		//x와 y를 바꾼 작업
		//
		//
		int z;
		z=x;
		x=y;
		y=z;
		System.out.println("x="+x+ " y="+y);
	}

}
