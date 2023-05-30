package pattern1.java;
import java.util.Scanner;

public class patten1 {
	public static void main(String args[]) {
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}
