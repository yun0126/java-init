package p07;

public class Son extends Father {//상위는 Father
	public String hobby;
	
	public void printHobby() {
		System.out.println(name + "님의 취미는"+ hobby+ "입니다");
	}
}
