package java_ex100;

import java.util.Scanner;

public class ex100_94 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = new String[3];

        input[0] = scan.nextLine().trim().replaceAll("\\s+", "");
        input[1] = scan.nextLine().trim().replaceAll("\\s+", "");
        input[2] = scan.nextLine().trim().replaceAll("\\s+", "");

        for (int i = 0; i < 3; i++) {
            System.out.println(input[i]);
        }
    }
}

