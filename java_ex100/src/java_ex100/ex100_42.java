package java_ex100;

import java.util.Scanner;

public class ex100_42 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input;
		input = scan.nextInt();
		if ((input >= 50 && input <= 70) || ((input % 6) == 0)) {
			System.out.println("win");
		} else {
			System.out.println("lose");
		}
	}
}
