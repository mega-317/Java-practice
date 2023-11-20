package java_ex100;

import java.util.Scanner;

public class ex100_51 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int input = scan.nextInt();
		int a = input / 10;
		int b = input % 10;

		int result = ((b * 10) + a) * 2;
		if (result >= 100) {
			result = result - 100;
		}
		System.out.println(result);
		if (result > 50) {
			System.out.println("OH MY GOD");
		} else {
			System.out.println("GOOD");
		}
	}
}
