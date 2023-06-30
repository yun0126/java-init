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
			
			for(int i=9; i>0; i--) {
				for(int j =1; j<10;j++) {
					System.out.println(i + "x"+ j+"="+i*j);
				}
			}
			
		}
}
