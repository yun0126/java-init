package p09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Maptest2 {

	public static void main(String[] args) {
		Map<String,String> m = new HashMap<>();
		m.put("name", "최민식");
		m.put("position", "수비수");
		m.put("team", "양주");
		m.put("backNumber", "4");
		
		Map<String,String> m1 = new HashMap<>();
		m1.put("name", "심재훈");
		m1.put("position", "미드필더");
		m1.put("team", "노원");
		m1.put("backNumber", "7");
		
		Map<String,String> m2 = new HashMap<>();
		m2.put("name", "전병민");
		m2.put("position", "공격수");
		m2.put("team", "파주");
		m2.put("backNumber", "11");
		
		Map<String,String> m3 = new HashMap<>();
		m3.put("name", "김홍균");
		m3.put("position", "수비수");
		m3.put("team", "동작");
		m3.put("backNumber", "5");
		
		List<Map<String,String>> mapList = new ArrayList<>();
		mapList.add(m);
		mapList.add(m1);
		mapList.add(m2);
		mapList.add(m3);
		
		for(int i = 0; i<mapList.size(); i++) {
			Map<String,String> map = mapList.get(i);
			Iterator<String> it = map.keySet().iterator();
			while(it.hasNext()) {
				String key = it.next();
				System.out.print(key + " : " + map.get(key) + " , ");
			}
			System.out.println();
		}
	}
}
