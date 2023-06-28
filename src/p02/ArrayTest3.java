package p02;

public class ArrayTest3 {
	public static void main(String[] args) {
		/*
		 * 0 > 10
		 * 1 > 9
		 * 2 > 8
		 * 3 > 7
		 * .....
		 * 9 > 1
		 */
		String[] strs = new String[10];
		
		for(int i=0; i<10; i++) {
			System.out.print(i+",");
			System.out.print(10-i);
			strs[i] = 10-i +"";
		}
		for(int i=0;i<10;i++) {
			System.out.println("strs[" + i + "] = " + strs[i]);
		}
	}

}
