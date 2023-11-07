package java_ex100;
import java.util.Scanner;

public class ex100_20 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		float result = (a+b+c) / 3;
		
		System.out.println(a+b+c);
		System.out.printf("%.1f", result);
	}
}
