package com.GQT.corejava.patterns;

import java.util.Scanner;

public class Pattern21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count:");
		int n = sc.nextInt();
		int count = 1;
		for (int i =1;i<=n;i++){
			for (int j =1;j<=n-i;j++) {
				System.out.print(count +"     ");
			count = count + 1;
		}
			System.out.println();
	}

}
}