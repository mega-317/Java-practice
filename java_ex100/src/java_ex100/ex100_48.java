package java_ex100;

import java.util.Scanner;

public class ex100_48 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int birth = scan.nextInt();
		int s = scan.nextInt();
		
		int birth_result = birth/10000;
		if (s == 1 || s == 2) {
			birth_result = 1900 + birth_result;
			System.out.println(2018-birth_result+1);
		} else if (s == 3 || s == 4) {
			birth_result = 2000 + birth_result;
			System.out.println(2018-birth_result+1);
		}
	}
}
