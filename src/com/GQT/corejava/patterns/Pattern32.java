package com.GQT.corejava.patterns;

import java.util.Scanner;

public class Pattern32 {
    public static void main(String[] args) {
    	  Scanner sc = new Scanner(System.in);
          System.out.print("Enter number of rows: ");
          int n = sc.nextInt();

          for (int i = 1; i <= n; i++) {
              // Print leading spaces
              for (int j = 1; j <= n - i; j++) {
                  System.out.print(" ");
              }

              // Get the character for this row
              char ch = (char) ('A' + i - 1);

              // Print the same character (2*i - 1 times)
              for (int j = 1; j <= 2 * i - 1; j++) {
                  System.out.print(ch);
              }

              System.out.println();
          }

          sc.close();
      }
  }