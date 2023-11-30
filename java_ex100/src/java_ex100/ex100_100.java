package java_ex100;

import java.util.Random;
import java.util.Scanner;

public class ex100_100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random random = new Random();

		int answer = random.nextInt(100) + 1;

		while (true) {
			System.out.println("번호를 입력하세요.");
			int input = scan.nextInt();

			if (input == answer) {
				System.out.println("정답입니다.");
				break;
			} else if (input > answer) {
				System.out.println("번호가 정답보다 큽니다.");
			} else if (input < answer) {
				System.out.println("번호가 정답보다 작습니다.");
			}
		}
	}

}
