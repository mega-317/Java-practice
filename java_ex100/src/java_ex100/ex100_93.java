package java_ex100;

import java.util.Scanner;

public class ex100_93 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] input = new String[7];
		int num;
		String result;
		
		for (int i = 0; i<7; i++) {
			input[i] = scan.nextLine();
		}
		
		try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // InterruptedException 처리
            e.printStackTrace();
        }
		
		for(int i=0; i<20; i++) {
			System.out.println();
		}
		
		num = scan.nextInt();
		scan.nextLine();
		
		System.out.println(num + "번째 단어는?");
		result = scan.nextLine();
		
		System.out.println(input[num-1]);
	}
}
