package java_ex100;

import java.util.Scanner;

public class ex100_43 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		
		if (input >= 90000) {
			System.out.print("구만");
			input = input - 90000;
		} else if (input >= 80000) {
			System.out.print("팔만");
			input = input - 80000;
		} else if (input >= 70000) {
			System.out.print("칠만");
			input = input - 70000;
		} else if (input >= 60000) {
			System.out.print("육만");
			input = input - 60000;
		} else if (input >= 50000) {
			System.out.print("오만");
			input = input - 50000;
		} else if (input >= 40000) {
			System.out.print("사만");
			input = input - 40000;
		} else if (input >= 30000) {
			System.out.print("삼만");
			input = input - 30000;
		} else if (input >= 20000) {
			System.out.print("이만");
			input = input - 20000;
		} else if (input >= 10000) {
			System.out.print("일만");
			input = input - 10000;
		}
		
		if (input >= 9000) {
			System.out.print("구천");
			input = input - 9000;
		} else if (input >= 8000) {
			System.out.print("팔천");
			input = input - 8000;
		} else if (input >= 7000) {
			System.out.print("칠천");
			input = input - 7000;
		} else if (input >= 6000) {
			System.out.print("육천");
			input = input - 6000;
		} else if (input >= 5000) {
			System.out.print("오천");
			input = input - 5000;
		} else if (input >= 4000) {
			System.out.print("사천");
			input = input - 4000;
		} else if (input >= 3000) {
			System.out.print("삼천");
			input = input - 3000;
		} else if (input >= 2000) {
			System.out.print("이천");
			input = input - 2000;
		} else if (input >= 1000) {
			System.out.print("일천");
			input = input - 1000;
		}
		
		if (input >= 900) {
			System.out.print("구백");
			input = input - 900;
		} else if (input >= 800) {
			System.out.print("팔백");
			input = input - 800;
		} else if (input >= 700) {
			System.out.print("칠백");
			input = input - 700;
		} else if (input >= 600) {
			System.out.print("육백");
			input = input - 600;
		} else if (input >= 500) {
			System.out.print("오백");
			input = input - 500;
		} else if (input >= 400) {
			System.out.print("사백");
			input = input - 400;
		} else if (input >= 300) {
			System.out.print("삼백");
			input = input - 300;
		} else if (input >= 200) {
			System.out.print("이백");
			input = input - 200;
		} else if (input >= 100) {
			System.out.print("일백");
			input = input - 100;
		}
		
		if (input >= 90) {
			System.out.print("구십");
			input = input - 90;
		} else if (input >= 80) {
			System.out.print("팔십");
			input = input - 80;
		} else if (input >= 70) {
			System.out.print("칠십");
			input = input - 70;
		} else if (input >= 60) {
			System.out.print("육십");
			input = input - 60;
		} else if (input >= 50) {
			System.out.print("오십");
			input = input - 50;
		} else if (input >= 40) {
			System.out.print("사십");
			input = input - 40;
		} else if (input >= 30) {
			System.out.print("삼십");
			input = input - 30;
		} else if (input >= 20) {
			System.out.print("이십");
			input = input - 20;
		} else if (input >= 10) {
			System.out.print("일십");
			input = input - 10;
		}
		
		if (input >= 9) {
			System.out.print("구");
			input = input - 9;
		} else if (input >= 8) {
			System.out.print("팔");
			input = input - 8;
		} else if (input >= 7) {
			System.out.print("칠");
			input = input - 7;
		} else if (input >= 6) {
			System.out.print("육");
			input = input - 6;
		} else if (input >= 5) {
			System.out.print("오");
			input = input - 5;
		} else if (input >= 4) {
			System.out.print("사");
			input = input - 4;
		} else if (input >= 3) {
			System.out.print("삼");
			input = input - 3;
		} else if (input >= 2) {
			System.out.print("이");
			input = input - 2;
		} else if (input >= 1) {
			System.out.print("일");
			input = input - 1;
		}
	}
}
