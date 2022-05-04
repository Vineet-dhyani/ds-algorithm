package name_info;

public class MinimumEditdistance {
        static void minimumEditDistance(char[]X,char[]Y) {
        	int dp[][]=new int[X.length+1][Y.length+1];
        	for(int i=0;i<=X.length;i++) {
        		for(int j=0;j<=Y.length;j++) {
        			if(i==0) {
        				dp[i][j]=j;
        			}else if(j==0) {
        				dp[i][j]=i;
        			}else if(X[i-1]==Y[j-1]) {
        				dp[i][j]=dp[i-1][j-1];
        			}else {
        				dp[i][j]=1+min(dp[i-1][j],dp[i][j-1],dp[i-1][j-1]);
        			}
        		}
        	}System.out.println(dp[X.length][Y.length]);
        }
        static int min(int x,int y,int z) {
        	if(x<=y&&x<=z) {
        		return x;
        	}
        	if(y<=x&&y<=z) {
        		return y;
        		
        	}else {
        		return z;
        	}
        }
	public static void main(String args[] ){
		String x= "food";
		String y= "money";
		char X[]=x.toCharArray();
		char Y[]=y.toCharArray();
		minimumEditDistance(X,Y);
	}
}
