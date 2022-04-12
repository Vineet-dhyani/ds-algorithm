package upgrad.com;
 
public class DifferentTypesOFSorting {
public  void Bubblesort(int []arr) {
	int n=arr.length;
	boolean isSwapped;
	
	for(int i=0;i<n;i++) {
		isSwapped=false;
		for(int j=0;j<n-1-i;j++) {
			if(arr[j]>arr[j+1]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				isSwapped=true;
			}
		}
		if(isSwapped==false) {
			break;
		}
	}
}
public void InsertionSort(int arr[]) {
	int n=arr.length;
	for(int i=1;i<n;i++) {
		int temp=arr[i];
		int j=i-1;
		while(j>=0&&arr[j]>temp) {
			arr[j+1]=arr[j];
			j=j-1;
		}
		arr[j+1]=temp;
	}
}
public void Selectionsort(int arr[]) {
	int n=arr.length;
	for(int i=0;i<n-1;i++) {
		int min=i;
		for(int j=i+1;j<n;j++) {
			if(arr[j]<arr[min]) {
				min=j;
			}
		}
		int temp=arr[min];
		arr[min]=arr[i];
		arr[i]=temp;
	}
}
public int[] MergeTwoSortedArray(int[] arr1,int[] arr2,int n,int m) {
	int[] result=new int[n+m];
	int i=0;int j=0;int k=0;
	while(i<n&&j<n) {
		if(arr1[i]<arr2[j]) {
		result[k]=arr1[i];
		i++;
		
	}else {
		result[k]=arr2[j];
		j++;
	}
	k++;
	}
	while(i<n) {
		result[k]=arr1[i];
		i++;k++;
	}
	while(j<n) {
		result[k]=arr2[j];
		j++;k++;
	}
	return result;
}

public void Msort(int arr[],int temp[],int low,int high) {
	if(low<high) {
		int mid=low+(high-low)/2;
		Msort(arr,temp,low,mid);
		Msort(arr,temp,mid+1,high);
		MergeSort(arr,temp,low,mid,high);
		
	}
}

private void MergeSort(int[] arr, int[] temp, int low, int mid, int high) {
	for(int i=low; i<=high;i++) {
		temp[i]=arr[i];
	}
	int i=low;
	int j=mid+1;
	int k=low;
	while(i<=mid && j<=high) {
		if(temp[i]<=temp[j]) {
			arr[k]=temp[i];
			i++;
		}else {
			arr[k]=temp[j];
			j++;
		}
		k++;
	}
	while(i<=mid) {
		arr[k]=temp[i];
		k++;
		i++;
	}
	
}
public void ThreeNumberSort_dutchNTnlFlagPrblm(int[] arr) {
	int i=0;
	int j=0;
	int k=arr.length-1;
	while(i<=k) {
		if(arr[i]==0) {
		swap(arr,i,j);
		i++;
		j++;
		}
	else if(arr[i]==1) {
		i++;
	}else if(arr[i]==2) {
		swap(arr,i,k);
		k--;
	}
}}
private void swap(int[] arr,int i,int j) {
	int temp=arr[i];
	arr[i]=arr[j];
	arr[j]=temp;
}
	
public void QuickSort(int[] arr,int low ,int high) {
	if(low<high) {
		int p=QuickSortpartition(arr,low,high);
		QuickSort(arr,low,p-1);
	QuickSort(arr,p+1,high);
	}
}


private int QuickSortpartition(int[] arr, int low, int high) {
	int pivot=arr[high];
	int i=low;
	int j=low;
	while(i<=high) {
		if(arr[i]<=pivot) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			j++;
			
		}
		i++;
	}
	return j-1;
	
}
public static int[] SortedSquares(int[] arr) {
	int n=arr.length;
	int i=0;
	int j=n-1;
	int[] result=new  int[n];
	
	for(int k=n-1;k>=0;k--) {
		if(Math.abs(arr[i])>(Math.abs(arr[j]))){
			result[k]=arr[i]*arr[i];
			i++;
		}else {
			result[k]=arr[j]*arr[j];
			j--;
		}
	}
	return result;
}

public void RearrangrSortedArrrayInMaxMin(int arr[]) {
	int maxIdx=arr.length-1;
	int minIdx=0;
	int max=arr[maxIdx]+1;
	for(int i=0;i<arr.length;i++) {
		if(i%2==0) {
			arr[i]=arr[i]+(arr[maxIdx]%max)*max;
			maxIdx--;
		}else {
			arr[i]=arr[i]+(arr[minIdx]%max)*max;
			minIdx++;
		}
			}
	for(int i=0;i<arr.length;i++) {
		arr[i]=arr[i]/max;
	}
}
public void printArray(int arr[]) {
	int n=arr.length;
	for(int i=0;i<n;i++) {
		System.out.print(arr[i]+" ");
	}
	System.out.println();
}
public static void main(String []args) {
	
	int arr[]=new int [] {2,3,5,6,8,9};
	DifferentTypesOFSorting obj=new DifferentTypesOFSorting();
obj.RearrangrSortedArrrayInMaxMin(arr);

obj.printArray(arr);
}
}
