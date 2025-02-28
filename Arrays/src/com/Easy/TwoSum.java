package com.Easy;
import java.util.*;

public class TwoSum {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		boolean flag=false;
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		Arrays.sort(a);
		int k=s.nextInt();
		int low=0;
		int high=n-1;
		while(low<high)
		{
			if(a[low]+a[high]==k)
			{
				System.out.println("true");
				flag=true;
				break;
			}
			else if(a[low]+a[high]<k)
			{
				low++;
			}
			else
			{
				high--;
			}
		}
		if(!flag)
		{
			System.out.println("false");
		}

	}

}
