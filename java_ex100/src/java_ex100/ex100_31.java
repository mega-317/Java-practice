package java_ex100;

import java.util.Scanner;

public class ex100_31 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		
		if ( score >= 90 && score <= 100) {
			System.out.println("A");
		} else if (score>=70 && score<90 ) {
			System.out.println("B");
		} else if (score>=40 && score<70 ) {
			System.out.println("C");
		} else if (score>=0 && score<40 ) {
			System.out.println("D");
		}
	}
}
