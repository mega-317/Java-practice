package java_ex100;

import java.util.Scanner;

public class ex100_75 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		boolean prime = true;

		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				prime = false;
				break;
			}
		}
		if(prime == true) {
			System.out.println("prime");
		} else {
			System.out.println("not Prime");
		}
	}
}
