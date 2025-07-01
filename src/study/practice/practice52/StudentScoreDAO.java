package study.practice.practice52;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import study.db.v2.DBConnectionManager;

public class StudentScoreDAO {

	// DB연결 및 사용시 필요한 객체
		Connection conn = null; // DB 연결 객체
		PreparedStatement psmt = null; // DB연결후, sql 명령 실행해주는 객체
		ResultSet rs = null; // sql Select 실행 후 조회 결과가 저장되는 객체
		
		public List<StudentScoreDTO> findStudentScoreByDeptno1(int deptno1) {

			conn = DBConnectionManager.connectDB();
			// 쿼리 준비

			String query = " select st.studno, st.name, sc.total, h.grade "
					+ " from student st, score sc, hakjum h "
					+ " where st.studno = sc.studno "
					+ " AND sc.total BETWEEN h.min_point AND h.max_point"
					+ " AND st.deptno1 = ? ";

			List<StudentScoreDTO> studentScoreList = new ArrayList<StudentScoreDTO>();

			try {

				psmt = conn.prepareStatement(query); // 쿼리실행 준비객체

				psmt.setInt(1, deptno1);
				rs = psmt.executeQuery(); // 쿼리 실행 후 결과 저장

				// ResultSet rs 에 담겨져있는 쿼리 수행결과 확인
				while (rs.next()) {

					StudentScoreDTO stud = new StudentScoreDTO();
					
					stud.setStudno(rs.getInt("studno"));
					stud.setName(rs.getString("name"));
					stud.setTotal(rs.getInt("total"));
					stud.setGrade(rs.getString("grade"));
					
					
					studentScoreList.add(stud);

				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			DBConnectionManager.disconnectDB(conn, psmt, rs);

			return studentScoreList;
		}
		
		public List<StudentScoreDTO> findStudentScoreList() {

			conn = DBConnectionManager.connectDB();
			// 쿼리 준비

			String query = " select st.studno, st.name, sc.total, h.grade "
					+ " from student st, score sc, hakjum h "
					+ " where st.studno = sc.studno "
					+ " AND sc.total BETWEEN h.min_point AND h.max_point";

			List<StudentScoreDTO> studentScoreList = new ArrayList<StudentScoreDTO>();

			try {

				psmt = conn.prepareStatement(query); // 쿼리실행 준비객체

				rs = psmt.executeQuery(); // 쿼리 실행 후 결과 저장

				// ResultSet rs 에 담겨져있는 쿼리 수행결과 확인
				while (rs.next()) {

					StudentScoreDTO stud = new StudentScoreDTO();
					
					stud.setStudno(rs.getInt("studno"));
					stud.setName(rs.getString("name"));
					stud.setTotal(rs.getInt("total"));
					stud.setGrade(rs.getString("grade"));
					
					
					studentScoreList.add(stud);

				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			DBConnectionManager.disconnectDB(conn, psmt, rs);

			return studentScoreList;
		}
}
