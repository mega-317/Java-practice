package java_ex100;

import java.util.Scanner;

public class ex100_56 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input;
		int count = 0;

		for (int i = 0; i < 4; i++) {
			input = scan.nextInt();
			if (input == 1) {
				count++;
			}
		}
		
		if ( count == 4) {
			System.out.println("윷");
		} else if (count == 3) {
			System.out.println("걸");
		} else if (count == 2) {
			System.out.println("개");
		} else if (count == 1) {
			System.out.println("도");
		} else if (count == 0 ) {
			System.out.println("모");
		}
	}
}
