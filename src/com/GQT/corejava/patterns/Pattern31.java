package com.GQT.corejava.patterns;
import java.util.Scanner;

public class Pattern31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number of rows: ");
	        int n = sc.nextInt();

	        for (int i = 1; i <= n; i++) {
	            // Print leading spaces
	            for (int j = 1; j <= n - i; j++) {
	                System.out.print(" ");
	            }

	            // Print stars (2*i - 1 times)
	            for (int j = 1; j <= 2 * i - 1; j++) {
	                System.out.print("*");
	            }

	            System.out.println(); // Move to next line
	        }

	        sc.close();
	    }
	}

