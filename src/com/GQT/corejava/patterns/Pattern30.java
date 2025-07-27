package com.GQT.corejava.patterns;
import java.util.Scanner;

public class Pattern30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            // Print spaces to center-align the pyramid
            for (int space = 1; space <= n - i; space++) {
                System.out.print("  ");
            }

            // Print increasing numbers from 1 to i
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }

            // Print decreasing numbers from i-1 to 1
            for (int j = i - 1; j >= 1; j--) {
                System.out.print("*" + " ");
            }

            System.out.println(); // Move to next line
        }

        sc.close();
    }
}
