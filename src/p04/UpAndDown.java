package p04;

import java.util.Random;
import java.util.Scanner;
/*
 * rNum과 numStr이 같은 값이라면 맞췄다
 * rNum이 numStr의 값보다 더크다면 UP
 * rNum이 numStr의 값보다 작다면 DoWn
 */
//2.맞출때까지 와일문으로
public class UpAndDown {
	public static int GetRanNum() {
		Random r = new Random();
		return r.nextInt(50)+1;
	}
	


	public static void main(String[] args) {
		int rNum = GetRanNum();
		
		int num=0;
		while(rNum!=num) {
		Scanner scan = new Scanner(System.in);
		System.out.println("1-50:");
		String numStr = scan.nextLine();
		num = Integer.parseInt(numStr);
		
		if(rNum>num) {
			System.out.println("Up");
		}else if(rNum<num) {
			System.out.println("Down");
		}
		}
		System.out.println("맞췄다");
	}
}
