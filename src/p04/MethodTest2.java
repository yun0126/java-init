package p04;

import java.util.Random;

public class MethodTest2 {
	
	public static int getRandomNum(int max) {
		Random r= new Random();
		int rNum = r.nextInt(max); //nextInt()의 데이터 타입이 int라서
		rNum+=1;//rNum 이 int니까 +1은 당근 가능하다
		return rNum;
		//return r.nextInt(45)+1;
	}
	
	public static void main(String[] args) {
		System.out.println(getRandomNum(1));
		System.out.println(getRandomNum(1));
		System.out.println(getRandomNum(1));
		System.out.println(getRandomNum(1));
		

	}

}
