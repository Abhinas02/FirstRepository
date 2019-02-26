package oopsbasics;

public class OopsBasics1 {

	public static void main(String[] args) {
			OopsBasics1 d = new OopsBasics1();
			d.test();
			//int e = 
					d.test1();
			//System.out.println(e);
			//int f = 
					d.test2(1,2);
			//System.out.println(f);
			
			
	}
	
	public void test() {
		System.out.println("test method");
	}
	public int test1() {
		int a=1;
		int b=2;
		int c = a+b;
		//System.out.println("test method");
		System.out.println(c);
		return c;
	}
	public int test2(int x, int y) {
		//System.out.println("test method");
		System.out.println(x+","+y);
		int z=x/y;
		return z;
		
	}
	
		}
