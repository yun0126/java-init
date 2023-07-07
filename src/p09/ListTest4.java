package p09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListTest4 {

	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 3개를 ,를 기준으로 입력하세요 : ");
		String numStr = scan.nextLine();
		String[] strs = numStr.split(",");

		for (int i = 0; i < strs.length; i++) {
			int num = Integer.parseInt(strs[i]);

			numList.add(num);
		}

		System.out.println("숫자 3개를 ,를 기준으로 다시 입력하세요 : ");
		numStr = scan.nextLine();
		strs = numStr.split(",");
		int cnt = 1;

		for (int i = 0; i < strs.length; i++) {
			int num = Integer.parseInt(strs[i]);
//			for(int j=0; j<strs.length; j++) {
//				if(num==numList.get(j)) {
//					cnt++;
//				}
//			}
//		}
			if (numList.indexOf(num) != -1) {
				cnt++;
			}
			System.out.println(cnt + "개 똑같아요.");
		}
	}
}
