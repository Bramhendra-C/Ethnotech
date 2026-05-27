package CODE;

import java.util.Scanner;
public class LeftAngle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Q3 . Using loops print the left angle triangle
		Scanner sc = new Scanner(System.in);
		System.out.print("Eneter left angle triablge size : ");
		int n = sc.nextInt();
		System.out.println();
		LeftAgle(n);
	}
	static void LeftAgle(int n){
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++) System.out.print("*");
			System.out.println();
		}
	}

}
