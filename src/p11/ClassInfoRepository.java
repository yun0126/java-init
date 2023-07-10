package p11;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import p10.DBCon;

public class ClassInfoRepository {

	/*
	 * 디비 주소
	 * 커넥션
	 * 드라이버(jdbc드라이버)
	 * 아이디, 비밀번호
	 */
	
	public List<Map<String,String>> getClassInfoList(Map<String,String> param){
		List<Map<String,String>> classInfoList = new ArrayList<>();
		Connection con = DBCon.getCon();
		try {
			Statement stmt = con.createStatement();
			String sql = "SELECT * FROM Class_Info";
			if(param != null) {
				if(param.get("Class_Name")!=null) {
					sql += " WHERE Class_NAME LIKE '%" + param.get("ciName") + "%'";	
				}
			}
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				Map<String, String> classInfo = new HashMap<>();
				classInfo.put("CI_Num", rs.getString("CI_NUM"));
				classInfo.put("CI_Name", rs.getString("CI_NAME"));
				classInfo.put("CI_Desc", rs.getString("CI_DESC"));
				classInfoList.add(classInfo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return classInfoList;
	}
}
