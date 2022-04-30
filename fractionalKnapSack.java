package com.company;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
public class fractionalKnapSack{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of item");
		int n=sc.nextInt();
		
		items arr[]=new items[n];
		sc.nextLine();
		for(int i=0;i<n;i++) {
			System.out.println("enter  item no");
			int itemNo=sc.nextInt();
			sc.nextLine();
			System.out.println("enter the profit of item");
			double profit=sc.nextDouble();
			sc.nextLine();
			System.out.println("enter the weight of item");
			double weight=sc.nextDouble();
			sc.nextLine();
			arr[i]=new items(itemNo,profit,weight);
		}
		double res=maxSack(arr,n);
		System.out.println(res);
	}
	private static double maxSack(items[] arr, int n) {
		Arrays.sort(arr,new sortByRatio());
		int capacity=50;
		double maxProfit=0;
		for(int i=0;i<n;i++) {
			  System.out.println(arr[i].itemNo+" "+arr[i].profit+" "+arr[i].weight);
			  
		}
		System.out.println("capacity"+":"+capacity);
		for(int i=0;i<n;i++) {
			if(capacity<arr[i].weight&&capacity>0) {
				double ratio=arr[i].profit/arr[i].weight;
			double tempprofit=	ratio*capacity;
			maxProfit+=tempprofit;
			capacity-=arr[i].weight;
			System.out.println("2"+"->"+capacity+" "+maxProfit);
			}
			
			if(capacity>0) {
				
				maxProfit+=arr[i].profit;
				capacity-=arr[i].weight;
				System.out.println(capacity+" "+maxProfit);
			
			}
		}
		return maxProfit;
		
		
		
		
	}}
	class sortByRatio implements Comparator<items>{

		@Override
		public int compare(items a, items b) {
		
			return (int) ((b.profit/b.weight)-(a.profit/a.weight));
			
		}
		
	}

	
	class items{
		int itemNo;
		double profit;
		double weight;
	
		items(int itemNo,double profit,double weight){
			this.itemNo=itemNo;
			this.profit=profit;
			this.weight=weight;
		}
	}
	
