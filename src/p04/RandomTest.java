package p04;

import java.util.Random;
import java.util.Scanner;

//랜덤값123을 출력하면 1은 가위 2는 바위 3은 보 출력
//가위바위보를 입력해서 이겼다 졌다 출력
public class RandomTest {

	public static String getRock() {
		Random r = new Random();
		int rNum = r.nextInt(3);
		if(rNum ==0) {
			return "가위";
		}
		if(rNum ==1) {
			return "바위";
		}
		if(rNum ==2) {
			return "보";
		}
		return"";
	}
	
	public static void main(String[] args) {
		String rock = getRock();
		Scanner scan = new Scanner(System.in);
		System.out.println("가위,바위,보:");
		String urRock = scan.nextLine();
		
		if(rock.equals(urRock)) {
			System.out.println("비김");
		}else if((rock.equals("가위") && urRock.equals("바위"))
			||(rock.equals("바위") && urRock.equals("보"))
			||(rock.equals("보") && urRock.equals("가위"))
			){
			System.out.println("이김");
		}else{
				System.out.println("짐");
			
		}	
	}

}
