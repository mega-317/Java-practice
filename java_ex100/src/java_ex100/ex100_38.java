package java_ex100;

import java.util.Scanner;

public class ex100_38 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b;
		a = scan.nextInt();
		b = scan.nextInt();
		
		float result;
		result = (float)(a*b)/2;
		System.out.printf("%.1f", result);
	}
}
