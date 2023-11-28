package java_ex100;

import java.util.Scanner;

public class ex100_69 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, d, n, result;
		a = scan.nextInt();
		d = scan.nextInt();
		n = scan.nextInt();

		result = a + ((n - 1) * d);
		
		System.out.println(result);
	}
}
