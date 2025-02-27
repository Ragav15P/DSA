package com.Easy;
import java.util.*;

public class BestTimeSellStock
{
	public static int maxProfit(int a[])
	{
		int minCost=a[0];
		int maxProfit1=Integer.MIN_VALUE;
		for(int i=1;i<a.length;i++)
		{
			int tempProfit=a[i]-minCost;
			maxProfit1=Math.max(maxProfit1, tempProfit);
			minCost=Math.min(minCost, a[i]);
		
		}
		return maxProfit1;
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
			int profit=maxProfit(a);
					System.out.println(profit);

	}

}
