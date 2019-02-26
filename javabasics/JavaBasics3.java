package javabasics;

public class JavaBasics3 {

	public static void main(String[] args) {

		// while loop

		int i = 1;
		while (i != 10) {
			System.out.print(i + " ");
			i++;
		}

		System.out.println();
		System.out.println("-------------------------------------------");

		for (int j = 1; j <= 10; j++) {
			System.out.print(j + " ");
		}
		System.out.println();
		System.out.println("-------------------------------------------");

		int a = 1;
		int b = a++;
		int c = --b;
		int d = c++;
		int e = d--;

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}

}
