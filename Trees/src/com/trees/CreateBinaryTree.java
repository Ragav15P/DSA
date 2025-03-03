package com.trees;
import java.util.*;

class Node
{
	int data;
	Node left;
	Node right;
	Node(int data)
	{
		this.data=data;
		left=null;
		right=null;
	}
}
class BinaryTree
{
	Node root;
	BinaryTree()
	{
		root=null;
	}
	void insert(int data)
	{
		root=insertRec(root,data);
	}
	Node insertRec(Node root,int data)
	{
		if(root==null)
		{
			root=new Node(data);
			return root;
		}
		if(data<root.data)
		{
			root.left=insertRec(root.left,data);
		}
		if(data>root.data)
		{
			root.right=insertRec(root.right,data);
		}
		return root;
	}
	void inorder()
	{
		inorderRec(root);
	}
	void inorderRec(Node root)
	{
		if(root==null)
		{
			return;
		}
		inorderRec(root.left);
		System.out.print(root.data+" ");
		inorderRec(root.right);
	}
}

public class CreateBinaryTree 
{

	public static void main(String[] args) 
	{
	  Scanner s=new Scanner(System.in);
	  int n=s.nextInt();
	  int a[]=new int[n];
	  for(int i=0;i<n;i++)
	  {
		  a[i]=s.nextInt();
		  
	  }
	  BinaryTree obj=new BinaryTree();
	  for(int i=0;i<n;i++) {
	  obj.insert(a[i]);
	  }
	  obj.inorder();
	  

	}

}
