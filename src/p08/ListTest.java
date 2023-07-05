package p08;

import java.util.ArrayList;

public class ListTest {
	public static void main(String[] args) {
		String str1 = "안녕";
		String str2 = "내 소개를";
		String str3 = "하지";
		String str4 = "내 직업은";
		String str5 = "학생이야";
		
		String strs[]= new String[5];
			strs[0]= str1;
			strs[1]= str2;
			strs[2]= str3;
			strs[3]= str4;
			strs[4]= str5; 
		
			for(int i = 0; i<strs.length; i++) {
				System.out.println(strs[i]);
			}
			ArrayList<String> strList = new ArrayList<String>();
			System.out.println(strList.size());
			strList.add("1");
			System.out.println(strList.size());
			strList.add("a");
			System.out.println(strList.size());
			strList.add("2");
			System.out.println(strList.size());
			strList.add("가");
			System.out.println(strList.size());
			strList.remove(0); 							//삭제
			System.out.println(strList.size());
			
			ArrayList<Integer> intList = new ArrayList<Integer>();
			intList.add(2);
			
	}
}
