package p07;

public class Game {
	public String name;
	public int price;
	public String genre;
	
	public void start() {
		System.out.println(name + "을 시작합니다"); 
	}
	public void playing() {
		System.out.println(name + "플레이 중입니다"); 
	}
	
	public void stop() {
		System.out.println(name + "을 종료합니다"); 
	}
	
	
}
