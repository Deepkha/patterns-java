package pattern1.java;

import java.util.Scanner;

public class patten3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<=n;i++) {
			for(int j=n-i;j>=0;j--) {
				System.out.print("*");
			}
			System.out.print("\n");
		}

	}

}
