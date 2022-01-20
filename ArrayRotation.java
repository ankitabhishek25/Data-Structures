public class ArrayRotation {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		int k=3;
		arr = rotate(arr,k);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	 public static int[] rotate(int[] nums, int k) {
	        if(nums.length <= 1){
	            return nums;
	        }
	        //step each time to move
	        int step = k % nums.length;
	        System.out.println(step);
	        
	        int[] tmp = new int[step];
	        for(int i = 0; i < step; i++){
	            tmp[i] = nums[nums.length - step + i];
	        }
	        for(int i = nums.length - step - 1; i >= 0; i--){
	            nums[i + step] = nums[i];
	        }
	        for(int i = 0; i < step; i++){
	            nums[i] = tmp[i];
	        }
	        return nums;
	    }

}
