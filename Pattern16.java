package pattern16;

import java.util.Scanner;

public class Pattern16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count:");
		int n = sc.nextInt();
		int count;
		for (int i =1;i<=n;i++){
			for (int j =1;j<=i;j++) {
				count = j;
				System.out.print(count +"  ");
			count = count + 1;
		}
			System.out.println();
	}

}
}



