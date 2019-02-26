package javabasics;

public class JavaBasics1 {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		
		String x = "Hello";
		String y = "World";
		
		double c = 10.33;
		double d = 12.34;
		
		System.out.println(a+b);
		System.out.println(x+y);
		
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		
		System.out.println(x+y+(a+b));
		System.out.println(a+b+x+y+a+x+b+y);
		System.out.println(a+b+x+y+a+b);
		
		System.out.print(c+d);
		
		System.out.println("sum of a and b" +(a+b) + "sum of c nd d" +(c+d)) ;
		
	}
}