package java_ex100;

import java.util.Scanner;

public class ex100_40 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float input;
		input = scan.nextFloat();
		if ( input >= 50 && input <= 60) {
			System.out.println("win");
		} else {
			System.out.println("lose");
		}
	}
}
