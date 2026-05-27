import java.util.Scanner;
class Day1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Eneter ele uints : ");
		int units = sc.nextInt();
		System.out.println("Electricty bill " + eleBill(units));
		System.out.println();
		
		System.out.print("Eneter pyramid size : ");
		int n = sc.nextInt();
		System.out.println();
		PyramidPat(n);
		System.out.println();
		
		System.out.print("Eneter left angle triablge size : ");
		n = sc.nextInt();
		System.out.println();
		LeftAgle(n);
	}
	static int eleBill(int units){
		return ((units > 250) & true) ? units - 250 : 0;
	}
	static void PyramidPat(int n){
		for(int i=1;i<=n;i++){
			for(int j=0;j<=n-i;j++) System.out.print(" ");
			for(int j=1;j<=2 * i -1;j++) System.out.print("*");
			System.out.println();
		}
	}
	static void LeftAgle(int n){
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++) System.out.print("*");
			System.out.println();
		}
	}
}
