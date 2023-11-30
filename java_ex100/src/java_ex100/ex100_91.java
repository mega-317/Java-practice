package java_ex100;

import java.util.Scanner;

public class ex100_91 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int[] a = new int[n];
		int tmp;

		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("%d ", a[j]);
			}
			System.out.println("\n");
			tmp = a[0];
			for (int k = 0; k < n - 1; k++) {
				a[k] = a[k + 1];
			}
			a[n-1] = tmp;
		}
	}
}
