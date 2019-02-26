package javabasics;

public class JavaBasics7 {

	public JavaBasics7() {
		System.out.println("Default Content");
	}

	public JavaBasics7(int i) {
		System.out.println(i);
	}

	public JavaBasics7(int i, int j) {
		System.out.println(i + j);
	}

	public static void main(String[] args) {

		@SuppressWarnings("unused")
		JavaBasics7 a = new JavaBasics7();
		@SuppressWarnings("unused")
		JavaBasics7 b = new JavaBasics7(10);
		@SuppressWarnings("unused")
		JavaBasics7 c = new JavaBasics7(10, 20);

	}
}