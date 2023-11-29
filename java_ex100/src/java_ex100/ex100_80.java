package java_ex100;

import java.util.Scanner;

public class ex100_80 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String input = scan.nextLine();
		String output = "";
		char tmp;

		for (int i = 0; i < input.length(); i++) {
			tmp = input.charAt(i);
			int n = tmp;
			
			if (n == 65) {
				n = 88;
			} else if (n == 66) {
				n = 89;
			} else if (n == 67) {
				n = 90;
			} else {
				n = n - 3;
			}
			
			tmp = (char)n;
			output += input.valueOf(tmp);
		}
		System.out.println(output);
	}
}
