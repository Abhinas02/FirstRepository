package oopsconcepts;

public class ExceptionHandling {
	int a = 10;
	public static void main(String[] args) {
		
		//int a = 1/0;
		ExceptionHandling obj = new ExceptionHandling();
		//obj = null;
		System.out.println(obj.a);
		try {
			int i = 1/0;
			System.out.println(i);
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("Catch block");
			
		}
		System.out.println("Exception handled");

	}
}
	
