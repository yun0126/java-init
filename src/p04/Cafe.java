package p04;
//메서드 연습
//1.5000원이라고 하고 차액만큼 더 내라 라고
//2.5000원보다 더 많이 냈을경우 거스름돈 주는 코드 추가
public class Cafe {

	public static String getCoffee(String order,int price) {
		int coffeePrice =5000;
		 
		if(coffeePrice>price) {
			return(coffeePrice-price)+"원디부족합니다."; //리턴값 수행하면 아래꺼는 수행하지 않는다.
		}
		String str = "";
		if(coffeePrice<price) {
			str = (price-coffeePrice) + "원 잔돈이 남앗습니다";
		}
		return "주문하신" + coffeePrice +"원 짜리" + order + "가 준비되었습니다."+ str;
		
		
	}
	public static void main(String[] args) {
		String coffee = getCoffee("아아",2000);
		System.out.println(coffee);
		
		coffee = getCoffee("아아",6000);
		System.out.println(coffee);

	}

}
