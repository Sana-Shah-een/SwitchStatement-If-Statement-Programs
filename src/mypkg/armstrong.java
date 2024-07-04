package mypkg;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
//		java.util.Scanner in = new Scanner(System.in);
//		int n=in.nextInt();
//		boolean ans=isarmstrong(n);
//		System.out.println(ans);
		for(int i=100;i<1000;i++) {
			if(isarmstrong(i)) {
				System.out.print(i + " ");
			}
		}
	}
	static boolean isarmstrong(int n) {
		int org=n;
		int sum=0;
		while (n>0) {
			int rem=n%10;
			n=n/10;
			sum=sum+rem*rem*rem;
		}
		return sum==org;
	}
}
