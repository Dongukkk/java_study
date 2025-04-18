package study.practice;

public class Practice12 {

	public static void main(String[] args) {
		
		//아래와 같은 결과가 출력되도록 코드를 작성하시오
		//1.
//		12345
//		12345
//		12345
//		12345
//		12345
		// 1)
		System.out.println("====1. 1)====");
		for(int i=1; i<=5; i++) {
			System.out.println("12345");
		}
		// 2)
		System.out.println("====1. 2)====");
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		//2.
//		11111
//		22222
//		33333
//		44444
//		55555
		// 1)
		System.out.println("====2. 1)====");
		for(int i=1; i<=5; i++) {
			System.out.println(""+i+i+i+i+i);
		}
		// 2)
		System.out.println("====2. 2)====");
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
	}

}
