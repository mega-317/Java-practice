package java_ex100;

import java.util.Scanner;

public class ex100_58 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		int max = 0;

		if (a >= b && a >= c) {
			max = a;
		} else if (b > a && b > c) {
			max = b;
		} else if (c > a && c > b) {
			max = c;
		}

		if (max < ((a + b + c) - max)) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}
}
