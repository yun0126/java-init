package p06;

class Car{
	public String name;
	public static String type;
}

public class InstanceTest {
	public static void main(String[] args) {
		Car.type = "승용차";
		Car sonata = new Car();
		System.out.println(sonata.name);
		sonata.name = "소나타";
		System.out.println(sonata.name);
		
		Car c = null;
		System.out.println(c);
		
		c= new Car();
		System.out.println(c.name);
		
		c= new Car();
		sonata.name = "소나타";
		c= new Car();
		System.out.println(c.name);
		
		Car c1 =  new Car();
		c.name = "소나타";
		Car c2 =  new Car();
		c.name = "아반뗴";
		
	}
}
