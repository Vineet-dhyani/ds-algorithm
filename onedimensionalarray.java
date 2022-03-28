package upgrad.com;

public class onedimensionalarray {
public static void printArray(int[] arr) {
	int n=arr.length;
	for(int i=0;i<n;i++) {
		System.out.print(arr[i]+" ");
	}
	System.out.println();
}

public void arrayDemo() {
	int[] myArray=new int [5];
   myArray[0]=5;
   myArray[1]=1;
   myArray[2]=6;
   myArray[3]=3;
   myArray[4]=10;
   
   printArray(myArray);
   
  //System.out.print( myArray.length);
}
public static int[] removeEven(int[] arr) {
	int oddCount=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]%2!=0) {
			oddCount++;
		}
		}
	int result[]=new int[oddCount];
int idx=0;
for(int i=0;i<arr.length;i++) {
	if(arr[i]%2!=0) {
	result[idx]=arr[i];
	idx++;
}}
return result;
}
public static void reverse(int[]numbers, int start,int end) {
	while(start<end) {
		int temp=numbers[start];
		numbers[start]=numbers[end];
		numbers[end]=temp;
		start++;
		end--;
	}
}
public  int findMinimun(int arr[] ) {
	if(arr==null||arr.length==0) {
		throw new IllegalArgumentException("invalid input");
	}
	int min=arr[0];
	for(int i=1;i<arr.length;i++) {
		if(arr[i]<min) {
			min=arr[i];
		}
	}
	return min;
}
public  int findSecondMax(int arr[] ) {
	if(arr==null||arr.length==0) {
		throw new IllegalArgumentException("invalid input");
	}
	int max=Integer.MIN_VALUE;
	int Secondmax=Integer.MIN_VALUE;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>max) {
			Secondmax=max;
			max=arr[i];
			
		}else if(arr[i]>Secondmax&&arr[i]!=max) {
			Secondmax=arr[i];
		}
	}
	return Secondmax;
}
public void moveZeros(int arr[],int n) {
	int j=0;
	for(int i=0;i<n;i++) {
		if(arr[i]!=0&&arr[j]==0) {
		int	temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
			
		}
		if(arr[j]!=0) {
			j++;
		}
	}
}
public int[] resize(int[] arr,int capacity) {
	int[] temp=new int[capacity];
	for(int i=0;i<arr.length;i++) {
	temp[i]=arr[i];
	
	}
	arr=temp;
	return arr;
	}
public static  int findMissingNumber(int arr[]) {
	int n=arr.length+1;
	int sum=n*(n+1)/2;
	for(int num:arr) {
		sum=sum-num;
		
	}
	return sum;
}
public boolean isPalindrome(String word) {
	char charArray[]=word.toCharArray();
	int start=0;
	int end=word.length()-1;
	while(start<end) {
		if(charArray[start]!=charArray[end]) {
			return false;
		}
		start++;
		end--;
	}
	return true;
	
}
public static void main(String args[]) {
	onedimensionalarray ar=new onedimensionalarray();
    if(ar.isPalindrome("madam")) {
    	System.out.println("the string is palindrome");
    }
    else {
    	System.out.println("the string is not palindrome");
    }
} 
}
