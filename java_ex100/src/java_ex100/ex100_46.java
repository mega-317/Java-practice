package java_ex100;

import java.util.Scanner;

public class ex100_46 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a,b,c;
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		if (a<= 170) {
			System.out.println("CRASH");
		} else {
			System.out.println("PASS");
		}
		if (b<= 170) {
			System.out.println("CRASH");
		} else {
			System.out.println("PASS");
		}
		if (c<= 170) {
			System.out.println("CRASH");
		} else {
			System.out.println("PASS");
		}
	}
}
