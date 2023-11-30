package java_ex100;

import java.util.Scanner;

public class ex100_96 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		scan.nextLine();
		String[] name = new String[n];
		int[] grade = new int[n];
		
		for (int i=0; i< n; i++) {
			name[i] = scan.nextLine();
			grade[i] = scan.nextInt();
			scan.nextLine();
		}
		int tmp;
		String tmp_name;
		
		for (int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if (grade[i] < grade[j]) {
					tmp = grade[i];
					tmp_name = name[i];
					
					grade[i] = grade[j];
					name[i] = name[j];
					
					grade[j] = tmp;
					name[j] = tmp_name;
				}
			}
		}
		System.out.println(name[2]);
	}
		
}
