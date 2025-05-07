package study.practice.practice36;

public class SolutionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Solution so1 = new Solution();
		
		int[] testCase1 = {1,2,3,3,3,4};
		int testCase1Answer = 3;
		
		int[] testCase2 = {1,1,2,2};
		int testCase2Answer = -1;
		
		System.out.println(so1.solutionMap2(testCase1) == testCase1Answer);
		System.out.println(so1.solutionMap2(testCase2) == testCase2Answer);

	}

}
