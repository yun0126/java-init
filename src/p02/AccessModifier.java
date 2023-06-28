package p02;
//public 위에는 선언만 (초기화)가능 출력불가능하다 static 때문
public class AccessModifier {
		int b=10;
		
	public static void main(String[] args) {
		int i = 1;
		System.out.println(i);
		AccessModifier am = new AccessModifier();//객체생성
		
		System.out.println(am.b);
		
		
		AccessModifier am1 = new AccessModifier();
		System.out.println(am1.b);
	}

}
