package com.Easy;

import java.util.Scanner;

public class KadensAlgo 
{
	 public static int maxSubArray(int[] nums) {
	        int sum=0;
	        int maxSum=Integer.MIN_VALUE;
	        for(int i=0;i<nums.length;i++)
	        {
	            sum+=nums[i];
	            if(sum>maxSum)
	            {
	                maxSum=sum;
	            }
	            if(sum<0)
	            {
	                sum=0;
	            }
	        }
	        return maxSum;
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
		int sum=maxSubArray(a);
		System.out.println(sum);

	}

}
