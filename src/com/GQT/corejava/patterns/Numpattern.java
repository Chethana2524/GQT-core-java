/**
 * 
 */
package com.GQT.corejava.patterns;

import java.util.Scanner;

/**
 * @author chethanapatchipala
 * @category patterns
 * @description This is an example for Number pattern
 */
public class Numpattern {

	/**
     * @param args
     * @description This contains source code of the pattern
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter number of size : ");
	        int n = sc.nextInt();
	        for (int i = 0; i < n; i++) { 
	            for (int j = 0 ; j < n; j++) { 

	    	                if (
	    	                    j == 0 || i == 0||i==(n-1)||j==(n-1)
	    	                    
	    	                ) {
	    	                    System.out.print("# ");
	    	                } else {
	    	                    System.out.print("  ");
	    	                }
	    	            }
	    	            System.out.println();
	    	        }
	        System.out.println("\nNumber 1:\n");

	        // ---------------- B ----------------
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                if (
	                    j == n/2||j+i==n/2||i==n-1
	                    
	                ) {
	                    System.out.print("# ");
	                } else {
	                    System.out.print("  ");
	                }
	            }
	            System.out.println();
	        }
	        System.out.println("\nNumber 2:\n");

	        // ---------------- B ----------------
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                if (
	                    i== 0||j==n-1&&i<=n/2||i==n/2||j==0&&i>=n/2||i==n-1
	                    
	                ) {
	                    System.out.print("# ");
	                } else {
	                    System.out.print("  ");
	                }
	            }
	            System.out.println();
	        }
	        System.out.println("\nNumber 3:\n");

	        // ---------------- B ----------------
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                if (
	                    i== 0||j==n-1||i==n-1||i==n/2
	                    
	                ) {
	                    System.out.print("# ");
	                } else {
	                    System.out.print("  ");
	                }
	            }
	            System.out.println();
	        }
	        System.out.println("\nNumber 4:\n");

	        // ---------------- B ----------------
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                if (
	                   j+ i==n/2||j==n/2||i==n/2
	                    
	                ) {
	                    System.out.print("# ");
	                } else {
	                    System.out.print("  ");
	                }
	            }
	            System.out.println();
	        }
	        System.out.println("\nNumber 5:\n");

	        // ---------------- B ----------------
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                if (
	                  i==0||j==0&&i<=n/2||i==n/2||i==n-1||j==n-1&&i>=n/2
	                    
	                ) {
	                    System.out.print("# ");
	                } else {
	                    System.out.print("  ");
	                }
	            }
	            System.out.println();
	        }
	        System.out.println("\nNumber 6:\n");

	        // ---------------- B ----------------
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                if (
	                  i==0||j==0||i==n/2||i==n-1||j==n-1&&i>=n/2
	                    
	                ) {
	                    System.out.print("# ");
	                } else {
	                    System.out.print("  ");
	                }
	            }
	            System.out.println();
	        }
	        System.out.println("\nNumber 7:\n");

	        // ---------------- B ----------------
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                if (
	                  i==0||j==n-1
	                    
	                ) {
	                    System.out.print("# ");
	                } else {
	                    System.out.print("  ");
	                }
	            }
	            System.out.println();
	        }
	        System.out.println("\nNumber 8:\n");

	        // ---------------- B ----------------
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                if (
	     	              i==n/2||j==0||j==(n-1)||
	     	                        i==0||i ==(n-1)
	     	                     ){
	                    System.out.print("# ");
	                } else {
	                    System.out.print("  ");
	                }
	            }
	            System.out.println();
	        }
	        System.out.println("\nNumber 9:\n");

	        // ---------------- B ----------------
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                if (
	     	              i==n/2||j==(n-1)||
	     	                        i==0||j==0&&i<=n/2
	     	                     ){
	                    System.out.print("# ");
	                } else {
	                    System.out.print("  ");
	                }
	            }
	            System.out.println();
	        }
	        sc.close();
	            }

	}

