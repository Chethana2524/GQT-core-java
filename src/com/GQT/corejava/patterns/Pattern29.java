package com.GQT.corejava.patterns;

import java.util.Scanner;

public class Pattern29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

 
        // Lower inverted pyramid
        for (int i = n ; i >= 1; i--) {
            // Print spaces
            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }

            // Print decreasing numbers
            for (int j = 0; j <2*i - 1; j++) {
                System.out.print(i+ " ");
            }


            System.out.println(); // New line
        }

        for (int i = 2; i <= n; i++) {
            for (int j= 0; j <n-i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print(i+"");
            }
            System.out.println();
        }

        sc.close();
    }



}


