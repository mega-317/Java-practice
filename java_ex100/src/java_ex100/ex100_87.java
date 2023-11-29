package java_ex100;

import java.util.Scanner;

public class ex100_87 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		for(int i=0; i<n-1; i++) {
			System.out.printf("*");
		}
		System.out.printf("\n");
		
		for(int i=0; i<n-2; i++) {
			System.out.println("*");
		}
		
		for(int i=0; i<n-1; i++) {
			System.out.printf("*");
		}
		System.out.printf("\n");
	}
}
