package java_ex100;

import java.util.Scanner;

public class ex100_72 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int max;
		int[] input = new int[n];
		
		for(int i=0; i<n; i++) {
			input[i] = scan.nextInt();
		}
		max = input[0];
		
		for(int i=0; i<n-1; i++) {
			if(input[i] < input[i+1]) {
				max = input[i+1];
			}
		}
		System.out.println(max);
	}
}
