package upgrad.com;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.*;
public class qqueue{
private ListNode front;
private ListNode rear;
private int length;
public qqueue() {
	this.front=null;
	this.rear=null;
	length=0;
}
private class ListNode{
	 private ListNode next;
	 private int data;
	 public ListNode(int data) {
		 this.data=data;
		 this.next=null;
	 }
}
public int length() {
	return length;
}
public boolean isEmpty() {
	return length==0;
}
public  void enqueue(int data) {
	ListNode temp=new ListNode(data);
	if(isEmpty()) {
		front=temp;
	}else {
		rear.next=temp;
	}
	rear=temp;
	length++;
}
public void print() {
	if(isEmpty()) {
		return;
	}
	ListNode current=front;
	while(current!=null) {
		System.out.print(current.data+" -->");
		current=current.next;
	}System.out.println("null");
}
public int dequeue() {
	if(isEmpty()) {
		throw new NoSuchElementException("Queue is empty");
	}
	int result=front.data;
	front=front.next;
	if(front==null) {
		rear=null;
	}
	length--;
	return result;
}
public int  first() {
	if(isEmpty()) {
		throw new NoSuchElementException("Queue is empty");
	}
	return front.data;
}
public int  last() {
	if(isEmpty()) {
		throw new NoSuchElementException("Queue is empty");
	}
	return rear.data;
}
public  String[] generatebinaryNumbers(int n) {
	String[] result=new String[n];
	Queue<String> q=new LinkedList<>();
	q.offer("1");
	for(int i=0;i<n;i++) {
		result[i]=q.poll();
		String n1=result[i]+"0";
		String n2=result[i]+"1";
		q.offer(n1);
		q.offer(n2);
	}
	return result;
	
		
}
public static void main(String args[]) {
	qqueue queue=new qqueue();
	String result[]=queue.generatebinaryNumbers(4);
	for(int i=0;i<result.length;i++) {
		System.out.println(result[i]);
	}
}
}
