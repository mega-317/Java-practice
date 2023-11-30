package java_ex100;

import java.util.Scanner;

public class ex100_97 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n, c;
		n = scan.nextInt();
		c = scan.nextInt();

		int[] stu = new int[n];

		for (int i = 0; i < n; i++) {
			stu[i] = scan.nextInt();
		}

		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				int tmp;
				if (stu[i] > stu[j]) {
					tmp = stu[i];
					stu[i] = stu[j];
					stu[j] = tmp;
				}
			}
		}

		int a = 1;

		for (int i = 0; i < n; i++) {
			System.out.printf("%d ", stu[i]);
			if (a == c) {
				System.out.println();
				a = 0;
			}
			a++;
		}
	}
}
