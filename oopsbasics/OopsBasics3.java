package oopsbasics;

public class OopsBasics3 {

	public static void main(String[] args) {
		
		OopsBasics3 c = new OopsBasics3();
		c.test();
		c.test(1);
		int d = c.test('A');
		System.out.println(d);
		

	}

	public void test() {
		System.out.println("No input or output");
	}
	public void test(int a) {
		System.out.println("with input: "+a);
	}
	public int test(char b) {
		System.out.println("with input and output: "+b);
		return b;
	}
}
