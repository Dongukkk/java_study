package study.practice;

public class Practice22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2차원 배열과 인덱스 조정하기.
		//2차원 배열을 활용하여 다음 결과가 나오도록 코드를 작성하시오.
		//규칙을 찾아서 중첩된 반복문을 활용하여 값을 저장하고
		//아래와 같이 4*4 형태로 출력하시오.

		int[][] numArr = new int[4][4];
//		1.
//		1 2 3 4
//		5 6 7 8
//		9 10 11 12
//		13 14 15 16
		
		for(int i=0; i<numArr.length;i++) {
			for(int j=0; j<numArr[i].length; j++) {
				numArr[i][j] = (j+4*i+1);
			}
		}
		
		System.out.println("1.");
		for(int i=0; i<numArr.length;i++) {
			for(int j=0; j<numArr[i].length; j++) {
				System.out.print(numArr[i][j]+ " ");
			}
			System.out.println();
		}
		System.out.println();
		
//		2.
//		1 5 9 13
//		2 6 10 14
//		3 7 11 15
//		4 8 12 16
		System.out.println("2.");
		for(int i=0; i<numArr.length;i++) {
			for(int j=0; j<numArr[i].length; j++) {
				numArr[i][j] = (i+4*j+1);
			}
			
		}
		for(int i=0; i<numArr.length;i++) {
			for(int j=0; j<numArr[i].length; j++) {
				System.out.print(numArr[i][j]+ " ");
			}
			System.out.println();
		}
		System.out.println();
		
//		3.
//		16 15 14 13
//		12 11 10 9
//		8 7 6 5
//		4 3 2 1
		System.out.println("3.");
		for(int i=numArr.length-1; i>=0;i--) {
			for(int j=numArr[1].length-1; j>=0; j--) {
				numArr[3-i][3-j] = (j+4*i+1);
			}
			
		}
		
		
		for(int i=0; i<numArr.length;i++) {
			for(int j=0; j<numArr[i].length; j++) {
				System.out.print(numArr[i][j]+ " ");
			}
			System.out.println();
		}
		System.out.println();
		
//		4.
//		16 12 8 4
//		15 11 7 3
//		14 10 6 2
//		13 9 5 1
		System.out.println("4.");
		for(int i=numArr.length-1; i>=0;i--) {
			for(int j=numArr[1].length-1; j>=0; j--) {
				numArr[3-i][3-j] = (i+4*j+1);
			}
		}
	
		
		
		for(int i=0; i<numArr.length;i++) {
			for(int j=0; j<numArr[i].length; j++) {
				System.out.print(numArr[i][j]+ " ");
			}
			System.out.println();
		}
		System.out.println();
		
		
		
		
	}

}
