package CODE.Tasks;

import java.util.Arrays;

public class RotateArray {
	//Rotate Array by k positions
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		rotate(arr, 2);
		System.out.println(Arrays.toString(arr));
	}
	static void rotate(int[] arr, int k) {
		int n = arr.length;
		k = k % n;
		if(k == 0) return;
		reverse(arr,0,n-1);
		reverse(arr,0,k-1);
		reverse(arr,k,n-1);
	}
	static void reverse(int[] arr, int l,int r){
		while(l < r) {
			int t = arr[l];
			arr[l] = arr[r];
			arr[r] = t;
			l++;
			r--;
		}
	}

}
