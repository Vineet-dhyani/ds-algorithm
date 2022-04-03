package upgrad.com;

public class SortedMatrix {
	public void Search(int[][] matrix,int n,int x) {
	int i=0;
	int j=n-1;
	while(i<4&&j>=0) {
		if(matrix[i][j]==x) {
			System.out.println("X found at->"+i+","+j);
			return;
		}
		if(matrix[i][j]>x) {
			j--;
		}else {
			i++;
		}
	}
	System.out.println("value not found");
	}
public void SpiralPrint(int[][] matrix,int r,int c) {
	int i,k=0,l=0;
	while(k<r&&l<c) {
		for(i=l;i<c;i++) {
			System.out.println(matrix[k][i]+" ");
			}
		k++;
		for(i=k;i<r;i++) {
			System.out.println(matrix[i][c-1]+" ");
			}
		c--;
		if(k<r) {
			for(i=c-1;i>=l;i--) {
				System.out.println(matrix[r-1][i]+" ");
			}
			r--;
		}
		if(l<c) {
			for(i=r-1;i>=k;i--) {
				System.out.println(matrix[i][l]+" ");
			}
			l++;
		}
	}
}
	public static void main(String args[]) {
int[][] matrix= {
		{10,20,30,40},
		{15,25,35,45},
		{27,29,37,48},
		{32,33,39,51}};
SortedMatrix sm=new SortedMatrix();

sm.Search(matrix,matrix.length,32);
sm.SpiralPrint(matrix, matrix.length,matrix.length);
		
}
	}
