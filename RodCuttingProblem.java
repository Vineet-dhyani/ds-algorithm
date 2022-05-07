package name_info;

import java.util.Scanner;

public class RodCuttingProblem {
public static int solution(int[] price) {
	int[] np=new int[price.length+1];
	for(int i=0;i<price.length;i++) {
		np[i+1]=price[i];
	}
	int dp[]=new int[np.length];
	dp[0]=0;
	dp[1]=np[1];
	
	for(int i=2;i<dp.length;i++) {
		dp[i]=np[i];
		
		int li=1;
		int ri=i-1;
		while(li<=ri) {
			if(dp[li]+dp[ri]>dp[i]) {
				dp[i]=dp[li]+dp[ri];
			}
			li++;
			ri--;
		}
	}
	return dp[dp.length-1];
	
}
	
	public static void main(String args[]) {
		Scanner sc =new Scanner (System.in);
		int n=sc.nextInt();
	 int []price=new int [n];
	 for(int i=0;i<n;i++) {
		 price[i]=sc.nextInt();
	 }
	 System.out.println(solution(price));
	}
}
