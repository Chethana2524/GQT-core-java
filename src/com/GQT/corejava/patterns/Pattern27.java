package com.GQT.corejava.patterns;
import java.util.Scanner;
public class Pattern27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number of rows: ");
	        int n = sc.nextInt();

	        // Upper pyramid
	        for (int i = 1; i <= n; i++) {
	            // Print spaces
	            for (int space = 1; space <= n - i; space++) {
	                System.out.print("  ");
	            }

	            // Print increasing numbers from 1 to i
	            for (int j = 1; j <= i; j++) {
	                System.out.print(j + " ");
	            }

	            // Print decreasing numbers from i-1 to 1
	            for (int j = i - 1; j >= 1; j--) {
	                System.out.print(j + " ");
	            }

	            System.out.println(); // New line
	        }

	        // Lower inverted pattern with repeating numbers
	        for (int i = n - 1; i >= 1; i--) {
	            // Print spaces
	            for (int space = 1; space <= n - i; space++) {
	                System.out.print("  ");
	            }

	            // Print number i (2*i - 1) times
	            for (int j = 1; j <= 2 * i - 1; j++) {
	                System.out.print(i + " ");
	            }

	            System.out.println(); // New line
	        }

	        sc.close();
	    }
	}