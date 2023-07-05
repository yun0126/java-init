package p07;

class Mother{
	public void work() {
		System.out.println("어머님이 집안일을 하십니다");
	}
}

class Daughter extends Mother{
	public void work() {
		System.out.println("딸이 출근을 합니다");
	}
	
	public void work(String job) {
		System.out.println("딸이"+job + "을 합니다");
	}
	
	
}
public class Overriding2 {
	public static void work(Mother[]ms) {
		for(int i=0; i<ms.length; i++) {
			Mother m = ms[i];
			//m이 Daughter 라고 불리울 수 있다면 
			//딸이 개발을 합니다
			if(m instanceof Daughter) {
				Daughter d= (Daughter)m;
				d.work("개발");
			}
		}
	}
	public static void main(String[] args) {
		Mother d = new Daughter();
		d.work();
		
		Mother m = new Mother();
		
		Mother[] ms = new Mother[2];
		ms[0]= d;
		ms[1]= m;
		
		work(ms);
		
//		System.out.println(d instanceof Mother);//마더라고 불러도 되니
//		System.out.println(m instanceof Mother);
//		System.out.println(d instanceof Daughter);
//		System.out.println(m instanceof Daughter);
	}
}
