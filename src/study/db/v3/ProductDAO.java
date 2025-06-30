package study.db.v3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import study.db.v2.DBConnectionManager;

public class ProductDAO {

	// DB연결 및 사용시 필요한 객체
		Connection conn; 		// DB 연결 객체
		PreparedStatement psmt; // DB연결후, sql 명령 실행해주는 객체
		ResultSet rs; 			// sql Select 실행 후 조회 결과가 저장되는 객체
	
	public ProductDTO findProductByP_Code(int p_code) {

		conn = DBConnectionManager.connectDB();

		// 쿼리 준비

		String query = "select * from product where p_code = ? ";

		ProductDTO product = null;

		try {

			psmt = conn.prepareStatement(query); // 쿼리실행 준비객체

			// 파라미터 세팅
			psmt.setInt(1, p_code); // 쿼리에 있는 첫번째 ? 위치에 deptno 를 세팅하겠다

			rs = psmt.executeQuery(); // 쿼리 실행 후 결과 저장

			// ResultSet rs 에 담겨져있는 쿼리 수행결과 확인
			if (rs.next()) {

				product = new ProductDTO();

				product.setP_code(rs.getInt("P_code"));
				product.setP_name(rs.getString("P_name"));
				product.setP_price(rs.getInt("P_price"));

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		DBConnectionManager.disconnectDB(conn, psmt, rs);

		return product;
	}
	
	public List<ProductDTO> findProductList() {

		conn = DBConnectionManager.connectDB();


		// 쿼리 준비

		String query = "select * from product";

		
		List<ProductDTO> productList = new ArrayList<ProductDTO>();

		try {

			psmt = conn.prepareStatement(query); // 쿼리실행 준비객체


			rs = psmt.executeQuery(); // 쿼리 실행 후 결과 저장

			// ResultSet rs 에 담겨져있는 쿼리 수행결과 확인
			while (rs.next()) {

				ProductDTO product = new ProductDTO(rs.getInt("P_code"), rs.getString("P_name"), rs.getInt("P_price"));
				productList.add(product);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		DBConnectionManager.disconnectDB(conn, psmt, rs);

		return productList;
	}
}
