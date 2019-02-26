package javabasics;

public class JavaBasics4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i[] = new int[4];

		i[0] = 1;
		i[1] = 2;
		i[2] = 3;
		i[3] = 4;

		for (int j = 0; j != i.length; j++) {
			System.out.print(i[j] + " ");
		}
		System.out.println();
		System.out.println("-------------------------------------------");

		char c[] = new char[7];
		c[0] = 'A';
		c[1] = 'B';
		c[2] = 'H';
		c[3] = 'I';
		c[4] = 'N';
		c[5] = 'A';
		c[6] = 'S';

		for (int k = 0; k != c.length; k++) {
			System.out.print(c[k]);
		}
		int a = 5;
		int b = 5;
		int n = 0;
		Object obj[][] = new Object[a][b];
		System.out.println();
		System.out.println("-------------------------------------------");

		for (int l = 0; l != obj.length; l++) {
			for (int m = 0; m != obj[0].length; m++) {
				System.out.print(n+" ");
				n++;
			}
			System.out.println();
		}
	}
}