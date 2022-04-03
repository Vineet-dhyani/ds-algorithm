package upgrad.com;

public class binarySearchTree {

private TreeNode root;

private class TreeNode{
	private int data;
	private TreeNode left;
	private TreeNode right;
	
	public TreeNode (int data) {
		this.data=data;
	}
}

public void insert(int value) {
	root =insert(root,value);
}
public TreeNode insert(TreeNode root,int value) {
	if(root==null) {
		root=new TreeNode(value);
		return root;
	}
	if(value <root.data) {
		root.left=insert(root.left,value);
	}
	else {
		root.right=insert(root.right,value);
	}
	return root;
}
public void inOrder() {
	inOrder(root);
}
public void inOrder(TreeNode root) {
	if(root==null) {
		return;
	}
	inOrder(root.left);
	System.out.print(root.data);
	inOrder(root.right);
	
}
public TreeNode search(int key) {
	return search(root,key);
}
public TreeNode search(TreeNode root,int key) {
	if(root==null||root.data==key) {
		return root;
	}
	if(key<root.data) {
	return	search(root.left,key);
	}
	else {
		return search(root.right,key);
	}
}
public boolean isValid(TreeNode root,long min,long max) {
if(root==null) {
	return true;
}
if(root.data<=min||root.data>=max) {
	return false;
}
boolean left=isValid(root.left,min,root.data);
if(left) {
	boolean right=isValid(root.right,root.data,max);
	return right;
}
return  false;
}
public void createBinarySearchtree() {
	 TreeNode first=new TreeNode(5);
	 TreeNode second=new TreeNode(2);
	 TreeNode third=new TreeNode(6);
	 TreeNode fourth=new TreeNode(1);
	 TreeNode fifth=new TreeNode(3);
	 
	 
	 root=first;
	 first.left=second;
	 first.right=third;
	 second.left=fourth;
	second.right=fifth;
	
}
public static void main(String[] args) {
	binarySearchTree bst=new binarySearchTree();
	bst.createBinarySearchtree();
	bst.inOrder();
	if(false!=bst.isValid(bst.root,Long.MIN_VALUE,Long.MAX_VALUE)) {
		System.out.println("valid");
	}
	else {
		System.out.println("not valid ");
	}
}
}