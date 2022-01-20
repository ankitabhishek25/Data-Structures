import java.util.HashSet;
import java.util.Set;

//Return First repeating element from array

public class FirstRepeatingNumber {

	public static void main(String[] args) {
		
		int arr[] = new int[] {2,5,1,4,3,5,1,2,4};
		
		Set<Integer> set = new HashSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			if(set.contains(arr[i])) {
				System.out.println("The first repeating character is :"+arr[i]);
				break;
			}
			else {
				set.add(arr[i]);
			}
			if(i==arr.length-1) {
				System.out.print("Undenfined");
			}
		}
		
	}

}
