package p07;

public class OverLoading {
	
	public void test(String str ) {
		System.out.println("test(String str) 호출");
	}
	
	
	public void test() {
		System.out.println("test() 호출");
	}
	
	public void test(int num) {						//매개변수 short는 ()가 생략
		System.out.println("test(int num) 호출" );
	}
	public void test(double db) {						
		System.out.println("test(double db) 호출" );
	}
	
	public void test(long lo) {						
		System.out.println("test(long lo) 호출" );
	}
	
	public void test(byte bt) {						
		System.out.println("test(byte bt) 호출" );
	}
	
	public void test(short st) {						
		System.out.println("test(short st) 호출" );
	}
	public void test(char ch) {						
		System.out.println("test(char ch) 호출" );
	}
	public void test(boolean bl) {						
		System.out.println("test(boolean bl) 호출" );
	}
	
	public void test(float fl) {						
		System.out.println("test(float fl) 호출" );
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		OverLoading ol = new OverLoading();
		ol.test("2");
		ol.test(2.1);
		ol.test();
		ol.test(2);
		ol.test((long)2);
		ol.test((byte)2);
		ol.test((short)2);
		ol.test('2');
		ol.test(true);
		ol.test((float)2);
		
	}	
}
