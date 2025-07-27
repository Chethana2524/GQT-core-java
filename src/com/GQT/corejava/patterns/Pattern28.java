package com.GQT.corejava.patterns;

import java.util.Scanner;

public class Pattern28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        // Top half
        for (int i = 1; i <= n; i++) {
            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }

            System.out.print(i);

            // This loop handles both: 
            // 0 spaces (when i == 1), or
            // spaces in between for i > 1
            for (int space = 1; space <= 2 * i - 3; space++) {
                System.out.print(" ");
            }

            // Print second number only if space loop ran (i.e., i > 1)
            for (int repeat = 1; repeat <= (i - 1); repeat++) {
                System.out.print(i);
                break; // Ensures it prints only once
            }

            System.out.println();
        }

        // Bottom half
        for (int i = n - 1; i >= 1; i--) {
            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }

            System.out.print(i);

            for (int space = 1; space <= 2 * i - 3; space++) {
                System.out.print(" ");
            }

            for (int repeat = 1; repeat <= (i - 1); repeat++) {
                System.out.print(i);
                break;
            }

            System.out.println();
        }

        sc.close();
    }
}
