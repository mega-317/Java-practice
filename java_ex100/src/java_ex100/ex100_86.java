package java_ex100;

import java.util.Scanner;

public class ex100_86 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		for(int i=0; i<n/2+1; i++) {
			for (int j = n-(2*i+1); j<n; j++) {
				System.out.printf("*");
			}
			System.out.printf("\n");
			
		}
	}
}
