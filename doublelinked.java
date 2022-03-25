package upgrad.com;

import java.util.NoSuchElementException;

public class doublelinked {
	private  ListNode tail;
	private ListNode head;
	private int length;
	
	private class ListNode{
private int data;
 private ListNode next;
 private ListNode previous;
 
 public ListNode(int data) {
	 this.data=data;
 }
}
	public doublelinked() {
		this.head=null;
		this.tail=null;
		this.length=0;
	}
	public boolean isEmpty() {
		return length==0;
	}
	public int length() {
		return length;
		
	}
	public void insertfirst(int value) {
		ListNode newNode=new ListNode(value);
		if(isEmpty()) {
			tail=newNode;
		}else {
			head.previous=newNode;
		}
		newNode.next=head;
		head=newNode;
	    length++;
     	}
	
public void insertLast(int value) {
		ListNode newNode=new ListNode(value);
		if(isEmpty()){
			head=newNode;
		}else {
			tail.next=newNode;
		newNode.previous=tail;
		}
		tail=newNode;
		length++;
	}

public void displayforward() {
	if(head==null) {
		return;
	}
	ListNode temp=head;
	while(temp!=null) {
		System.out.print(temp.data+"-->");
		temp=temp.next;
	}
	System.out.println("null");
	
}

public void displaybackward() {
	if(tail==null) {
		return;
	}
	ListNode temp=tail;
	while(temp!=null) {
		System.out.print(temp.data+"-->");
		temp=temp.previous;
	}
	System.out.println("null");
}
public ListNode deletefirst() {
	if(isEmpty()) {
		throw new NoSuchElementException();
	}
	ListNode temp=head;
	if(head==tail) {
		tail=null;
	}
	else {
		head.next.previous=null;
	}
	head=head.next;
	temp.next=null;
	length--;
	return temp;
}
public ListNode deletelast() {
	if(isEmpty()) {
		throw new NoSuchElementException();
	}
	ListNode temp=tail;
	if(head==tail) {
		head=null;
	}
	else {
	tail.previous.next=null;
	}
	tail=tail.previous;
	temp.previous=null;
	length--;
	return temp;
}
public static void main(String args[]) {
doublelinked dll=new doublelinked();
dll.insertLast(1);
dll.insertLast(10);
dll.insertLast(15);
dll.displayforward();
dll.deletelast();
dll.displayforward();



}
}