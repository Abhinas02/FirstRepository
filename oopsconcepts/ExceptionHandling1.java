package oopsconcepts;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		ExceptionHandling1 obj = new ExceptionHandling1();
		obj.sum();
		System.out.println("Somebody throwed and exception");
	}

	public void sum() {
		try {
			// System.out.println("Somebody threw and exception");
			div();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
	}

	public void div() throws ArithmeticException {
		int i = 1 / 0;
		System.out.println(i);
	}

}
