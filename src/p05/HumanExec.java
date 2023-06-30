package p05;
//5명 의돈 합 이랑 평균
//평균이상 사람들 출력
public class HumanExec {
	public static void main(String[] args) {
		
		Human[] hm = new Human[5];
		
		hm[0]= new Human();
		hm[0].name= "최민식";
		hm[0].money= 200;
		
		hm[1]= new Human();
		hm[1].name= "이보성";
		hm[1].money= 400;
		
		hm[2]= new Human();
		hm[2].name= "심재훈";
		hm[2].money= 200;
		
		hm[3]= new Human();
		hm[3].name= "이진석";
		hm[3].money= 400;
		
		hm[4]= new Human();
		hm[4].name= "전병민";
		hm[4].money= 700;
		
		int sum = 0;

		for(int i=0; i<hm.length; i++ ) {
			sum+= hm[i].money;
			
		}
		System.out.println(sum);
		int average=sum/hm.length;
		System.out.println(average);
		String names = "";
		for(int i=0; i<hm.length; i++ ) {
			
			if(average<=hm[i].money) {
				names +=hm[i].name + "님,";
			}
		}
	names = names.substring(0, names.length()-2);
	System.out.println(names + "은 평균 이상입니다");
	}
}
