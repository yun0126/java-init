package p03;

public class TwoArray {
	
	//789
	//456
	//123
	public static void main(String[] args) {
		int[][] numsArray = new int[3][3];
		System.out.println(numsArray.length);
		
		int cnt =1;
		for(int i=0; i<numsArray.length; i++) {
			//System.out.println(numsArray[i].length);
			for(int j=0; j<numsArray[i].length; j++) {
				
				numsArray[i][j]= 1;
				//numsArray[i][j]= cnt++;
			}
		}
		for(int i=0; i<numsArray.length; i++) {
			for(int j=0; j<numsArray[i].length; j++) {
				System.out.println(numsArray[i][j]);
			}
		}
	}
}
