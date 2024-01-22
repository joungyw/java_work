package my;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DB {
	public void insert(String todo) {

		System.out.println("DB에 할일 입력 넣기");

		try {

			Connection con = DriverManager.getConnection(INFO.JDBC_URL, INFO.USERNAME, INFO.PASSWORD);
			PreparedStatement pstmt = con.prepareStatement("INSERT INFO todo"
			+ "(할일 상태)" 
					+ "VALUES" 
			+ "(?,'준비')");

			
			pstmt.setString(1, todo);
			pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void select() {

		System.out.println("DB에 할일 목록 보여주기");
		try {
			Connection con = DriverManager.getConnection(INFO.JDBC_URL, INFO.USERNAME, INFO.PASSWORD);
			PreparedStatement pstmt = con.prepareStatement("select*FROM todo");
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getInt("idx"));
				System.out.println(rs.getInt("할일"));
				System.out.println(rs.getInt("상태"));
				
				
			}
					
		}catch (Exception e){
			e.printStackTrace();
		}
	}

}
