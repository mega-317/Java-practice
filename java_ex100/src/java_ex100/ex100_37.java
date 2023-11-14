package java_ex100;

import java.util.Scanner;

public class ex100_37 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		for (int i=0; i<input; i++) {
			System.out.println();
			for (int j=0; j<input; j++) {
				System.out.print("*");
			}
		}
	}
}
