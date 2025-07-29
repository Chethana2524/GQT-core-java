/**
 * 
 */
package com.GQT.corejava.patterns;

import java.util.Scanner;

/**
 * @author chethanapatchipala
 * @category patterns
 * @description This is an example for Alphabet 'A' pattern
 */
public class Pattern41 {
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
	                        i + j == n / 2 ||     
	                        j - i == n / 2 || 
	                        i == n / 2 || 
	                      
	                        		
	                                (i >= 5 && j == 0)||
	                                (i >= 5 && j == n-1))
	            		
	                {
	                    System.out.print("# ");
	                } else {
	                    System.out.print("  ");
	                }
	            }
	            System.out.println(); 
	        }
	 


	        System.out.println("\nAlphabet B:\n");

	        // ---------------- B ----------------
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                if (
	                    j == 0 || i == 0||j==(n-1)||i==(n/2)||i==(n-1)
	                    
	                ) {
	                    System.out.print("# ");
	                } else {
	                    System.out.print("  ");
	                }
	            }
	            System.out.println();
	        }
	        System.out.println("\nAlphabet C:\n");

	        // ---------------- B ----------------
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                if (
	                    j == 0 || i == 0||i==(n-1)
	                    
	                ) {
	                    System.out.print("# ");
	                } else {
	                    System.out.print("  ");
	                }
	            }
	            System.out.println();
	        }
	        System.out.println("\nAlphabet D:\n");

	        // ---------------- B ----------------
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
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
	        System.out.println("\nAlphabet E:\n");

	        // ---------------- B ----------------
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                if (
	                    j == 0 || i == 0||i==(n-1)||i==(n/2)
	                    
	                ) {
	                    System.out.print("# ");
	                } else {
	                    System.out.print("  ");
	                }
	            }
	            System.out.println();
	        }
	        System.out.println("\nAlphabet F:\n");

	        // ---------------- B ----------------
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                if (
	                    j == 0 || i == 0||i==(n/2)
	                    
	                ) {
	                    System.out.print("# ");
	                } else {
	                    System.out.print("  ");
	                }
	            }
	            System.out.println();
	        }
	        System.out.println("\nAlphabet G:\n");

	        // ---------------- B ----------------
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                if (
	                		  i == 0 ||                         
	                          i == n - 1 ||                    
	                          j == 0 ||                        
	                          (i == n/2 && j >= n/2)   ||
	                          (j == n - 1 && i >= n/2) 
	                         
	                    
	                ) {
	                    System.out.print("# ");
	                } else {
	                    System.out.print("  ");
	                }
	            }
	            System.out.println();
	        }
	        System.out.println("\nAlphabet H:\n");

	        // ---------------- B ----------------
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                if (
	                		                          
	                                             
	                          j == 0 ||                        
	                          (i == n/2 )  ||
	                          (j == n - 1 ) 
	                         
	                    
	                ) {
	                    System.out.print("# ");
	                } else {
	                    System.out.print("  ");
	                }
	            }
	            System.out.println();
	        }
	        System.out.println("\nAlphabet I:\n");

	        // ---------------- B ----------------
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                if (
	                		                          
	                                             
	                          i == 0 ||                        
	                          (j == n/2 )  ||
	                          (i == n - 1 ) 
	                         
	                    
	                ) {
	                    System.out.print("# ");
	                } else {
	                    System.out.print("  ");
	                }
	            }
	            System.out.println();
	        }
	        System.out.println("\nAlphabet J:\n");

	        // ---------------- B ----------------
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                if (
	                		                          
	                                             
	                          i == 0 ||                        
	                          (j == n/2 )  ||
	                          (i == n-1&& j <=(n/2) ) 
	                         
	                    
	                ) {
	                    System.out.print("# ");
	                } else {
	                    System.out.print("  ");
	                }
	            }
	            System.out.println();
	        }
	        System.out.println("\nAlphabet K:\n");

	        // ---------------- B ----------------
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                if (
	                		                          
	                                             
	                          j == 0 ||                        
	                          i +j == n/2   ||
	                          i - j == n/2  
	                         
	                    
	                ) {
	                    System.out.print("# ");
	                } else {
	                    System.out.print("  ");
	                }
	            }
	            System.out.println();
	        }
	        System.out.println("\nAlphabet L:\n");

	        // ---------------- B ----------------
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                if (
	                		                          
	                                             
	                          j == 0 || 
	                           i ==(n-1)  
	                          
	                         
	                    
	                ) {
	                    System.out.print("# ");
	                } else {
	                    System.out.print("  ");
	                }
	            }
	            System.out.println();
	        }
	        System.out.println("\nAlphabet M:\n");

	        // ---------------- B ----------------
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                if (
	                		                          
	                                             
	                          j == 0 || 
	                           i ==j && i <=n/2&&j<=n/2  ||i+j==(n-1)&&j>=n/2
	                          ||j==(n-1)
	                         
	                    
	                ) {
	                    System.out.print("# ");
	                } else {
	                    System.out.print("  ");
	                }
	            }
	            System.out.println();
	        }
	        System.out.println("\nAlphabet N:\n");

	        // ---------------- B ----------------
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                if (
	                		                          
	                                             
	                          j == 0 || 
	                           i ==j 
	                          ||j==(n-1)
	                         
	                    
	                ) {
	                    System.out.print("# ");
	                } else {
	                    System.out.print("  ");
	                }
	            }
	            System.out.println();
	        }
	        System.out.println("\nAlphabet O:\n");

	        // ---------------- B ----------------
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                if (
	                		                          
	                                             
	                		i +j==n/2||i-j==(n/2)||i+j==(n-1)+(n/2)||j-i==(n/2)
	                         
	                    
	                ) {
	                    System.out.print("# ");
	                } else {
	                    System.out.print("  ");
	                }
	            }
	            System.out.println();
	        }
	        System.out.println("\nAlphabet P:\n");

	        // ---------------- B ----------------
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                if (
	                		                          
	                                             
	                          j == 0 || 
	                           i ==0
	                          ||i==(n/2)||j==(n-1)&&i<=n/2
	                         
	                    
	                ) {
	                    System.out.print("# ");
	                } else {
	                    System.out.print("  ");
	                }
	            }
	            System.out.println();
	        }
	        System.out.println("\nAlphabet Q:\n");

	        // ---------------- B ----------------
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	            	 if (
	                         i +j==n/2||i-j==(n/2)||i+j==(n-1)+(n/2)||j-i==(n/2)||j==i&&j>n/2
	                     ){
	                    System.out.print("# ");
	                } else {
	                    System.out.print("  ");
	                }
	            }
	            System.out.println();
	        }
	        System.out.println("\nAlphabet R:\n");

	        // ---------------- B ----------------
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	            	 if (
	                        j==n/2||j==0&&j>=n/2||j==(n-1)&&i<=n/2||i==n/2&&j>=n/2||i==j&&j>=n/2
	                        &&i>=n/2||i==0&&j>=n/2
	                     ){
	                    System.out.print("# ");
	                } else {
	                    System.out.print("  ");
	                }
	            }
	            System.out.println();
	        }
	        System.out.println("\nAlphabet S:\n");

	        // ---------------- B ----------------
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	            	 if (
	                        i==n/2||j==0&&i<=n/2||j==(n-1)&&i>=n/2||
	                        i==0||i ==(n-1)
	                     ){
	                    System.out.print("# ");
	                } else {
	                    System.out.print("  ");
	                }
	            }
	            System.out.println();
	        }
	        System.out.println("\nAlphabet T:\n");

	        // ---------------- B ----------------
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	            	 if (
	                        
	                        i==0||j ==(n/2)
	                     ){
	                    System.out.print("# ");
	                } else {
	                    System.out.print("  ");
	                }
	            }
	            System.out.println();
	        }
	        System.out.println("\nAlphabet U:\n");

	        // ---------------- B ----------------
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	            	 if (
	                        
	                        i-j==n/2||j ==0&&i<=n/2||j==n-1&&i<=n/2||i+j==(n-1)+(n/2)
	                     ){
	                    System.out.print("# ");
	                } else {
	                    System.out.print("  ");
	                }
	            }
	            System.out.println();
	        }
	        System.out.println("\nAlphabet V:\n");

	        // ---------------- B ----------------
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	            	 if (
	                        
	                        i==j&&j<=n/2||i +j==n-1&&i<=n/2
	                     ){
	                    System.out.print("# ");
	                } else {
	                    System.out.print("  ");
	                }
	            }
	            System.out.println();
	        }
	        System.out.println("\nAlphabet W:\n");

	        // ---------------- B ----------------
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	            	 if (
	                        
	                        j==0||i+j==(n-1)&&i>=n/2||i==j&&i>=n/2||j==(n-1)
	                     ){
	                    System.out.print("# ");
	                } else {
	                    System.out.print("  ");
	                }
	            }
	            System.out.println();
	        }
	        System.out.println("\nAlphabet X:\n");

	        // ---------------- B ----------------
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	            	 if (
	                        
	                        i==j||i+j==n-1
	                     ){
	                    System.out.print("# ");
	                } else {
	                    System.out.print("  ");
	                }
	            }
	            System.out.println();
	        }
	        System.out.println("\nAlphabet Y:\n");

	        // ---------------- B ----------------
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	            	 if (
	                        
	                        i==j&&j<=n/2||j+i==n-1&&j>=n/2||j==n/2&&i>=n/2
	                     ){
	                    System.out.print("# ");
	                } else {
	                    System.out.print("  ");
	                }
	            }
	            System.out.println();
	        }
	        System.out.println("\nAlphabet Z:\n");

	        // ---------------- B ----------------
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	            	 if (
	                        
	                        i==0||i==n-1||j+i==n-1
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
