package java_ex100;

import java.util.Scanner;

public class ex100_59 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] input = new int[6];
		int bonus;
		int[] my_num = new int[6];
		int count = 0;
		int bonus_win = 0;

		for (int i = 0; i < 6; i++) {
			input[i] = scan.nextInt();
		}
		bonus = scan.nextInt();

		for (int j = 0; j < 6; j++) {
			my_num[j] = scan.nextInt();
		}

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (input[i] == my_num[j]) {
					count++;
				}
			}
		}
		
		if (count == 5) {
			for (int i = 0; i < 6; i++) {
				if (bonus == my_num[i]) {
					bonus_win++;
				}
			}
		}
		
		if (count == 6) {
			System.out.println(1);
		} else if ((count == 5) && (bonus_win == 1)){
			System.out.println(2);
		} else if ((count == 5) && (bonus_win == 0)) {
			System.out.println(3);
		} else if (count == 4) {
			System.out.println(4);
		} else if (count == 3) {
			System.out.println(5);
		} else {
			System.out.println(0);
		}
	}
}
