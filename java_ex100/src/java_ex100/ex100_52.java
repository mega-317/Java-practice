package java_ex100;

import java.util.Scanner;

public class ex100_52 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int result = input;

		if (input > 10 && input < 20) {
			result = 0;
		} else if (input > 20 && input < 30) {
			result = input - 20;
		} else if (input > 30 && input < 40) {
			result = input - 30;
		} else if (input > 40 && input < 50) {
			result = input - 40;
		} else if (input > 50 && input < 60) {
			result = input - 50;
		} else if (input > 60 && input < 70) {
			result = input - 60;
		} else if (input > 70 && input < 80) {
			result = input - 70;
		} else if (input > 80 && input < 90) {
			result = input - 80;
		} else if (input > 90 && input < 100) {
			result = input - 90;
		}

		if (result == 1) {
			System.out.printf("%dst\n", input);
		} else if (result == 2) {
			System.out.printf("%dnd\n", input);
		} else if (result == 3) {
			System.out.printf("%drd\n", input);
		} else {
			System.out.printf("%dth\n", input);
		}
	}
}
