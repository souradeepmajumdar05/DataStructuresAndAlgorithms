package Arrays;

public class RotateArray {
	public void rotate(int[] nums, int k) {
        int n = nums.length;
        if(k >= n)
            k = k % n;
        int [] res = new int[k];
        int c = 0;
        for(int m = n-k; m < n; m++){
            res[c++] = nums[m];
        }
        c--;
        for(int m = n-1 ; m > k-1; m--){
            nums[m] = nums[m-k];
        }
        for(int m = k-1; m >= 0; m--){
            nums[m] = res[c--];
        }
    }
}
