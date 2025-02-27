package com.Easy;

import java.util.Scanner;

public class NextPermutation 
{
	public static void nextPermutation(int a[])
	{
		int index=-1;
		for(int i=a.length-2;i>=0;i--)
		{
			if(a[i]<a[i+1])
			{
				index=i;
				break;
			}
		}
		if(index==-1)
		{
			reverse(a,0,a.length-1);
			return;
		}
		for(int i=a.length-1;i>=index;i--)
		{
			if(a[i]>a[index])
			{
				int temp=a[i];
				a[i]=a[index];
				a[index]=temp;
				break;
			}
		}
		reverse(a,index+1,a.length-1);
	}
	public static void reverse(int a[],int i,int j)
	{
		int low=i;
		int high=j;
		while(low<high)
		{
			int temp=a[low];
			a[low]=a[high];
			a[high]=temp;
			low++;
			high--;
		}
	}

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		nextPermutation(a);
		for(int ele : a)
		{
			System.out.print(ele+" ");
		}

	}

}
