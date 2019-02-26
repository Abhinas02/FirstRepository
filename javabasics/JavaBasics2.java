
package javabasics;

public class JavaBasics2 {

	public static void main(String[] args) { // TODO Auto-generated method stub

		int a = 10;
		int b = 20;
		int c = 11;
		int d = 12;

		if (a < b) {
			System.out.println("True");
		} else if (b > a) {

			System.out.println("True");
		} else if (a != b) {
			System.out.println("True");
		} else {
			System.out.println("false");
		}

		if (a > b & a > c & a > d) {
			System.out.println(a + " is greatest");
		} else if (b > c & b > d) {
			System.out.println(b + " is greatest");
		} else if (c > d) {
			System.out.println(c + " is greatest");
		} else {
			System.out.println(d + " is greatest");
		}
	}
}
