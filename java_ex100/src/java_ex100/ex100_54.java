package java_ex100;

import java.util.Scanner;

public class ex100_54 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a, b, c;
		a = scan.nextInt();
		b = scan.nextInt();
		if (a % b == 0) {
			c = a / b;
			System.out.printf("%d*%d=%d\n", b, c, a);
		} else if (b % a == 0) {
			c = b / a;
			System.out.printf("%d*%d=%d\n", a, c, b);
		} else {
			System.out.println("none");
		}
	}
}
