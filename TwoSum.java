package upgrad.com;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static int[] twosumusingHashMap(int[] number,int target)  {
		int [] result=new int[2];
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<number.length;i++) {
			if(!map.containsKey(target-number[i])) {
				map.put(number[i], i);
			}else {
				result[1]=i;
				result[0]=map.get(target-number[i]);
				return result;
			}
		}
		throw new IllegalArgumentException("two numbers not found");
	}
	public static int[] twosum(int []arr,int target) {
		Arrays.sort(arr);
		int left=0;
		int right=arr.length-1;
		int result[]=new int[2];
		while(left<right) {
			int sum=arr[left]+arr[right];
			if(sum==target) {
				result[0]=arr[left];
				result[1]=arr[right];
				return result;
			}else  if(sum<target) {
				left++;
			}else {
				right--;
			}
		}return new int[0];
	}
	public static void main(String args[]) {
		//int []number= new int[] {2,11,5,10,7,8};
		int arr[]= {11,2,0,10,7,6};
		int result[]=twosum(arr,9);
		System.out.println("the two indices are"+result[0]+" and "+result[1]);
	}
}
