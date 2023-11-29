package java_ex100;

import java.util.Scanner;

public class ex100_76 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n,k;
		n = scan.nextInt();
		k = scan.nextInt();
		double result = Math.pow(n, k);
		
		System.out.println((int)result);
		
	}
}
