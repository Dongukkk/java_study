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
		
		//practice51
		System.out.println("=====새로운 데이터 입력=====");
		StudentDTO saveS = new StudentDTO(9991, "name", "id", 1, 
				"0005313234567", "2000-05-31", "02)1234-5678",
				180, 75, 101, 201, 1001);
		
		int rs1 = studentDAO.saveStudent(saveS);
		if(rs1 > 0) {
			System.out.println("saveS 잘 저장됐다~~~");
		}
	}

}
