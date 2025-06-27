package study.practice.practice48;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Practice48 {

	public static void main(String[] args) {

		System.out.println("1. 단일 행을 읽어서 리턴해서 출력하기");
		
		//P_CODE 100 조회
		Product product = findProductByP_Code(100);
		if (product == null) {
			System.out.println("조회된 데이터가 없다!");
		}

		if (product != null) {
			System.out.println(product.getP_code() + " " + product.getP_name() + " " + product.getP_price());
		}
		
		
		System.out.println("2. 객체 리스트 단위로 리턴해서 출력하기");
		
		List<Product> productList = findProductList();

		if (productList.size() == 0)
			System.out.println("리스트가 비어있다");

		if (productList != null) {

			for (Product p : productList) {
				System.out.println(p.getP_code() + " " + p.getP_name() + " " + p.getP_price());
			}

		}
	}
	
	

	public static Product findProductByP_Code(int p_code) {

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

		String query = "select * from product where p_code = ? ";

		Product product = null;

		try {

			psmt = conn.prepareStatement(query); // 쿼리실행 준비객체

			// 파라미터 세팅
			psmt.setInt(1, p_code); // 쿼리에 있는 첫번째 ? 위치에 deptno 를 세팅하겠다

			rs = psmt.executeQuery(); // 쿼리 실행 후 결과 저장

			// ResultSet rs 에 담겨져있는 쿼리 수행결과 확인
			if (rs.next()) {

				product = new Product();

				product.setP_code(rs.getInt("P_code"));
				product.setP_name(rs.getString("P_name"));
				product.setP_price(rs.getInt("P_price"));

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

		return product;
	}
	
	public static List<Product> findProductList() {

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

		String query = "select * from product";

		
		List<Product> productList = new ArrayList<Product>();

		try {

			psmt = conn.prepareStatement(query); // 쿼리실행 준비객체


			rs = psmt.executeQuery(); // 쿼리 실행 후 결과 저장

			// ResultSet rs 에 담겨져있는 쿼리 수행결과 확인
			while (rs.next()) {

				Product product = new Product(rs.getInt("P_code"), rs.getString("P_name"), rs.getInt("P_price"));
				productList.add(product);

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

		return productList;
	}
}
