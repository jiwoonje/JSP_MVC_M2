package common;

import java.sql.*;

public class JDBCUtil {
	// DB 연결(Connection) 객체 : Oracle
	
	// 기본 생성자
	public JDBCUtil() {
		System.out.println("JDBCUtil 호출 성공");
	}

	// static 메소드 : 객체 생성 없이 클래스 이름으로 호출됨
	public static Connection getConnection () {
		Connection conn = null;
		
		// 오라클 DB : XE, C##HR, 1234 <== 연결하는 구문 생성
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		
		try {		
			Class.forName(driver);
			conn = DriverManager.getConnection(url,"C##HR", "1234");
			System.out.println("DB 연결에 성공 했습니다.");
		}catch (Exception e) {
			System.out.println("DB 연결에 실패 했습니다.");
			e.printStackTrace();
		}
		
		return conn;
	}
	
	// rs, pstmt, conn 반납 : select 문을 사용하고 반납,
	// 메소드 오버로딩
	public static void close(ResultSet rs, PreparedStatement pstmt, Connection conn) {
		if (rs != null) {
			try {
				rs.close();
				System.out.println("rs가 잘 제거되었습니다.");
			}catch (Exception e) {
				System.out.println("rs 제거 중 오류가 발생하였습니다.");
			}
		}
		if (pstmt != null) {
			try {
				pstmt.close();
				System.out.println("pstmt가 잘 제거되었습니다.");
			}catch (Exception e) {
				System.out.println("pstmt 제거 중 오류가 발생하였습니다.");
			}
		}
		if (conn != null) {
			try {
				conn.close();
				System.out.println("conn이 잘 제거되었습니다.");
			}catch (Exception e) {
				System.out.println("conn 제거 중 오류가 발생하였습니다.");
			}
		}
	}
}
