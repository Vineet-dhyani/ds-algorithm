package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class zeroOneKnapsackProblem {
	public static int findMaxprofit(Item items[],int capacity) {
		int arr[][]=new int[items.length+1][capacity+1];
		Arrays.sort(items,new sortByWeight());
		for(int i=0;i<items.length+1;i++) {
			arr[i][0]=0;
		}
		for(int j=1;j<capacity+1;j++) {
			arr[0][j]=0;
		}
		for(int i=1;i<items.length+1;i++) {
			for(int j=1;j<capacity+1;j++) {
				if(j<items[i-1].weight) {
					arr[i][j]=arr[i-1][j];
					
				}else {
					arr[i][j]=Math.max((items[i-1].profit+arr[i-1][j-items[i-1].weight]),arr[i-1][j]);
					
				}
			}
		}
		return arr[items.length][capacity];
	}
	
	
	
public static void main(String args[]) {
	
    Scanner sc = new Scanner(System.in);
    System.out.println("enter thr no. of items");
    int n = sc.nextInt();
    Item items []= new Item[n];
    sc.nextLine();
    for (int i = 0; i< n ;i++){
        System.out.println("enter the item "+(i+1)+"weight");
        int weight = sc.nextInt();
        sc.nextLine();
        System.out.println("enter the item "+(i+1)+"profit");
        int profit = sc.nextInt();
        sc.nextLine();
        items[i]= new Item(i,profit,weight);
    }
    System.out.println(findMaxprofit(items,50));

}
}
class Item{
	int id;
	int profit;
	int weight;
	Item(int id,int profit,int weight){
		this.id=id;
		this.profit=profit;
		this.weight=weight;
	}
}
class sortByWeight implements Comparator<Item>{
public int compare(Item a, Item b) {
		
		return a.weight-b.weight;
}
}
