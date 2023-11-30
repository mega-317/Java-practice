package java_ex100;

import java.util.Scanner;

public class ex100_99 {
	
	
	
	static void grade(int A) {
		if(A>=90) {
			System.out.println("A학점");
		} else if (A>=80) {
			System.out.println("B학점");
		} else if (A>=70) {
			System.out.println("C학점");
		} else if (A>=60) {
			System.out.println("D학점");
		} else {
			System.out.println("E학점");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		
		grade(A);
	}

}
