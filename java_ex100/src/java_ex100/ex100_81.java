package java_ex100;

import java.util.Scanner;

public class ex100_81 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] a = new int[5];
		for (int i =0; i<5; i++) {
			a[i] = scan.nextInt();
		}
		
		int max = a[0];
		int min = a[0];
		
		for (int i =0; i<5; i++) {
			if (a[i] > max) {
				max = a[i];
			}
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
	}
}
