package study.practice;

public class Practice03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 1)결과가 2가 나오도록 작성하세요
		System.out.println("===========1.===========");
		int x1 = 10;
		int y1 = 4;
		int result1 = x1/y1;
		System.out.println(result1);
		
		//1. 2)결과가 2.5가 나오도록 작성하세요
		int x2 = 10;
		int y2 = 4;
		double result2 = (double)x2/y2;
		System.out.println(result2);
		
		//2. 결과가 7.5가 나오도록 작성하세요
		System.out.println("===========2.===========");
		double a3 = 3.5;
		double b3 = 4.7;
		double result3 = a3 + (int)b3;
		System.out.println(result3);
		
		//3. 계산결과가 12가 나오도록 작성하세요
		System.out.println("===========3.===========");
		String a4 = "3.4";		//String -> 숫자 3.4 -> 3
		String b4 = "4";		//String -> 숫자 4
		int result4 = (int)Double.parseDouble(a4) * Integer.parseInt(b4);
		System.out.println(result4);
		
		//4. 계산결과가 "1013" 이 나오도록 코드를 작성하세요.
		System.out.println("===========4.===========");
		String a5 = "10";
		int b5 = 3;
		double c5 = 4.5;
		String result5 = a5 + (int)(b5*c5);
		System.out.println(result5);
		
		//5. 계산결과가 "243" 이 나오도록 코드를 작성하세요.
		System.out.println("===========5.===========");
		int a6 = 4;
		double b6 = 3.4;
		String c6 = "6.8";
		String result6 = ""+((int)Double.parseDouble(c6) * a6) + (int)b6;
		System.out.println(result6);
		
		//6. 1)출력결과 : 7
		System.out.println("===========6.===========");
		int x7 = 111;
		int y7 = 13;
		int result7 = x7 % y7;
		System.out.println("출력 결과 : " + result7);
		
		//6. 2)출력결과 : 8
		int x8 = 111;
		int y8 = 13;
		int result8 = x8 / y8;
		System.out.println("출력 결과 : " + result8);
	}

}
