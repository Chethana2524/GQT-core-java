/**
 * 
 */
package com.GQT.corejava.patterns;

import java.util.Scanner;

/*
 * - - - - - - - - - # 
   - - - - - - - - # # # 
   - - - - - - - # # # # # 
   - - - - - - # # # # # # # 
   - - - - - # # # # # # # # # 
 

 */
/**
 * @author chethanapatchipala
 * @category patterns
 * @description This is an example for pyramid pattern
 */
public class Pattern39 {

	/**
	 * @param args
	 * @description This contains source code of the pattern
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of size: ");
        int n = sc.nextInt();

        for (int i = 1; i <=n; i++) {
        	 for (int j = n; j >= i; j--) {
        		
        			 System.out.print("- ");
        			 
        		 }
        	 for (int j = 1; j <= 2*i-1; j++) {
         		
    			 System.out.print("# ");
    			 
        	 
        		
        		 }
        	 System.out.println();
        	 }
	}
}
	


