package p04;

//메서드 사용해서 롯도 추력하기(중복안나오게)
public class MethodTest4 {
	int a; //변수란 다양한 값을 저장하기 위해서 사용함 
	//상수란 고정된 값을 저장하기 위해서 사용함
	
	public static int[] getLotto() { // 메서드란 기능을 저장하기 위해서 사용한다
		int[] lotto = new int[6];
		for(int i=0; i<lotto.length; i++) {
			int rNum = MethodTest2.getRandomNum(45);
			for(int j=0; j<i; j++) {
				if(lotto[j] == rNum) {
					i--;
					break;
				}
			}
			if(lotto[i]==0) {
			lotto[i] = rNum;
			}
		}
		
		
		return  lotto;
		}
	
	public static void PrintLotto(int[]lotto) {
		for(int i=0; i<lotto.length; i++) {
			System.out.println("lotto[" + i + "]: " + lotto[i]);
		}
	}
	
	public static void main(String[] args) {
	/*	String[] str = new String[1];
		String[] str2 = str;
		str[0] = "안녕";
		str = null;
		System.out.println(str2[0]);
	*/
		int[] lotto = getLotto();
		for(int i=0; i<lotto.length; i++) {
			System.out.println("lotto[" + i + "]: " + lotto[i]);
		}
		
		
}
	
}
