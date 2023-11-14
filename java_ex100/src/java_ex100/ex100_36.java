package java_ex100;

import java.util.Scanner;

public class ex100_36 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n,m;
		n = scan.nextInt();
		m = scan.nextInt();
		
		for (int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				System.out.printf("%d %d%n", i+1, j+1);
			}
		}
	}
}
