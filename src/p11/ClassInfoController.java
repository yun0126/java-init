package p11;

import java.sql.Connection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import p10.DBCon;

public class ClassInfoController {
	public List<Map<String,String>> getClassInfoList(Map<String,String> param){
		ClassInfoService ciService = new ClassInfoService();
		return ciService.getClassInfoList(param);
	}
	public int insertUserInfo(Map<String,String>userInfo) {
		return 0;
	}
	
	public int deleteUserInfo(Map<String,String>userInfo) {
		return 0;
	}
	
	public static void main(String[] args) {
		ClassInfoController ciController = new ClassInfoController();
		Map<String,String> param = new HashMap<>();
		param.put("CI_Desc", "어려움");
		List<Map<String,String>> classInfoList = ciController.getClassInfoList(param);
		for(Map<String,String> classInfo : classInfoList) {
			System.out.println(classInfo);
		}
	}
}