package java_ex100;
import java.util.Scanner;
import java.lang.Math;

public class ex100_21 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		double result = a*Math.pow(2, b);
		
		System.out.println((int)result);
	}
}
