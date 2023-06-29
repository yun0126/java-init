package p04;

import java.util.Scanner;
//1. 사사단출력
//2. 원하는 단수 출력
public class GuGuDan {
	
	
	public static void  printGuGuDan(int firstDan, int senconddan) {
	
		for(int i=1; i<=firstDan; i++) {
				for(int j=1; j<=senconddan; j++) {
					System.out.println(i+"x"+j+"="+(i*j));
				}
			}
	}
	
	public static void main(String[] args) {
	//	for(int i=1; i<10; i++) {
	//		for(int j=1; j<10; j++) {
	//			System.out.println(i+"x"+j+"="+(i*j));
	//		}
	//	}
		printGuGuDan(7,3);
		
	}

}
