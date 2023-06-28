package p02;

public class ArrayTest2 {
	public static void main(String[] args) {
		String[] strs = new String[10];
		/*
		 * 0 > 2
		 * 1 > 4
		 * 2 > 8
		 * ...
		 * 9 > 20	 
		 */
		
		for(int i=0; i<9; i++) {
			System.out.println(i+ ",");
			System.out.println((i+1)*2);
			strs[i] = (i+1)*2 +"";
			
		}
		for(int i=0; i<10; i++) {
			System.out.println("str");
		}
	}
}
