package CODE;

import java.util.*;
public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Q2 . Using Loops print the pattren Pyramid
		Scanner sc = new Scanner(System.in);
		System.out.print("Eneter pyramid size : ");
		int n = sc.nextInt();
		System.out.println();
		PyramidPat(n);
		System.out.println();
	}
	static void PyramidPat(int n){
		for(int i=1;i<=n;i++){
			for(int j=0;j<=n-i;j++) System.out.print(" ");
			for(int j=1;j<=2 * i -1;j++) System.out.print("*");
			System.out.println();
		}
	}
}
