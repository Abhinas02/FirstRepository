package javabasics;

public class B extends A {

	public B() {
		super(02, 20);
		System.out.println("default constructor B");
	}

	public B(int i) {
		super(i);
		System.out.println("default constructor B");
	}

	public static void main(String[] args) {

		@SuppressWarnings("unused")
		B b = new B(10);

	}

}
