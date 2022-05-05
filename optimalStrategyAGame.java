package name_info;

import java.util.Scanner;
public class optimalStrategyAGame {
public static void optimalStartegy(int arr[]) {
	int dp[][]=new int[arr.length][arr.length];
	
	for(int g=0;g<dp.length;g++) {
		for(int i=0,j=g;j<dp.length;i++,j++) {
			if(g==0) {
				dp[i][j]=arr[i];
			}else if(g==1){
				dp[i][j]=Math.max(arr[i],arr[j]);
			}else {
				int val1=arr[i]+Math.min(dp[i+2][j],dp[i+1][j-1]);
				int val2=arr[j]+Math.min(dp[i+1][j-1],dp[i][j-2]);
				int val=Math.max(val1, val2);
				dp[i][j]=val;
				
			}
		}
	}
	
System.out.println(dp[0][arr.length-1])	;
}
	
	public static void main(String args[]) {

        int arr1[] = { 20,30,2,10 };
        int n = arr1.length;
	optimalStartegy(arr1);
}
}
