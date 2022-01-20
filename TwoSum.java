import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {

		int arr[] = {2,7,9,11,14,25,40};
		int target = 25;
		int[] twoSum = twoSum(arr,target);
		
		System.out.println(twoSum[0]+" "+twoSum[1]);
		
		
	}
	
	public static int[] twoSum(int arr[],int target) {
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0;i<arr.length;i++) {
			map.put(arr[i], i);
		}
		
		for(int i=0;i<arr.length;i++) {
			int n = target-arr[i];
			
			if(map.containsKey(n) && map.get(n)!= i) {
				return new int[] {i,map.get(n)};
			}
		
		}
	
		return arr;
	}

}
