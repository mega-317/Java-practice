package java_ex100;

import java.util.Scanner;

public class ex100_35 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int result = 0;
		
		for (int i=1; i<=input; i++) {
			if ((i % 2) ==0) { 
				result = result + i;
			}
		}
		System.out.println(result);
	}
}
