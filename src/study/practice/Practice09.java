package study.practice;

public class Practice09 {

	public static void main(String[] args) {
		//반복문 샘플 연습
		// 출력은 반복되는 숫자(i) 를 출력
		int i;
		//for.
		//1) i가 0~10으로 11번 반복
		System.out.println("=====1======");
		for(i=0;i<=10;i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("------------");
		i = 0;
		while(true) {
			System.out.print(i + " ");
			if(i==10)
				break;
			i++;
		}
//		2) i가 1~9로 9번 반복
		System.out.println();
		System.out.println("=====2======");
		for(i=1;i<=9;i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("------------");
		i = 0;
		while(true) {
			i++;
			System.out.print(i + " ");
			if(i==9)
				break;
			
		}
//		3) i가 10 ~ 100 으로 10번 반복
		System.out.println();
		System.out.println("=====3======");
		for(i=10;i<=100;i+=10) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("------------");
		i = 10;
		while(true) {
			System.out.print(i + " ");
			if(i==100)
				break;
			i = i + 10;
			
		}
//		4) i가 25 50 75 100 해서 4번 반복
		System.out.println();
		System.out.println("=====4======");
		for(i=25;i<=100;i=i+25) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("------------");
		i = 25;
		while(true) {
			System.out.print(i + " ");
			if(i==100)
				break;
			i = i + 25;
			
		}
		
		
//		while.
		
//		5) i가 50 ~ 55로 6번 반복
		System.out.println();
		System.out.println("=====5======");
		i = 50;
		while(true) {
			System.out.print(i + " ");
			if(i==55)
				break;
			i++;
		}
		System.out.println();
		System.out.println("------------");
		for(i=50;i<=55;i++) {
			System.out.print(i + " ");
		}
		
//		6) i가 10 ~ 1로 10번 반복
		System.out.println();
		System.out.println("=====6======");
		i = 10;
		while(true) {
			System.out.print(i + " ");
			if(i==1)
				break;
			i--;
		}
		System.out.println();
		System.out.println("------------");
		for(i=10;i>=1;i--) {
			System.out.print(i + " ");
		}
//		7) i가 30 ~ 0으로 5씩 감소하면서 7번 반복
		System.out.println();
		System.out.println("=====7======");
		i = 30;
		while(true) {
			System.out.print(i + " ");
			if(i==0)
				break;
			i=i-5;
		}
		System.out.println();
		System.out.println("------------");
		
		for(i=30;i>=0;i=i-5) {
			System.out.print(i + " ");
		}
//		8) i가 30 ~ 5으로 5씩 감소하면서 6번 반복
		System.out.println();
		System.out.println("=====8======");
		i = 30;
		while(true) {
			System.out.print(i + " ");
			i=i-5;
			if(i==0)
				break;
			
		}
		System.out.println();
		System.out.println("------------");
		
		for(i=30;i>=5;i=i-5) {
			System.out.print(i + " ");
		}
//		9) i가 25 ~ 0으로 5씩 감소하면서 6번 반복
		System.out.println();
		System.out.println("=====9======");
		i = 30;
		while(true) {
			i=i-5;
			System.out.print(i + " ");
			if(i==0)
				break;
		
		}
		System.out.println();
		System.out.println("------------");
		
		for(i=25;i>=0;i=i-5) {
			System.out.print(i + " ");
		}

	}

}
