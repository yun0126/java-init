package p07;

import java.util.Scanner;

public class Constructure {
	
	Constructure(){ //생성자
		System.out.println("나불렀어?");
	}
	public Constructure(int num) {
		System.out.println("int num 불렀어?");
	}
	public static void main(String []args) {
		Constructure c = new Constructure();
		Scanner scan = new Scanner(System.in);
	}
	
	
	
}
