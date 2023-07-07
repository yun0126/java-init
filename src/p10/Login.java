package p10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Login {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("ID : ");
		String uiId = scan.nextLine();
		System.out.println("PASSWORD : ");
		String uiPwd = scan.nextLine();

		String sql = "SELECT * FROM user_info ";
		sql += " WHERE UI_ID = '" + uiId + "' AND UI_PWD='" + uiPwd + "'";

		String sql1 = "INSERT INTO user_info(UI_ID, UI_PWD, UI_NAME)\r\n" + "VALUES('TEST00', 'TEST00', '연습00')";

		String sql2 = "UPDATE USER_INFO SET UI_NAME = '동동이' WHERE UI_NUM=6";

		Connection con = DBCon.getCon();  
		try {
			Statement stmt = con.createStatement();
			int signIn = stmt.executeUpdate(sql1);
			System.out.println("회원가입 된 계정" + signIn);
			int update = stmt.executeUpdate(sql2);
			System.out.println("계정 정보 수정");
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) {
				String uiName = rs.getString("UI_NAME");
				System.out.println(uiName + "님 안녕~");
			} else {
				System.out.println("아이디나 비밀번호가 잘못 되었습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
