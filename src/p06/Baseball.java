package p06;

import java.util.Random;
import java.util.Scanner;

/*
 * 발야구 겜 출력
 */
public class Baseball {
	public static void main(String[] args) {
		
		int [] nums = new int [3];
		Random r= new Random();
		
		for(int i=0; i<nums.length; i++) {
			nums[i] = r.nextInt(10);
			for(int j=0; j<i; j++) {
				if(nums[i]==nums[j]) {
					i--;
					break;
				}
			}
		}
		nums= new int[] {5,0,1};
		System.out.println("숫자3개 입력");
		Scanner scan = new Scanner(System.in);
		String numStr = scan.nextLine();
		String[] numStrs = numStr.split(",");
		int[] compNums = new int[numStrs.length];
		for(int i=0; i<numStrs.length; i++) {
			compNums[i] = Integer.parseInt(numStrs[i]);
			
		}
		int strike = 0;
		int ball = 0;
		
		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<compNums.length; j++) {
			if(nums[i]== compNums[j]) {
				if(i==j) {
					strike ++;
				}else {
					ball++;
				}
				break;
			}
		}
		
	}
		System.out.println(strike +"strike," +ball + "ball");
}
}