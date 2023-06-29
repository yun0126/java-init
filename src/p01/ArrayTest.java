package p01;

public class ArrayTest {

		public static void main(String[] args) {
		/*	int[] lotto = new int[6];
			System.out.println(lotto[0]);
			System.out.println(lotto[1]);
			System.out.println(lotto[2]);
			System.out.println(lotto[3]);
			System.out.println(lotto[4]);
			System.out.println(lotto[5]);
			
			lotto[0] = 1;
			lotto = new int[5];
		*/
			
			//1~10더하기
			int sum=0;
			for (int i=1; i<11; i++) {
				sum+=i;
			}
			System.out.println(sum);
		}
}
