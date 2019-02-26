package oopsbasics;

public class OopsBasics4 {

	String name = "Abhinas";
	static int age = 31;
	static String j = "10";

	public static void main(String[] args) {
		OopsBasics4 a = new OopsBasics4();
		a.test();
		a.wrapper();
		int i = Integer.parseInt(j);
		System.out.println(age);
		System.out.println(i);
		
	}

	public void test() {
		String name = "Silu";
		int age = 11;
		System.out.println(name + " " + age);
	}

	public void wrapper() {
		String s = "O";
		System.out.println(s+20);
	}
}
