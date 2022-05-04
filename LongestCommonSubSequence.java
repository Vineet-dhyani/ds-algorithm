package name_info;

import java.util.Random;
import java.util.Scanner;
public class LongestCommonSubSequence {

static void LongestCommonSubSequence(char [] X,char [] Y ) {
int l[][]=new int[X.length+1][Y.length+1];
for(int i=0;i<=X.length;i++) {
	for(int j=0;j<=Y.length;j++) {
		if(i==0||j==0) {
			l[i][j]=0;
		}
		else if(X[i-1]==Y[j-1]){
			l[i][j]=l[i-1][j-1]+1;
			
		}else {
			l[i][j]=max(l[i-1][j],l[i][j-1]);
		}
	}
}System.out.println(l[X.length][Y.length]);
}
static int max(int a,int b){
	return (a>b)?a:b;
}



public static void main(String[] args) {
     
        
        Scanner sc = new Scanner(System.in);
        String x= "abaaba";
        String y= "babbab";
        char []X=x.toCharArray();
        char []Y=y.toCharArray();
        LongestCommonSubSequence(X,Y);
     
    }
}