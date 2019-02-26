package javabasics;

public class JavaBasics8 {

	String name;
	int age;

	public JavaBasics8(String name, int age) {
		this.name = "Iti";
		System.out.println(name + " " + age);
		name = "Iti";
		age = 25;
		System.out.println(name + " " + age);
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		JavaBasics8 a = new JavaBasics8("Abhinas", 31);

	}

}
