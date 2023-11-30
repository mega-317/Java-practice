package java_ex100;

import java.util.Scanner;

public class ex100_92 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] input = new int[10];
		int num;
		int result;
		
		for (int i = 0; i<10; i++) {
			input[i] = scan.nextInt();
		}
		
		try {
			Thread.sleep(3000);
		} catch(Exception e) {}
		
		for(int i=0; i<20; i++) {
			System.out.println();
		}
		
		num = scan.nextInt();
		
		System.out.println(num + "번째 숫자는?");
		result = scan.nextInt();
		
		System.out.println(input[num-1]);
	}
}
