package com.GQT.corejava.patterns;
import java.util.Scanner;

public class Pattern35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number of rows : ");
	        int n = sc.nextInt();

	        for (int i = 0; i < n; i++) {
	            // Print leading spaces
	            for (int space = 0; space < n - i - 1; space++) {
	                System.out.print(" ");
	            }

	            // Print descending characters
	            char ch = (char) ('A' + i);
	            for (int j = 0; j <= i; j++) {
	                System.out.print((char)(ch - j));
	            }

	            // Print ascending characters (skip first to avoid repeating middle)
	            for (int j = 1; j <= i; j++) {
	                System.out.print((char)('A' + j));
	            }

	            System.out.println();
	        }

	        sc.close();
	    }
	}
