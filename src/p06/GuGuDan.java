package p06;

public class GuGuDan {
	public static void main(String[] args) {
		
		for(int i=1; i<=9; i++) {
			
			for(int j=1; j<=9; j++) {	
				System.out.print(j+"x"+i+"="+(i*j));
				if(j==9) {
					System.out.println();
				}else {
					System.out.print(",");
				}
			}
		}
		
	}
}
