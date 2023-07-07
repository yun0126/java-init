package p09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MapTest3 {

	public static void main(String[] args) {
		Map<String, String> b = new HashMap<>();
		b.put("name", "새우깡");
		b.put("company", "농심");
		b.put("rank", "1");
		b.put("price", "2000");

		Map<String, String> b1 = new HashMap<>();
		b1.put("name", "감자깡");
		b1.put("company", "농심");
		b1.put("rank", "2");
		b1.put("price", "3000");

		Map<String, String> b2 = new HashMap<>();
		b2.put("name", "홈런볼");
		b2.put("company", "해태");
		b2.put("rank", "3");
		b2.put("price", "2500");

		Map<String, String> b3 = new HashMap<>();
		b3.put("name", "제크");
		b3.put("company", "롯데");
		b3.put("rank", "4");
		b3.put("price", "1500");

		List<Map<String, String>> bList = new ArrayList<>();
		bList.add(b);
		bList.add(b1);
		bList.add(b2);
		bList.add(b3);

		for (Map<String, String> name : bList) {
			System.out.println(name);

		}
		System.out.println();
	}
}
