import java.util.ArrayList;
import java.util.Arrays;

public class Arrya2ndLargest {

	public static void main(String args[]) {
		
		int arr[] = {12,23,43,1,7,6,6,6,4,23,45,34,34,45,21,12,11,42,43};
		int arr1[] = {12,13,14,15,16};
		//Arrays.sort(arr);
		//Arrays.sort(arr1);
		int max =0;
		int res=-1;
		int res1[] = new int[arr.length+arr1.length];
		
		for(int i=0;i<arr.length;i++) {
			res1[i]=arr[i];
			max++;
		}
		for(int i=0;i<arr1.length;i++) {
			res1[max++]=arr1[i];
		}
		Arrays.sort(res1);
		for(int i=0;i<res1.length;i++) {
			System.out.println(res1[i]);
		}
		
		
		
	/*	
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
			if(arr[i]!=max && arr[i]>res) {
				res=arr[i];
			}
		}
		System.out.println("Largest element "+max);
		System.out.println("2nd Largest element "+res);
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(0, 5);
	
		for(int i:list) {
			System.out.println(i);
		}
		String s ="Hi my name is Ankit Abhishek";
		StringBuilder s1= new StringBuilder(s);
		s1.reverse();
		s = s1.toString();
		System.out.println(s);
		*/
		
	}
}
