package java_ex100;

import java.util.Scanner;

public class ex100_47 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		if ((((input%4) == 0 ) && ((input%100) != 0)) || ((input%400) == 0)) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}
}
