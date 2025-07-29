/**
 * 
 */
package com.GQT.corejava.patterns;
import java.util.Scanner;

/**
 * @author chethanapatchipala
 * @category patterns
 * @description This is an example for Messege pattern
 */
public class MssgPattern {

	/**
     * @param args
     * @description This contains source code of the pattern
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            // L
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == n - 1)
                    System.out.print("# ");
                else
                    System.out.print("  ");
            }
            System.out.print("   ");

            // E
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == 0 || i == n / 2 || i == n - 1)
                    System.out.print("# ");
                else
                    System.out.print("  ");
            }
            System.out.print("   ");

            // A
            for (int j = 0; j < n; j++) {
                if ((j == 0 || j == n - 1) && i != 0 || i == 0 && j > 0 && j < n - 1 || i == n / 2)
                    System.out.print("# ");
                else
                    System.out.print("  ");
            }
            System.out.print("   ");

            // R
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == 0 || i == n / 2 || j == n - 1 && i <= n / 2 || i - j == n / 2)
                    System.out.print("# ");
                else
                    System.out.print("  ");
            }
            System.out.print("   ");

            // N
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n - 1 || i == j)
                    System.out.print("# ");
                else
                    System.out.print("  ");
            }
            System.out.print("   ");

            // A
            for (int j = 0; j < n; j++) {
                if ((j == 0 || j == n - 1) && i != 0 || i == 0 && j > 0 && j < n - 1 || i == n / 2)
                    System.out.print("# ");
                else
                    System.out.print("  ");
            }
            System.out.print("   ");

            // N
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n - 1 || i == j)
                    System.out.print("# ");
                else
                    System.out.print("  ");
            }
            System.out.print("   ");

            // D
            for (int j = 0; j < n; j++) {
                if (j == 0 || (j == n - 1 && i != 0 && i != n - 1) || (i == 0 || i == n - 1) && j < n - 1)
                    System.out.print("# ");
                else
                    System.out.print("  ");
            }
            System.out.print("   ");

            // & (simple X pattern)
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1)
                    System.out.print("# ");
                else
                    System.out.print("  ");
            }
            System.out.print("   ");

            // G
            for (int j = 0; j < n; j++) {
                if ((i == 0 && j > 0) || j == 0 && i != 0 && i != n - 1 || i == n - 1 && j > 0 || j == n - 1 && i >= n / 2 || i == n / 2 && j >= n / 2)
                    System.out.print("# ");
                else
                    System.out.print("  ");
            }
            System.out.print("   ");

            // R
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == 0 || i == n / 2 || j == n - 1 && i <= n / 2 || i - j == n / 2)
                    System.out.print("# ");
                else
                    System.out.print("  ");
            }
            System.out.print("   ");

            // O
            for (int j = 0; j < n; j++) {
                if (i == 0 && j != 0 && j != n - 1 || i == n - 1 && j != 0 && j != n - 1 || j == 0 && i != 0 && i != n - 1 || j == n - 1 && i != 0 && i != n - 1)
                    System.out.print("# ");
                else
                    System.out.print("  ");
            }
            System.out.print("   ");

            // W
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n - 1 || i == j && i >= n / 2 || i + j == n - 1 && i >= n / 2)
                    System.out.print("# ");
                else
                    System.out.print("  ");
            }

            System.out.println();
        }

        sc.close();
    }
}
