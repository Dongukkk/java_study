package study.db.v4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import study.db.v2.DBConnectionManager;

public class DepartmentDAO {

	// DB연결 및 사용시 필요한 객체
		Connection conn = null; // DB 연결 객체
		PreparedStatement psmt = null; // DB연결후, sql 명령 실행해주는 객체
		ResultSet rs = null; // sql Select 실행 후 조회 결과가 저장되는 객체
		
		public DepartmentDTO findDepartmentByDeptno(int deptno) {
			conn = DBConnectionManager.connectDB();
			// 쿼리 준비

			String query = "select * from department "
					+ "where deptno = ? ";

			DepartmentDTO departmentDTO = null;

			try {

				psmt = conn.prepareStatement(query); // 쿼리실행 준비객체

				psmt.setInt(1, deptno);
				rs = psmt.executeQuery(); // 쿼리 실행 후 결과 저장

				// ResultSet rs 에 담겨져있는 쿼리 수행결과 확인
				if (rs.next()) {

					departmentDTO = new DepartmentDTO();
					
					departmentDTO.setDeptno(rs.getInt("deptno"));
					departmentDTO.setDname(rs.getString("dname"));
					departmentDTO.setPart(rs.getInt("part"));
					departmentDTO.setBuild(rs.getString("build"));

				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			DBConnectionManager.disconnectDB(conn, psmt, rs);

			return departmentDTO;
		}

		public List<StudentDTO> findStudentList() {

			conn = DBConnectionManager.connectDB();
			// 쿼리 준비

			String query = "select studno, name, id, grade, jumin, TO_CHAR(birthday, 'YYYY-MM-DD') birthday, tel, height, weight, deptno1, deptno2, profno from student";

			List<StudentDTO> studentList = new ArrayList<StudentDTO>();

			try {

				psmt = conn.prepareStatement(query); // 쿼리실행 준비객체

				rs = psmt.executeQuery(); // 쿼리 실행 후 결과 저장

				// ResultSet rs 에 담겨져있는 쿼리 수행결과 확인
				while (rs.next()) {

					StudentDTO stud = new StudentDTO(rs.getInt("STUDNO"), rs.getString("NAME"), rs.getString("ID"),
							rs.getInt("grade"), rs.getString("JUMIN"), rs.getString("BIRTHDAY"), rs.getString("TEL"),
							rs.getInt("HEIGHT"), rs.getInt("WEIGHT"), rs.getInt("DEPTNO1"), rs.getInt("DEPTNO2"),
							rs.getInt("PROFNO"));
					studentList.add(stud);

				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			DBConnectionManager.disconnectDB(conn, psmt, rs);

			return studentList;
		}
}
