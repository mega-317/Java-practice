package java_ex100;

import java.util.Scanner;

public class ex100_70 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a, r, n;
		double result;

		a = scan.nextInt();
		r = scan.nextInt();
		n = scan.nextInt();

		result = a * Math.pow(r, n-1);
		System.out.println((int)result);
	}
}
