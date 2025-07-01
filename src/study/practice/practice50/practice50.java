package study.practice.practice50;

import java.util.List;

public class practice50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentDAO studentDAO = new StudentDAO();
		
		System.out.println("=====student 전체 데이터 조회=====");
		List<StudentDTO> dList1 = studentDAO.findStudentList();
		for (StudentDTO dp : dList1) {
			System.out.println(dp);
		}

		System.out.println("=====학년으로 데이터 조회=====");
		List<StudentDTO> dList2 = studentDAO.findStudentListByGrade(2);
		for (StudentDTO dp : dList2) {
			System.out.println(dp);
		}
	}

}
