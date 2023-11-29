package java_ex100;

import java.util.Scanner;

public class ex100_78 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num2;
		String op;
		int result = scan.nextInt();

		while (true) {
			op = scan.next();

			if (op.equals("+")) {
				num2 = scan.nextInt();
				result += num2;
			} else if (op.equals("-")) {
				num2 = scan.nextInt();
				result -= num2;
			} else if (op.equals("/")) {
				num2 = scan.nextInt();
				result /= num2;
			} else if (op.equals("*")) {
				num2 = scan.nextInt();
				result *= num2;
			} else if (op.equals("=")) {
				break;
			}
		}
		
		System.out.println(result);
	}
}
