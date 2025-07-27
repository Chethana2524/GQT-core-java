package com.GQT.corejava.patterns;

import java.util.Scanner;

public class Pattern34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take input for number of rows
        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();
        
        for (int i = 0; i < n; i++) {
            // Print leading spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            
            // Print decreasing numbers
            for (int j = i; j >= 0; j--) {
                System.out.print(j);
            }
            
            // Print increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            
            System.out.println(); // Move to the next line
        }
        
        scanner.close();
    }
}
