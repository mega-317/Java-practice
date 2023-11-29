package java_ex100;

import java.util.Scanner;

public class ex100_89 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int result;

		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				result = i + j;
				if (result == n) {
					System.out.printf("%d %d\n", i, j);
				}
			}
		}
	}
}
