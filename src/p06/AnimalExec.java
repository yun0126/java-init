package p06;
//동물이냥이경우 냥이가 뜀니다 헌트빼고 양이가 먹습니다
//Animal에서 fly() 만들어서  type이 새일때만 출력
//아래 for 메소드로 뺴기
public class AnimalExec {
	
	public static void printAnimals(Animal[] animals) {//매개변수
		for(int i=0; i<animals.length; i++) {
			Animal animal = animals[i];
			
			animal.run();
			if(!animal.name.equals("냥이")) {
				animal.hunt();
			}
			if("새".equals(animal.type)) {
				animal.fly();
			}
			animal.eat();
			
			
		}
	}
	public static void main(String[] args) {
		Animal tiger = new Animal();
		tiger.name="호돌이";
		tiger.type ="호랑이";
		
	
		Animal cat= new Animal();
		cat.name="냥이";
		cat.type="고양이";
		
		Animal bird = new Animal();
		bird.name = "참새";
		bird.type = "새";
		
		
		Animal[] animals =new Animal[3];
		animals[0] =tiger;
		animals[1] =cat;
		animals[2]=bird;
		
		
	//	for(int i=0; i<animals.length; i++) {
	//		Animal animal = animals[i];
	//		
	//		animal.run();
	//		if(!animal.name.equals("냥이")) {
	//			animal.hunt();
	//		}
	//		if("새".equals(animal.type)) {
	//			animal.fly();
	//		}
	//		animal.eat();
			
			
	//	}
		
		printAnimals(animals);
		}

}
