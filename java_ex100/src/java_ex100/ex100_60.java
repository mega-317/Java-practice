package java_ex100;

import java.util.Scanner;

public class ex100_60 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int crash = 0;

		if (a <= 170) {
			crash = 1;
		} else if (b <= 170) {
			crash = 2;
		} else if (c <= 170) {
			crash = 3;
		}

		if (crash == 0) {
			System.out.println("pass");
		} else if (crash == 1) {
			System.out.printf("CRASH %d\n", a);
		} else if (crash == 2) {
			System.out.printf("CRASH %d\n", b);
		} else if (crash == 3) {
			System.out.printf("CRASH %d\n", c);
		}
	}
}
