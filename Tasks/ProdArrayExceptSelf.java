<<<<<<< HEAD
package CODE;

public class ProdArrayExceptSelf {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		productExceptSelf(arr);
	}
	static void productExceptSelf(int[] nums) {
        int n = nums.length;

        int[] pref = new int[n];
        int[] suff = new int[n];

        pref[0] = 1;
        suff[n-1] = 1;

        for(int i=1;i<n;i++) pref[i] = pref[i-1] * nums[i-1];
        for(int i=n-2;i>=0;i--) suff[i] = suff[i + 1] * nums[i + 1];
        
        for(int i=0;i<n;i++) suff[i] *= pref[i];

		for(int ele : suff) System.out.print(ele + " ");
    }

}
=======
package CODE;

public class ProdArrayExceptSelf {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		productExceptSelf(arr);
	}
	static void productExceptSelf(int[] nums) {
        int n = nums.length;

        int[] pref = new int[n];
        int[] suff = new int[n];

        pref[0] = 1;
        suff[n-1] = 1;

        for(int i=1;i<n;i++) pref[i] = pref[i-1] * nums[i-1];
        for(int i=n-2;i>=0;i--) suff[i] = suff[i + 1] * nums[i + 1];
        
        for(int i=0;i<n;i++) suff[i] *= pref[i];

		for(int ele : suff) System.out.print(ele + " ");
    }

}
>>>>>>> 292d80c519a2fd70c07344be1d914a84873876e1
