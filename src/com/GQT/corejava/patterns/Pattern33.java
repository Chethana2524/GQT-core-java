package com.GQT.corejava.patterns;
import java.util.Scanner;

public class Pattern33 {
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
            
            // Print characters in reverse order
            for (char ch = (char) ('A' + 2 * i); ch >= 'A'; ch--) {
                System.out.print(ch);
            }
            
            System.out.println(); // Move to the next line
        }
        
        scanner.close();
    }
}
