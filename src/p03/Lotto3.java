package p03;

import java.util.Random;
import java.util.Scanner;

public class Lotto3 {
	public static void main(String[] args) {
		/*
		 * int[ lotto = new int[6];만들어서
		 * 램덤이던 메쓰.랜덤이던 로또번호를 6개 만들어서 위에 넣으세요
		 * 중첩수나오게하기
		 */
		
		
		int[] lotto = new int[6];
		Random r = new Random();
		
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = r.nextInt(45)+1;
		}
		
		System.out.println("1-45까지의 숫자를 기준으로 6개 입력해주세요:");
		Scanner scanner= new Scanner(System.in);
		String lottoStr = scanner.nextLine();
		String[] strs= lottoStr.split(",");
		int cnt = 0;
		
		for(int i=0; i<strs.length; i++) {
			int strNum = Integer.parseInt(strs[i]);
			for(int j=0;j<lotto.length; j++) {
			//	String lottoString = Integer.toString(lotto[i]);  //String lotto String = Integer.toString(lotto[i]);,
			//	if(lotto[i]== )
			}
		}
		System.out.println();
	}
}
