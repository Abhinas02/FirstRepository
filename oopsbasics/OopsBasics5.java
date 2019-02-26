package oopsbasics;

public class OopsBasics5 {
	
	int p=10;
	int q=20;

	public static void main(String[] args) {
		int x = 1;
		int y = 2;
		OopsBasics5 obj = new OopsBasics5();
		int d = obj.testSum(x, y);
		System.out.println(d);
		d=obj.testSum(3, 4);
		System.out.println(d);
		

	}
public int testSum (int a, int b) {
	int c=a+b;
	return c;
}
	
	
}
