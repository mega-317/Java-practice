package java_ex100;

import java.util.Scanner;

public class ex100_73 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] money = {1, 10, 2, 20, 
					   3, 30, 4, 40, 
					   5, 50, 6, 60, 
					   7, 70, 8, 80, 
					   9, 90, 10, 100, 
					   11, 110, 12, 120};
		
		int k, h;
		k = scan.nextInt();
		h = scan.nextInt();
		
		int result = money[k-1] + money[h-1];
		
		System.out.println(result);
	}
}
