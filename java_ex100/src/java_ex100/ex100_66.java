package java_ex100;

import java.util.Scanner;

public class ex100_66 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int sum =0;
		int i=0;
		
		while(true) {
			if(input <= sum) {
				break;
			} else {
				i++;
				sum = sum + i;
			}
		}
		
		System.out.println(sum);
	}
}
