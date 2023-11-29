package java_ex100;

import java.util.Scanner;

public class ex100_84 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		for(int i=0; i<n; i++) {
			for (int j = i+1; j<n; j++) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
	}
}
