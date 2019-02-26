package oopsbasics;

public class OopsBasics {

	// global variables
	int year;
	int mon;

	public static void main(String[] args) {
		
		OopsBasics a = new OopsBasics();
		OopsBasics b = new OopsBasics();
		OopsBasics c = new OopsBasics();
		
		a.year = 2015;
		a.mon = 01;
		
		b.year = 2016;
		b.mon = 02;
		
		c.year = 2017;
		c.mon = 03;
		
		System.out.println("--------------Before assigning references-----------------");
		
		System.out.print(a.mon);
		System.out.println("/"+a.year);
		
		System.out.print(b.mon);
		System.out.println("/"+b.year);
		
		System.out.print(c.mon);
		System.out.println("/"+c.year);
		
		
		System.out.println("--------------Before assigning references-----------------");

		a=b;
		b=c;
		c=a;
		
		System.out.print(a.mon);
		System.out.println("/"+a.year);
		
		System.out.print(b.mon);
		System.out.println("/"+b.year);
		
		System.out.print(c.mon);
		System.out.println("/"+c.year);
		
		
		
		
	}

}
