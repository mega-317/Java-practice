package java_ex100;

import java.util.Scanner;

public class ex100_71 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int input;
		int result = 0;
		
		for(int i=0; i<n; i++) {
			input = scan.nextInt();
			result = result + input;
		}
		
		System.out.println(result);
	}
}
