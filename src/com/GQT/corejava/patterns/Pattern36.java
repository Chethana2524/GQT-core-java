package com.GQT.corejava.patterns;
import java.util.Scanner;
public class Pattern36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number of rows: ");
	        int n = sc.nextInt();

	        for (int i = 0; i < n; i++) {
	            // Print leading spaces
	            for (int space = 0; space < n - i - 1; space++) {
	                System.out.print(" ");
	            }

	            // Print first half: A to (A + i)
	            for (int j = 0; j <= i; j++) {
	                System.out.print((char)('A' + j));
	            }

	            // Print second half: A to (A + i - 1)
	            for (int j = 0; j < i; j++) {
	                System.out.print((char)('A' + j));
	            }

	            System.out.println();
	        }

	        sc.close();
	    }
	}

