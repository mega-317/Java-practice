package java_ex100;

import java.util.Scanner;

public class ex100_49 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int hour = scan.nextInt();
		int min = scan.nextInt();
		
		if (min >= 30) {
			System.out.print(hour + " ");
			System.out.println(min-30);
		} else if (hour > 1){
			System.out.print(hour - 1 + " ");
			System.out.println(min + 30);
		} else {
			System.out.print("12 ");
			System.out.println(min + 30);
		}
	}
}
