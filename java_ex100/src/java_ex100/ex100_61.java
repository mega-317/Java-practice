package java_ex100;

import java.util.Scanner;

public class ex100_61 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		char b = scan.next().charAt(0);
		int c = scan.nextInt();
		float result = 0;

		switch (b) {
		case ('+'):
			System.out.println(a + c);
			break;
		case ('-'):
			System.out.println(a - c);
			break;
		case ('*'):
			System.out.println(a * c);
			break;
		case ('/'):
			if (c == 0) {
				System.out.println("error");
				break;
			} else {
				result = a / c;
				System.out.printf("%02f\n", result);
				break;
			}
		}
	}
}
