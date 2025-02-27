package com.Easy;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LongestConsecutiveSeq 
{
	public static int fun(int a[])
	{
		if(a.length==0)
		{
			return 0;
		}
		Set<Integer>set=new HashSet<>();
		for(int ele : a)
		{
			set.add(ele);
		}
		int maxLength=0;
		for(int ele:set)
		{
			if(!set.contains(ele-1))
			{
				int curr=ele;
				int len=1;
				while(set.contains(curr+1))
				{
					curr++;
					len++;
				}
				maxLength=Math.max(maxLength, len);
			}
		}
		return maxLength;
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
		int maxLength=fun(a);
		System.out.println(maxLength);
	}

}
