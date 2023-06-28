package p02;

import java.util.Scanner;

public class GuGuDan2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자:");
		String numStr = scan.nextLine();
		
		
		int num = Integer.parseInt(numStr);
		for(int i=1; i<10; i++) {
			System.out.println(i+"x"+num+"="+(num*i));
		}

	}

}
