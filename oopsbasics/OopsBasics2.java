package oopsbasics;

public class OopsBasics2 {

	String name = "Abhinas";
	int age = 31;
	
	
	
	public static void main(String[] args) {

		String name = "Abhinas";
		int age = 21;
		System.out.println(name+" "+age);
		
		System.out.println("---------------------");
		
		OopsBasics2 a = new OopsBasics2();
		
		System.out.println(a.name+" "+a.age);
		System.out.println("---------------------");
		a.test();
		
	}
	
	public void test() {
		String name = "Abhinas";
		int age = 11;
		System.out.println(name+" "+age);
		
	}

}
