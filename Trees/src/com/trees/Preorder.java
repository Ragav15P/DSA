package com.trees;

import java.util.Scanner;

class Node1
{
	int data;
	Node left;
	Node right;
	Node1(int data)
	{
		this.data=data;
		left=null;
		right=null;
	}
}
class BinaryTree1
{
	Node root;
	BinaryTree1()
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
	void preOrder()
	{
		preorderRec(root);
	}
	void preorderRec(Node root)
	{
		if(root==null)
		{
			return;
		}
		System.out.print(root.data+" ");
		preorderRec(root.left);
//		System.out.print(root.data+" ");
		preorderRec(root.right);
	}
}

public class Preorder 
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
		  BinaryTree1 obj=new BinaryTree1();
		  for(int i=0;i<n;i++) {
		  obj.insert(a[i]);
		  }
		  obj.preOrder();
		  
	}

}
