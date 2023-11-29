package java_ex100;

import java.util.Scanner;

public class ex100_82 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b;
		a = scan.nextInt();
		b = scan.nextInt();

		for (int i = a; i <= b; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d*%d=%d\n", i, j, i * j);
			}
		}
	}
}
