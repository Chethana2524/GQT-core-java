/**
 * 
 */
package com.GQT.corejava.patterns;

import java.util.Scanner;

/**
 * @author chethanapatchipala
 * @category patterns
 * @description This is an example for Name pattern
 */
public class Namepattern {

	/**
     * @param args
     * @description This contains source code of the pattern
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the size : ");
	        int n = sc.nextInt();

	        System.out.println("\nPattern for NAME :\n");
		 for (int i = 0; i < n; i++) {
	            // ----- C -----
	            for (int j = 0; j < n; j++) {
	                if (i == 0 || i == n - 1 || j == 0) {
	                    System.out.print("# ");
	                } else {
	                    System.out.print("  ");
	                }
	            }
	            System.out.print("  "); // Space between letters

	            // ----- H -----
	            for (int j = 0; j < n; j++) {
	                if (j == 0 || j == n - 1 || i == n / 2) {
	                    System.out.print("# ");
	                } else {
	                    System.out.print("  ");
	                }
	            }
	            System.out.print("  ");

	         // ----- E -----
	            for (int j = 0; j < n; j++) {
	                if (i == 0 || i == n - 1 || i == n / 2 || j == 0) {
	                    System.out.print("# ");
	                } else {
	                    System.out.print("  ");
	                }
	            }

	            System.out.print(" ");
	            // ---------------- T ----------------
		            for (int j = 0; j < n; j++) {
		            	 if (
		                        
		                        i==0||j ==(n/2)
		                     ){
		                    System.out.print("# ");
		                } else {
		                    System.out.print("  ");
		                }
		            }
		            System.out.print(" ");
		         // ---------------- H ----------------
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
			            System.out.print(" ");
			            // ---------------- A ----------------
			            for (int j = 0 ; j < n; j++) { 
			            	if (
			            			 i + j == n / 2 ||     
				                        j - i == n / 2 || 
				                        i == n / 2 || 
				                      
				                        		
				                                (i >= 5 && j == 0)||
				                                (i >= 5 && j == 10))
				            		
			                {
			                    System.out.print("# ");
			                } else {
			                    System.out.print("  ");
			                }
			            }
			            System.out.print("") ;
			            // ---------------- N ----------------
				        
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
				            System.out.print(" ");
				            for (int j = 0 ; j < n; j++) { 
				            	if (
				                        i + j == n / 2 ||     
				                        j - i == n / 2 || 
				                        i == n / 2 || 
				                      
				                        		
				                                (i >= 5 && j == 0)||
				                                (i >= 5 && j == 10))
				            		
				                {
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