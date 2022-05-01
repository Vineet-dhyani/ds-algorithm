package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class maximumProductQuadruple {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n  = sc.nextInt();
	        int arr[] = new int[n];

	        for(int i = 0; i<n;i++){
	            arr[i] = sc.nextInt();
	        }

	        int max =  maxProdQuad(n,arr);
	        if(max == -1)
	            System.out.println("No Maximum Product Quadruple");
	        else
	            System.out.println(max);

	    }
	    static int maxProdQuad(int n, int[] arr){
	    	if (n < 4)
	            return -1;
	     
		Arrays.sort(arr);
int x=arr[n-1]*arr[n-2]*arr[n-3]*arr[n-4];
int y=arr[0]*arr[1]*arr[2]*arr[3];
int z=arr[0]*arr[1]*arr[n-1]*arr[n-2];
return Math.max(x, Math.max(y, z));

		
	    }
	}
	    



