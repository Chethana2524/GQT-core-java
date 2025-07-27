package com.GQT.corejava.patterns;
import java.util.Scanner;
public class Pattern24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter number of rows: ");
		        int rows = sc.nextInt();

		        for (int i = 1; i <= rows; i++) {
		            for (int j = rows - i; j > 0; j--) {
		                System.out.print(" ");
		            }
		            for (int k = 1; k <= 2 * i - 1; k++) {
		                System.out.print(i);
		            }
		            System.out.println();
		        }

		        sc.close();
		    }
	


	}


