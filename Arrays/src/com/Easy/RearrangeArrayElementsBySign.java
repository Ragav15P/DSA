package com.Easy;

import java.util.Scanner;

public class RearrangeArrayElementsBySign 
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
			int res[]=new int[n];
			int even=0;
			int odd=1;
			for(int ele : a)
			{
				if(ele>0)
				{
					res[even]=ele;
					even+=2;
				}
				else if(ele<0)
				{
					res[odd]=ele;
					odd+=2;
				}
			}
			for(int ele : res)
			{
				System.out.print(ele+" ");
			}
	}

}
