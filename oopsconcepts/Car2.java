package oopsconcepts;

public class Car2 {
	
	public static void main(String[] args) {
		
		//Car c = new Car();
		Car1 c1 = new Car1();
		Car c2 = new Car1();
		
		/*
		 * c1.start(); c1.stop(); c1.refuel();
		 */
		c1.start();
		c1.stop();
		c1.refuel();
		c1.recharge();
		System.out.println("-----------------");
		c2.start();
		c2.stop();
		c2.refuel();
	
	}

}
