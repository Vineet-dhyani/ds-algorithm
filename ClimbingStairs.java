package name_info;

public class ClimbingStairs {
        static void climibingStairs(int n) {
        	int dp[]=new int[n+1];
        	dp[0]=1;
        	for(int i=1;i<=n;i++) {
        		if(i==1) {
        		 dp[i]=dp[i-1];
        		}else if(i==2) {
        			dp[i]=dp[i-1]+dp[i-2];
        		}else {
        		dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
        	}}
        	System.out.println(dp[n]);
        
        	}
	public static void main(String args[] ){
		int n=10;
		climibingStairs(n);
	}
}
