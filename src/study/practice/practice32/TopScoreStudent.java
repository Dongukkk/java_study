package study.practice.practice32;

//basecode
public class TopScoreStudent {
	public static void main(String[] args) {
//배열 생성
		//String[] names = { /* 1. 이름을 배열로 만드세요. */ };
		String[] names = { "Elena", "Suzie", "John", "Emily", "Neda", "Kate", "Alex", "Daniel", "Hamilton" };
		//int[] scores = { /* 2. 점수를 배열로 만드세요. */ };
		int[] scores = { 65, 74, 23, 75, 68, 96, 88, 98, 54 };
//1등 인덱스 검색
		int i = topIndex(scores);

//결과 출력
		System.out.printf("1등: %s(%d점)\n", names[i], scores[i]);
	}

//정수형 배열을 입력받아 가장 큰 값의 인덱스를 반환
	public static int topIndex(int[] arr) {
		int max=arr[0];
		int index = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max=arr[i];
				index = i;
			}
		}
		return index;
	}
}
