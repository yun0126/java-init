package p10;

import java.sql.Connection;
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

		Connection con = DBCon.getCon();
		try {
			Statement stmt = con.createStatement();
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
