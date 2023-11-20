package java_ex100;

import java.util.Scanner;

public class ex100_53 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b;
		a = scan.nextInt();
		b = scan.nextInt();

		double result_1 = a + b;
		double result_2;

		if (a - b > b - a) {
			result_2 = a - b;
		} else
			result_2 = b - a;

		double result_3 = a * b;
		double result_4;

		if (a / b > b / a) {
			result_4 = a / b;
		} else
			result_4 = b / a;

		double result_5;

		if (Math.pow(a, b) > Math.pow(b, a)) {
			result_5 = Math.pow(a, b);
		} else
			result_5 = Math.pow(b, a);
		
		double MAX = result_1;
		if(result_2 > MAX) {
			MAX = result_2;
		}
		if(result_3 > MAX) {
			MAX = result_3;
		}
		if(result_4 > MAX) {
			MAX = result_4;
		}
		if(result_5 > MAX) {
			MAX = result_5;
		}
		
		System.out.println(MAX);
	}
}
