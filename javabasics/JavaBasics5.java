package javabasics;

import java.util.ArrayList;

public class JavaBasics5 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		@SuppressWarnings("rawtypes")
		ArrayList a = new ArrayList();
		
		a.add(1);
		a.add(1);
		a.add(1);
		System.out.println(a.size());
		a.add(1);
		a.add(1);
		a.add(1);
		a.add(1);
		a.add(1);
		a.add(1);
		System.out.println(a.size());
		
		for(int i=0; i!=a.size();i++) {
			System.out.println(a.get(i));
		}
			
		
	}

}
