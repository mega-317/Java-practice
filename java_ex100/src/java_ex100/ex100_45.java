package java_ex100;

import java.util.Scanner;

public class ex100_45 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a,b,c;
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		
		double x1 = (-b+Math.sqrt(Math.pow(b, 2)-4*a*c)) / 2*a;
		double x2 = (-b-Math.sqrt(Math.pow(b, 2)-4*a*c)) / 2*a;
		
		if(x1==x2) {
			System.out.printf("방정식의 해는 %.2f\n", x1);
		} else {
			System.out.printf("방정식의 해는 %.2f\n", x1);
			System.out.printf("방정식의 해는 %.2f\n", x2);
		}
	}
}
