package java_ex100;

import java.util.Scanner;

public class ex100_67 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		
		while(true) {
			if(input == 1) {
				System.out.println(input);
				break;
			} else {
				System.out.println(input);
				input --;
			}
		}
	}
}
