package java_ex100;

import java.util.Scanner;

public class ex100_41 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input;
		input = scan.nextInt();
		if ( (input >= 30 && input <=40) || (input>=60 && input<=70)){
			System.out.println("win");
		} else {
			System.out.println("lose");
		}
	}
}
