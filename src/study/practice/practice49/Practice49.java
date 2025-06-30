package study.practice.practice49;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Practice49 {

	public static void main(String[] args) {

		List<Professor> profList = findProfessorListByDeptno(101);
		if (profList == null) {
			System.out.println("조회된 데이터가 없다!");
		}

		if (profList != null) {
			for (Professor p : profList)
//				System.out.println(p.getProfno() + " " + p.getName() + " " + p.getId() + " " + p.getPosition() + " "
//						+ p.getPay() + " " + p.getDeptno());
//				
				System.out.println(p.toString());
		}
//		findProfessorListByDeptno(102);
//		findProfessorListByDeptno(103);
//		findProfessorListByDeptno(201);
//		findProfessorListByDeptno(202);
//		findProfessorListByDeptno(203);
//		findProfessorListByDeptno(301);

	}

	public static List<Professor> findProfessorListByDeptno(int deptno) {

		// OracleDB 연결
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// DB연결정보
		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String db_id = "scott";
		String db_pw = "tiger";

		// DB연결 및 사용시 필요한 객체
		Connection conn = null; // DB 연결 객체
		PreparedStatement psmt = null; // DB연결후, sql 명령 실행해주는 객체
		ResultSet rs = null; // sql Select 실행 후 조회 결과가 저장되는 객체

		// DB 연결
		try {
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 쿼리 준비

		String query = "select profno, name, id, position, pay, deptno from professor where deptno = ? ";

		List<Professor> professorList = new ArrayList<Professor>();

		try {

			psmt = conn.prepareStatement(query); // 쿼리실행 준비객체

			// 파라미터 세팅
			psmt.setInt(1, deptno); // 쿼리에 있는 첫번째 ? 위치에 deptno 를 세팅하겠다

			rs = psmt.executeQuery(); // 쿼리 실행 후 결과 저장

			// ResultSet rs 에 담겨져있는 쿼리 수행결과 확인
			while (rs.next()) {

				Professor prof = new Professor(rs.getInt("PROFNO"), rs.getString("NAME"), rs.getString("ID"),
						rs.getString("POSITION"), rs.getInt("PAY"), rs.getInt("DEPTNO"));
				professorList.add(prof);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// DB연결 종료

		try {

			if (rs != null)
				rs.close();

			if (psmt != null)
				psmt.close();

			if (conn != null) {
				conn.close();
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return professorList;
	}

}
