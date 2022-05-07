package name_info;

import java.util.HashSet;
import java.util.Scanner;

public class WordBreakProblem {
	public static boolean solution(String sentence,HashSet<String> dictionary) {
		int dp[]=new int [sentence.length()];
		
		for(int i=0;i<dp.length;i++) {
			for(int j=0;j<=i;j++) {
				
				String w2check =sentence.substring(j,i+1);
				
				if(dictionary.contains(w2check)) {
					if(j>0) {
						dp[i]+=dp[j-1];
						
						
					}else {
						dp[i]+=1;
						
					}
				}
			}
		}
		
		return dp[sentence.length()-1]>0;
	}

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		HashSet<String> dictionary=new HashSet<String>();
		for(int i=0;i<n;i++) {
			dictionary.add(sc.next());
		}
		String sentence=sc.next();
		System.out.println(solution(sentence,dictionary));
	}
}
