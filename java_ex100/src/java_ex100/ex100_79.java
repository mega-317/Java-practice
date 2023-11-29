package java_ex100;

import java.util.Scanner;

public class ex100_79 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String input = "";
		String output = "";
		char tmp;

		input = scan.nextLine();

		for (int i = 0; i < input.length(); i++) {
			tmp = input.charAt(i);
			
			if((tmp >= 65) && (tmp <= 90)) {
				output += input.valueOf(tmp).toLowerCase();
			} else if ((tmp>=97)&&(tmp<=122)) {
				output += input.valueOf(tmp).toUpperCase();
			} else {
				output += (char)tmp;
			}
		}
		System.out.println(output);
	}
}
