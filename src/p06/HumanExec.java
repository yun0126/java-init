package p06;
/*
 * 5명의 사람을 만듬
 * 각각의 이름과 나이를 다르게 입력하세요(ex Human h1= new Human();
 * 							h1.name = "동동이"
 * 							h1.age = 33;
 * 길이 5게짜리 Human 배열을 만든다
 * 반복문을 사용하여 최고령 ,최연소 누구인지 출력하면 된다
 * 평균을 구한 뒤 평균이랑 제일 근접한 나이가 누구인지 출력하면 된다
 * 절대값
 */

public class HumanExec {
	public static void main(String[] args) {
		Human hm = new Human();
		hm.name="전병민";
		hm.age =25;
		
		Human hm1 = new Human();
		hm1.name="최민식";
		hm1.age =24;
		
		Human hm2 = new Human();
		hm2.name="윤동환";
		hm2.age =24;
		
		Human hm3 = new Human();
		hm3.name="한효주";
		hm3.age =37;
		
		Human hm4 = new Human();
		hm4.name="이보성";
		hm4.age =25;
		
		
		Human[] hms = new Human[5];
		hms[0] = hm;
		hms[1] = hm1;
		hms[2] = hm2;
		hms[3] = hm3;
		hms[4] = hm4;
		
//		int minage= hms[0].age;
//		int minIdx = 0;
//		
//		int maxage = hms[0].age;
//		int maxIdx =0;
//		
//		for(int i=0;i<hms.length;i++) {
//			if(minage>hms[i].age) {
//				minage = hms[i].age;
//				minIdx=i;
//			}
//			if(maxage<hms[i].age) {
//				maxage = hms[i].age;
//				maxIdx = i;
//			}
//			
//			
//		}
//		
//		System.out.println("최연소:"+hms[minIdx].name+ "의");
//		System.out.println("최고령:"+hms[maxIdx].name+ "의");
//		
	Human firstHuman = hms[0];
	Human lastHuman = hms[0];
	
	for(int i=1; i<hms.length; i++) {
		Human human = hms[i];
		
		if(firstHuman.age>human.age) {
			firstHuman= human;
		}
		if(lastHuman.age<human.age) {
			lastHuman= human;
		}
	}
	
		
		
	}
}
