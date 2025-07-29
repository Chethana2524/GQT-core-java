package com.GQT.corejava.patterns;

import java.util.Scanner;

/**
 * #
 * # #
 * # - #
 * # - - #
 * # # # # #
 */
/**
 * @author chethanapatchipala
 * @category patterns
 * @description This is an example for conditional right angle triangle pattern
 */
public class Pattern38 {

    /**
     * @param args
     * @description This contains source code of the pattern
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of size: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) { 
            for (int j = 0; j <= i; j++) { 
                if (i == n - 1 || j == 0 || j == i) {
                    System.out.print("# ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println(); 
        }

        sc.close();
    }
}
