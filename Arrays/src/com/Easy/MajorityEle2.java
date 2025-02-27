package com.Easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MajorityEle2 
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
		boolean flag=false;
		Map<Integer,Integer>map=new HashMap<>();
		for(int ele : a)
		{
			map.put(ele, map.getOrDefault(ele, 0)+1);
		}
		for(int ele : a)
		{
			if(map.get(ele)>n/3)
			{
				flag=true;
				System.out.println(ele);
				break;
			}
		}
		if(!flag)
		{
			System.out.println("No Majority ele Exists");
		}
	}

}
