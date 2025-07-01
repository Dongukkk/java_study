package study.practice.practice52;

import java.util.List;

public class Practice52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentScoreDAO studentScoreDAO = new StudentScoreDAO();
		
		List<StudentScoreDTO> scoreList1 = studentScoreDAO.findStudentScoreByDeptno1(101);
		for (StudentScoreDTO sl : scoreList1) {
			System.out.println(sl);
		}
		
		System.out.println("*************************************");
		List<StudentScoreDTO> scoreList2 = studentScoreDAO.findStudentScoreList();
		for (StudentScoreDTO sl : scoreList2) {
			System.out.println(sl);
		}
		
		
	}

}
