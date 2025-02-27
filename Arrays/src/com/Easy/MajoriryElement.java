package com.Easy;

import java.util.Scanner;

public class MajoriryElement 
{
	public static int fun(int[] nums) 
    {
        int count=0;
        int ele=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if(count==0)
            {
                ele=nums[i];
                count=1;
            }
            else if(nums[i]==ele)
            {
                count++;
            }
            else
            {
                count--;
            }
        }
        return ele;
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
		int ele=fun(a);
		System.out.println(ele);

	}

}
