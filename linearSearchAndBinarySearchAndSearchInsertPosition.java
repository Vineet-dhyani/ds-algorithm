package upgrad.com;

public class linearSearchAndBinarySearchAndSearchInsertPosition {
public int Linearsearch(int[] arr,int n,int x) {
	for(int i=0;i<n;i++) {
		if(arr[i]==x) {
			return 1;
		}
	}return -1;
}
public int binarySearch(int[] nums,int key) {
	int low=0;
	int high=nums.length-1;
	while(low<=high) {
		int mid=(high+low)/2;
		if(nums[mid]==key) {
			return mid;
		}
		if(nums[mid]>key) {
			high=mid-1;
		}else {
			low=mid+1;
		}
	}return -1;
}
public int SearchInsertPosition(int[] arr,int target) {
	int low=0;
	int high=arr.length-1;
	while(low<=high) {
		int mid=low+(high-low)/2;
		if(arr[mid]==target) {
			return mid;
		}
		if(arr[mid]>target) {
			high=mid-1;
		}else {
			low=mid+1;
		}
	}return low;
}
public static void main(String[] args) {
	int[] arr= {5,1,9,2,10,15,20};
	linearSearchAndBinarySearchAndSearchInsertPosition lsbs=new linearSearchAndBinarySearchAndSearchInsertPosition();
	System.out.println(lsbs.Linearsearch(arr, arr.length, 110));
	int nums[]= {1,10,20,47,59,65,75,88,99};
	System.out.println(lsbs.binarySearch(nums,65));
	int arr1[]= {1,10,20,47,59,65,75,88,99};
	System.out.println(lsbs.SearchInsertPosition(arr1,0));
}
}
