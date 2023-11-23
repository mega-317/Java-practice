package java_ex100;

import java.util.Scanner;

public class ex100_57 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int result = 0;
		int input;
		for (int i = 0; i < 2; i++) {
			input = scan.nextInt();
			if (input == 1) {
				result = result + 400;
			} else if (input == 2) {
				result = result + 340;
			} else if (input == 3) {
				result = result + 170;
			} else if (input == 4) {
				result = result + 100;
			} else if (input == 5) {
				result = result + 70;
			}
		}
		if (result > 500) {
			System.out.println("angry");
		} else {
			System.out.println("no angry");
		}
	}
}
