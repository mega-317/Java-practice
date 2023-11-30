package java_ex100;

import java.util.Scanner;

public class ex100_98 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int[][] result  = new int[10][10];
		
		for(int i =0; i<10; i++) {
			for(int j =0; j<10; j++) {
				result[i][j] = 0;
			}
		}
		
		int x,y;
		
		for(int i=0; i<n; i++) {
			System.out.printf("X:");
			x = scan.nextInt();
			System.out.printf("Y:");
			y = scan.nextInt();
			result[x-1][y-1] = 1;
		}
		
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				System.out.printf("%d ", result[i][j]);
			}
			System.out.println();
		}
	}

}
