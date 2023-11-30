package java_ex100;

import java.util.Scanner;

public class ex100_95 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] alpha = new int[26];
		for (int i = 0; i < 26; i++) {
			alpha[i] = 0;
		}

		String input = scan.nextLine();

		for (int i = 0; i < input.length(); i++) {
			if (Character.compare(input.charAt(i), 'a') == 0) {
				alpha[0]++;
			} else if (Character.compare(input.charAt(i), 'b') == 0) {
				alpha[1]++;
			} else if (Character.compare(input.charAt(i), 'c') == 0) {
				alpha[2]++;
			} else if (Character.compare(input.charAt(i), 'd') == 0) {
				alpha[3]++;
			} else if (Character.compare(input.charAt(i), 'e') == 0) {
				alpha[4]++;
			} else if (Character.compare(input.charAt(i), 'f') == 0) {
				alpha[5]++;
			} else if (Character.compare(input.charAt(i), 'g') == 0) {
				alpha[6]++;
			} else if (Character.compare(input.charAt(i), 'h') == 0) {
				alpha[7]++;
			} else if (Character.compare(input.charAt(i), 'i') == 0) {
				alpha[8]++;
			} else if (Character.compare(input.charAt(i), 'j') == 0) {
				alpha[9]++;
			} else if (Character.compare(input.charAt(i), 'k') == 0) {
				alpha[10]++;
			} else if (Character.compare(input.charAt(i), 'l') == 0) {
				alpha[11]++;
			} else if (Character.compare(input.charAt(i), 'm') == 0) {
				alpha[12]++;
			} else if (Character.compare(input.charAt(i), 'n') == 0) {
				alpha[13]++;
			} else if (Character.compare(input.charAt(i), 'o') == 0) {
				alpha[14]++;
			} else if (Character.compare(input.charAt(i), 'p') == 0) {
				alpha[15]++;
			} else if (Character.compare(input.charAt(i), 'q') == 0) {
				alpha[16]++;
			} else if (Character.compare(input.charAt(i), 'r') == 0) {
				alpha[17]++;
			} else if (Character.compare(input.charAt(i), 's') == 0) {
				alpha[18]++;
			} else if (Character.compare(input.charAt(i), 't') == 0) {
				alpha[19]++;
			} else if (Character.compare(input.charAt(i), 'u') == 0) {
				alpha[20]++;
			} else if (Character.compare(input.charAt(i), 'v') == 0) {
				alpha[21]++;
			} else if (Character.compare(input.charAt(i), 'w') == 0) {
				alpha[22]++;
			} else if (Character.compare(input.charAt(i), 'x') == 0) {
				alpha[23]++;
			} else if (Character.compare(input.charAt(i), 'y') == 0) {
				alpha[24]++;
			} else if (Character.compare(input.charAt(i), 'z') == 0) {
				alpha[25]++;
			}
		}
		int a = 97;
		
		for(int i=0; i<26; i++) {
			System.out.println((char)a + ": " + alpha[i]);
			a++;
		}
	}
}
