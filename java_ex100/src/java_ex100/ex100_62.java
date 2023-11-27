package java_ex100;

import java.util.Scanner;

public class ex100_62 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		int class_num = scan.nextInt();
		int num = scan.nextInt();

		System.out.printf("%d", year);

		if (class_num < 10) {
			System.out.printf("0%d", class_num);
		} else {
			System.out.printf("%d", class_num);
		}

		if (num >= 100) {
			System.out.printf("%d\n", num);
		} else if (num >= 10) {
			System.out.printf("0%d\n", num);
		} else {
			System.out.printf("00%d\n", num);
		}
	}
}
