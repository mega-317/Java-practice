package java_ex100;

import java.util.Scanner;

public class ex100_88 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int result = 0;
		
		for(int i=1; i<=n; i++) {
			for(int j = 1; j<=i; j++) {
				result = result + j;
			}
		}
		System.out.println(result);
	}
}
